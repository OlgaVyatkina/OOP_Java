import Products.*;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Fanta",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));

        itemMachin.addProduct(new BottleOfWater("Coca-Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Вода", 188.0, 1500 ));

        itemMachin.addProduct(new HotDrink("Зеленый чай ", 100.0, 200, 90));
        itemMachin.addProduct(new HotDrink("Черный чай ", 110.0, 200, 95));

// вывод всех товаров в консоль
        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
new AppFrame("Vending Machine!", itemMachin);   
    }
 
}  
