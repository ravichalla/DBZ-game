import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buu here.
 * 
 * @author (Sai Harshith) 
 * @version (V 1.0 11/18/2018)
 */
public class Buu extends Actor
{
    private int count=0;
    private int max = 10;
    /**
     * Act - do whatever the Buu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        count++;
        if(count<max)
            moveup();
        else if(count==100)
            movedown();
        
    }
    
    public void moveup(){
        if(this.getY()-this.getImage().getHeight()/2 > 0)
                this.setLocation(this.getX(), this.getY() - 35);
        
        
        
}
public void movedown(){
    if(this.getY()+this.getImage().getHeight()/2 < getWorld().getHeight())
                this.setLocation(this.getX(), this.getY() + 55);
}
}
