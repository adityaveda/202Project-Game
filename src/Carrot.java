import greenfoot.*;  

public class Carrot extends Food implements Display
{
    
    Carrot()
    {
     super(FoodType.CARROT);
    }
    
    public void act() 
    {
     objectpath();
    }  
		
    public void objectpath()
    {

    }
    
    public void eat()
    {
     GreenfootImage carrot= new GreenfootImage("carrot.png");
     setImage(carrot);
    }
}
