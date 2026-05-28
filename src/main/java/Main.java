import model.Meat;
import model.Apple;
import model.Food;
import service.ShoppingCart;



public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleR = new Apple(10, 50, "red");
        Apple appleZ = new Apple(8, 60, "green");

        Food[] products = new Food[]{meat, appleR, appleZ};
        ShoppingCart cart = new ShoppingCart(products);


        System.out.println(cart.getTotalPrice());
        System.out.println(cart.getTotalPriceWithDiscount());
        System.out.println(cart.getTotalVegetarianPrice());



    }
}
