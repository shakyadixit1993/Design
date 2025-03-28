public class TeaFactory extends DrinkFactory{
    public IDrink createDrink(){
        return new Tea();
    }
}