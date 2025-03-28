public class CoffeeFactory  extends DrinkFactory{
    public IDrink createDrink(){
        return new Coffee(); 
    }
}