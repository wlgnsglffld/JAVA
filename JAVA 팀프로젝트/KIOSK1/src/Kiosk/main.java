package Kiosk;
import java.util.Scanner;

public class main{
		 private static final String[] Categories = {"한식", "중식", "양식", "일식"};
		    private static final String[][] menu = {
		            {"비빔밥", "국밥", "불고기", "김치찌개"},
		            {"짜장면", "짬뽕", "탕수육", "짬짜면"},
		            {"스테이크", "파스타", "피자", "샐러드"},
		            {"초밥", "라멘", "우동", "돈까스"}
		    };
		    private static final int[][] prices = {
		            {9000, 8000, 10000, 8000},
		            {7000, 8000, 10000, 7500},
		            {25000, 12000, 14000, 7000},
		            {15000, 7000, 7000, 1000}
		    };
		    private static int[][] stock = {
		            {10, 10, 10, 10,},
		            {10, 10, 10, 10,},
		            {10, 10, 10, 10,},
		            {10, 10, 10, 10,}
		    };
		    private static int totalSales = 0;
		    private static int revenue = 0;
		    private static int[][] salesCount = new int[Categories.length][menu[0].length];

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("음식의 종류를 입력하세요 (한식, 중식, 양식, 일식)");
		            System.out.println("관리자 모드로 전환하려면 (관리자 입력)");
		            String cuisine = scanner.nextLine();

		            if (cuisine.equalsIgnoreCase("관리자")) {
		                System.out.println("관리자 모드입니다. 비밀번호를 입력하세요:");

		                String password = scanner.nextLine();

		                if (password.equals("123")) {
		                    adminMode(scanner);
		                    continue;
		                } else {
		                    System.out.println("비밀번호가 틀렸습니다");
		                }
		                continue;
		            }

		            boolean validCuisine = isValidCuisine(cuisine);

		            if (!validCuisine) {
		                System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
		                continue;
		            }

		            if (cuisine.equalsIgnoreCase("뒤로")) {
		                continue;
		            }

