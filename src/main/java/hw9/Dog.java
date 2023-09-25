package hw9;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Мясо")) {
            System.out.println("Собака любит мясо ");
        } else {
            System.out.println("Собака любит не мясо " + food);
        }
    }
}
