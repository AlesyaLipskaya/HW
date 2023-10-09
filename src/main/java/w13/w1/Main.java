package w13.w1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Беларусь♥");
        countries.add("Украина");
        countries.add("Россия");
        for (String county: countries)
            System.out.println(county);
        countries.set( 1, "США");
        countries.remove(1);
        countries.remove( "США");
        int index = countries.indexOf( "Беларусь♥");
        System.out.println(countries.get(index));
        System.out.println(countries.contains("Беларусь♥"));


    }
}
