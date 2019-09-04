package animalKingdom;

import java.util.*;

public class Main 
{
    public static void printAnimals(ArrayList<Animal> animal, CheckAnimal tester)
    {
        for (Animal v : animal)
        {
            if (tester.test(v))
            {
                System.out.println("Name: " + v.getName() + ", Year Name: " + v.getYear() + ", Breathing Type: " + v.breath() + ", Reproduction Type: " + v.reproduce());
            }
        }
    }

    public static void main(String[] args) {
        // Mammals:
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds:
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);
  
        // Fish:
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<Animal> myList = new ArrayList<Animal>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);

        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);

        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        // System.out.println("*** toString ***");
        // System.out.println(myList.toString());
        // System.out.println();
        System.out.println("*** Normal List ***");
        myList.forEach((a) -> System.out.println(a));
        System.out.println();
        System.out.println("*** Descending Year List ***");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        myList.forEach((a) -> System.out.println(a));
        System.out.println();
        System.out.println("*** Alphbetical List ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach((a) -> System.out.println(a));
        System.out.println();
        System.out.println("*** Movement List ***");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach((a) -> System.out.println(a + " Movement: " + a.move()));
        System.out.println();
        System.out.println("*** Lungs only List ***");
        printAnimals(myList, a -> a.breath().equals("Lungs"));
        System.out.println();
        System.out.println("*** Lungs and Year 1758 List ***");
        printAnimals(myList, a -> (a.breath().equals("Lungs")) && (a.getYear() == 1758));
        System.out.println();
        System.out.println("*** Lungs and Lay Eggs List ***");
        printAnimals(myList, a -> (a.breath().equals("Lungs")) && (a.reproduce().equals("Eggs")));
        System.out.println();
        System.out.println("*** Year 1758 List ***");
        printAnimals(myList, a -> a.getYear() == 1758);
        System.out.println();
        System.out.println("*** Mammal List ***");
        printAnimals(myList, a -> a instanceof Mammal);

    }
}