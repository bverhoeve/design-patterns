package templatemethod.barista;

public class BeverageHookTest {
    
    public static void main(String [] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();

        CoffeeWithHook coffeehook = new CoffeeWithHook();
        coffeehook.prepareRecipe();
    }
}
