package Family;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    @Test
    public void checkIfParentsGetAdded(){
        Person jan = new Person("Jan", "Janssens", 23, "Man");
        Person moeder = new Person("Jane", "Janssens", 44, "Vrouw");
        Person vader = new Person("Pieter", "Janssens", 56, "Man");

        jan.addParents(moeder, vader);

        assertSame(moeder, jan.getMother());
        assertSame(vader, jan.getFather());
    }

    @Test
    public void checkIfChildGetsAdded(){
        Person jan = new Person("Jan", "Janssens", 23, "Man");
        Person pol = new Person("Pol", "Janssens", 12, "Man");

        List<Person> childrenTest = jan.getChildren();
        jan.addChild(pol);
        childrenTest.add(pol);

        assertSame(childrenTest, jan.getChildren());
    }

    @Test
    public void checkIfPetGetsAdded(){
        Person jan = new Person("Jan", "Janssens", 23, "Man");
        Pet fluf = new Pet("Pol", 5, "Dog");

        List<Pet> petsTest = jan.getPets();
        jan.addPet(fluf);
        petsTest.add(fluf);

        assertSame(petsTest, jan.getPets());
    }

    @Test
    public void checkIfSiblingGetsAdded(){
        Person jan = new Person("Jan", "Janssens", 23, "Man");
        Person pol = new Person("Pol", "Janssens", 12, "Man");

        List<Person> siblingTest = jan.getSiblings();
        jan.addSibling(pol);
        siblingTest.add(pol);

        assertSame(siblingTest, jan.getSiblings());
    }

    @Test
    public void checkIfGrandChildrenGetsAdded(){
        Person opa = new Person("Jan", "Janssens", 64, "Man");
        Person zoon = new Person("Pol", "Janssens", 44, "Man");
        Person kleinzoon = new Person("Sjaak", "Janssens", 20, "Man");

        opa.addChild(zoon);
        zoon.addChild(kleinzoon);

        assertSame(kleinzoon, opa.getGrandChildren().getFirst());
    }
}