		            while (true) {
		                int cuisineIndex = getCuisineIndex(cuisine);
		                showMenu(cuisineIndex);

		                System.out.println("음식의 메뉴를 입력하세요 (뒤로: 종류 선택으로 돌아가기):");
		                String selectedMenu = scanner.nextLine();

		                if (selectedMenu.equalsIgnoreCase("뒤로")) {
		                    break;
		                }

		                int menuIndex = getMenuIndex(cuisineIndex, selectedMenu);
		                if (menuIndex == -1) {
		                    System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
		                    continue;
		                }

		                if (stock[cuisineIndex][menuIndex] <= 0) {
		                    System.out.println("해당 음식은 품절되었습니다. 다른 음식을 선택해주세요.");
		                    continue;
		                }

		                System.out.println("수량을 입력하세요:");
		                int quantity = scanner.nextInt();
		                scanner.nextLine();

		                int price = prices[cuisineIndex][menuIndex];
		                int subtotal = price * quantity;
		                totalSales += subtotal;

		                salesCount[cuisineIndex][menuIndex] += quantity;
		                stock[cuisineIndex][menuIndex] -= quantity;

		                System.out.println("주문이 완료되었습니다.");
		                System.out.println("소계: " + subtotal + "원");

		                System.out.println("계속 주문하시겠습니까? (예, 아니오)");
		                String orderAgain = scanner.nextLine();
		                if (orderAgain.equalsIgnoreCase("아니오")) {
		                    processPayment(scanner);
		                    break;
		                }
		            }
		        }
		    }

		    private static boolean isValidCuisine(String cuisine) {
		        for (String category : Categories) {
		            if (category.equals(cuisine)) {
		                return true;
		            }
		        }
		        return false;
		    }

		    private static int getCuisineIndex(String cuisine) {
		        for (int i = 0; i < Categories.length; i++) {
		            if (Categories[i].equals(cuisine)) {
		                return i;
		            }
		        }
		        return -1;
		    }

		    private static void showMenu(int cuisineIndex) {
		        System.out.println("= " + Categories[cuisineIndex] + " 메뉴 =");
		        for (int i = 0; i < menu[cuisineIndex].length; i++) {
		            System.out.println(i + 1 + ". " + menu[cuisineIndex][i] + " - " + prices[cuisineIndex][i] + "원");
		        }
		        System.out.println("=====================");
		    }

		    private static int getMenuIndex(int cuisineIndex, String selectedMenu) {
		        for (int i = 0; i < menu[cuisineIndex].length; i++) {
		            if (menu[cuisineIndex][i].equals(selectedMenu)) {
		                return i;
		            }
		        }
		        return -1;
		    }

		    private static void adminMode(Scanner scanner) {
		        System.out.println("관리자 모드입니다. 다음 중 선택하세요:");
		        System.out.println("1. 매출 확인");
		        System.out.println("2. 재고 확인");
		        System.out.println("3. 종료");

		        int adminOption;
		        while (true) {
		            if (scanner.hasNextInt()) {
		                adminOption = scanner.nextInt();
		                scanner.nextLine();
		                if (adminOption < 1 || adminOption > 3) {
		                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		                    continue;
		                }
		                break;
		            } else {
		                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		                scanner.next();
		            }
		        }

		        if (adminOption == 1) {
		            showSales();
		        } else if (adminOption == 2) {
		            showStock();
		        } else if (adminOption == 3) {
		            System.out.println("관리자 모드를 종료합니다.");
		        }
		    }

		    private static void showSales() {
		        System.out.println("= 매출 현황 =");
		        for (int i = 0; i < Categories.length; i++) {
		            System.out.println("[" + Categories[i] + "]");
		            for (int j = 0; j < menu[i].length; j++) {
		                System.out.println(menu[i][j] + ": " + salesCount[i][j] + "개");
		            }
		            System.out.println();
		        }
		        System.out.println("총 매출: " + totalSales + "원");
		    }

		    private static void showStock() {
		        System.out.println("= 재고 현황 =");
		        for (int i = 0; i < Categories.length; i++) {
		            System.out.println("[" + Categories[i] + "]");
		            for (int j = 0; j < menu[i].length; j++) {
		                System.out.println(menu[i][j] + ": " + stock[i][j] + "개");
		            }
		            System.out.println();
		        }
		    }

		    private static void processPayment(Scanner scanner) {
		        System.out.println("총 결제금액: " + totalSales + "원");
		        System.out.println("결제 방법을 선택하세요:");
		        System.out.println("1. 현금 결제");
		        System.out.println("2. 카드 결제");

		        int paymentOption;
		        while (true) {
		            if (scanner.hasNextInt()) {
		                paymentOption = scanner.nextInt();
		                scanner.nextLine();
		                if (paymentOption < 1 || paymentOption > 2) {
		                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		                    continue;
		                }
		                break;
		            } else {
		                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		                scanner.next();
		            }
		        }

		        if (paymentOption == 1) {
		            receiveCash(scanner);
		        } else if (paymentOption == 2) {
		            receiveCard(scanner);
		        }
		    }

		    private static void receiveCash(Scanner scanner) {
		        System.out.println("현금 결제를 진행합니다.");
		        System.out.println("받은 금액을 입력하세요:");

		        int receivedAmount;
		        while (true) {
		            if (scanner.hasNextInt()) {
		                receivedAmount = scanner.nextInt();
		                scanner.nextLine();
		                if (receivedAmount < totalSales) {
		                    System.out.println("입력한 금액이 부족합니다. 다시 입력해주세요.");
		                    continue;
		                }
		                break;
		            } else {
		                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		                scanner.next();
		            }
		        }

		        int change = receivedAmount - totalSales;
		        System.out.println("거스름돈: " + change + "원");

		        updateRevenue(totalSales);
		        resetSales();
		    }

		    private static void receiveCard(Scanner scanner) {
		        System.out.println("카드 결제를 진행합니다.");
		        updateRevenue(totalSales);
		        resetSales();
		    }

		    private static void updateRevenue(int amount) {
		        revenue += amount;
		        System.out.println("매출이 갱신되었습니다. 현재 매출: " + revenue + "원");
		    }

		    private static void resetSales() {
		        totalSales = 0;
		        salesCount = new int[Categories.length][menu[0].length];
		        stock = new int[Categories.length][menu[0].length];
		        System.out.println("판매량과 재고가 초기화되었습니다.");
		    }
		}
