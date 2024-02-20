import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> items = new ArrayList<>();


    Menu() {
        items.add(new MenuItem("Coffee",45));
        items.add(new MenuItem("Turkish Tea",20));
        items.add(new MenuItem("San Sebastian Cake",60));
        items.add(new MenuItem("Red Velvet",60));
        items.add(new MenuItem("Hamburger",100));
        items.add(new MenuItem("Pizza",80));
        items.add(new MenuItem("Fuse Tea",30));
        items.add(new MenuItem("Turkish Coffee",45));
        items.add(new MenuItem("Salad",50));
        items.add(new MenuItem("Kola",30));
    }
    MenuItem getItem(String itemName) {
        for (MenuItem item : items) {
            if (item.name.equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void displayMenu() {
        System.out.println("-------Menu-------");
        for (MenuItem item : items) {
            System.out.println(item.name + "-" + item.price + " TL");
        }
        System.out.println("------------------");
    }
    public boolean containsItem(String itemName) {
        for (MenuItem item : items) {
            if (item.name.equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
}
