import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FriezaFire here.
 * 
 * @author Sai Harshith
 * @version (V 1.0 11/18/2018)
 */
public class FriezaFire extends Actor
{
    /**
     * Act - do whatever the FriezaFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(15);
        if(isAtEdge())
            getWorld().removeObject(this);
    }    
}
