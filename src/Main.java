import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Table[] tables = new Table[30];
        Scanner scan = new Scanner(System.in);
        menu.displayMenu();


        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(i + 1, menu);
        }
        System.out.print("Enter the table number: ");
        int selectedTableNumber;
        boolean isRight = true;

        while (true) {
            selectedTableNumber = scan.nextInt();

            if (selectedTableNumber < 31 && selectedTableNumber > 0) {
                isRight = false;
                break;
            } else {
                System.out.println("Please enter the table number 1-30.");
                System.out.println("Enter the table number again: ");
            }
        }


        Table selectedTable = tables[selectedTableNumber - 1];
        selectedTable.placeOrder();

        selectedTable.printOrders();


//        ArrayList<String> orders = new ArrayList<>();
//
//        Scanner scan = new Scanner(System.in);
//        String order;
//
//        System.out.println("Enter the orders(Enter q to exit):");
//        while (true) {
//            order = scan.nextLine();
//
//            if (order.equalsIgnoreCase("q")) {
//                break;
//            }
//
//            orders.add(order);
//        }
//        System.out.println("Orders:");
//        for (String item : orders) {
//            System.out.println(item);
//        }


    }

}




