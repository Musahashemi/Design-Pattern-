public class PizzaTestDrive {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore myStore = new NYPizzaStore();
        // PizzaStore chicagoStore = new ChicagoPizzaStore();
        // PizzaStore chicagoStore = new ChicagoStyleCheesePizza();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Musa ordered a " + pizza.getName() + "\n");
        // pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Khan ordered a " + pizza.getName() + "\n");


        Pizza pizza2 = myStore.orderPizza("veggie");
        System.out.println("Mohammad ordering a "+pizza2.getName()+ "\n");

        // System.out.println("Musa" +pizza.getName()+ "\n");
    }
}