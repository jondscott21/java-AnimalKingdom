package animalKingdom;

public class Mammal extends Animal
{
    public Mammal(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live Birth";
    }

    @Override
    public String toString()
    {
        return "\nMammal: " +
        "Name: " + name + '\'' +
        ", Year Named: " + year;
    }
}