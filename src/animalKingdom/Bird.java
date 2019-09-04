package animalKingdom;

public class Bird extends Animal
{
    public Bird(String name, int year)
    {
        super(name, year);
    }
    
    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }
}