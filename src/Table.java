import java.util.ArrayList;
import java.util.Scanner;

public class Table{
    public int tableNumber;
    ArrayList<String> orders;
    Menu menu;


    Table(int tableNumber, Menu menu){
        this.tableNumber = tableNumber;
        this.orders = new ArrayList<>();
        this.menu = menu;
    }


    public void placeOrder(){
        Scanner input = new Scanner(System.in);
        String item;

        while ( true ){
            System.out.print("Please enter your orders(Press q to quit): ");
            item = input.nextLine();

            if ( item.equalsIgnoreCase("q")){
                break;
            }
            if ( menu.containsItem(item)){
                orders.add(item);
                System.out.println(" Your order has been taken:  "+ item);
            }else{
                System.out.println("There is no order like " + item + ".");
            }
        }

    }

    public void printOrders(){
        System.out.println("Orders of table number " + tableNumber + ": ");
        System.out.println("--------------------------");
        double totalAmount = 0.0;

        for ( String order : orders){
            MenuItem item = menu.getItem(order);
            System.out.print(order + " - ");
            System.out.println(item.price + " TL");
            totalAmount += item.price;



        }
        System.out.println("--------------------------");
        System.out.println("The total amount is : "+ totalAmount + " TL");
    }

}
