import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Animal> set = new HashSet<>();
        Animal a = new Animal("Tiger");
        set.add(a);
        set.add(a);
        set.add(new Animal("Lion"));
        set.add(new Animal("Dog"));
        set.add(new Animal("Tiger"));

        Iterator<Animal> iterator = set.iterator();
        while(iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }
    }
}
