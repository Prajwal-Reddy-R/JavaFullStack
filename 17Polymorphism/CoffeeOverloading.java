public class CoffeeOverloading {

    void prepareCoffee() {
        System.out.println("Preparing a simple coffee.");
    }

    void prepareCoffee(String type) {
        System.out.println("Preparing a " + type + " coffee.");
    }

    void prepareCoffee(String type, String size) {
        System.out.println("Preparing a " + size + " " + type + " coffee.");
    }

    public static void main(String[] args) {
        CoffeeOverloading coffeeMaker = new CoffeeOverloading();

        
        coffeeMaker.prepareCoffee();

        
        coffeeMaker.prepareCoffee("Espresso");

       
        coffeeMaker.prepareCoffee("Latte", "Large");
    }
}