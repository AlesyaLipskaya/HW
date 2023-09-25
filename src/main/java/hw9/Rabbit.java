package hw9;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик пищит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Трава")) {
            System.out.println("Кролик любит траву ");
        } else {
            System.out.println("Кролик любит не траву " + food);
        }
    }
}