package w13.w2;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> countries = new LinkedList<String>();
        countries.addFirst("Беларусь♥");
        countries.addFirst("Польша");
        countries.addLast("Украина");
        countries.addLast("Россия");
        for (String county: countries)
            System.out.println(county);
        countries.removeFirst();
        countries.removeLast();
        for (String county: countries)
        System.out.println(county);
        }
    }

