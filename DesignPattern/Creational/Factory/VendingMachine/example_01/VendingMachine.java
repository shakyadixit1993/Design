import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String,DrinkFactory> factoryMap;
    public VendingMachine(){
        factoryMap = new HashMap<>();
        factoryMap.put("tea", new TeaFactory());
        factoryMap.put("coffee", new CoffeeFactory());
        factoryMap.put("lemonade", new LemonadeFactory());
    }
    public void serve(String drink){
        DrinkFactory factory = factoryMap.get(drink.toLowerCase());
        if(factory != null){
            IDrink drinkItem = factory.createDrink();
            drinkItem.prepare();
        }else {
            System.out.println("Sorry we do not serve "+drink);
        }
    }
    public static void main(String[] args){
       VendingMachine vendingMachine = new VendingMachine();
       vendingMachine.serve("tea");
       vendingMachine.serve("coffee");
       vendingMachine.serve("soda");
       vendingMachine.serve("lemonaDe");
    }
}