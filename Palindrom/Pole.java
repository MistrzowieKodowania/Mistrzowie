import greenfoot.*;

public class Pole extends World
{
    public Pole()
    {    
        super(600, 400, 1); 
        Ludek ludek = new Ludek();
        addObject(ludek, 300, 200);
    }
}
