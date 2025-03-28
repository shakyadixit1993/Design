public class LemonadeFactory extends DrinkFactory{
    public IDrink createDrink(){
        return new Lemonade();
    }
}
