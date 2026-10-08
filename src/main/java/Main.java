import Family.Person;
import Family.Pet;

public class Main {
    static void main() {
        Person jan = new Person("Jan", "Janssens", 23, "Man");
        Pet fluf = new Pet("Fluf", 2, "hond");

        jan.addPet(fluf);

        System.out.println(jan.getPets().getFirst().getName());
    }
}
