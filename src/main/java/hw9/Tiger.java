package hw9;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр ревет");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Мясо")) {
            System.out.println("Тигр любит мясо ");
        } else {
            System.out.println("Тигр любит не мясо " + food);
        }
    }
}

