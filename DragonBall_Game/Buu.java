import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buu here.
 * 
 * @author (Sai Harshith) 
 * @version (V 1.0 11/18/2018)
 */
public class Buu extends Actor
{
<<<<<<< HEAD
    
    Timer gettime = new Timer();
    int count=0;
    private World w = getWorld(); 
    Goku goku;
    GreenfootSound fireball = new GreenfootSound("buu.wav");
    
=======
    private int count=0;
    private int max = 10;
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
    /**
     * Act - do whatever the Buu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
<<<<<<< HEAD
    public Buu(Goku goku){
        this.goku = goku;
    }
    public void act() 
    {
        
        int diff = this.goku.getY()-this.getY(); 
        if(-75<diff && diff<75)
        attackGoku();
      
    }
    
    public void attackGoku(){
        if(gettime.TimeElapsed() > 1000){
            fireball.play();
            World world = getWorld();
            BuuFire bf = new BuuFire();
            
            world.addObject(bf, this.getX()+this.getImage().getWidth()/2, this.getY());
            gettime.fire();
            

    
}
}
}

=======
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
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
