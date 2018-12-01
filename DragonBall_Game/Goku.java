<<<<<<< HEAD
import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.awt.Color;
import java.util.List;
import java.util.Set; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e

/**
 * Write a description of class Goku here.
 * 
 * @author (Sai Harshith) 
 * @version (V 1.0 11/18/2018)
 */
<<<<<<< HEAD
public class Goku extends Actor implements PointsSubject
=======
public class Goku extends Actor
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e

{
    /**
     * Act - do whatever the Goku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int ballscollected;
<<<<<<< HEAD
    private int numOfHits;  // number of hits taken
    //private LivesAggregate lifeAgg;
    //private LivesIterator lifeIter;
    public CurrentLevel l;
    public LevelHandler level;
    private ArrayList<PointsObserver> observers ;
    /**
     * Initialise the Goku
     */
    public Goku(CurrentLevel l,LevelHandler level)
    {
        //ballscollected = 0;
        numOfHits = 0;          // have not been hit yet
        observers = new ArrayList<PointsObserver>();
        //lifeAgg = new LivesAggImpl(3);
        //lifeIter = lifeAgg.createIterator();// set up lives iterator
        this.level = level;
        this.l = l;
    }
    
=======

    /**
     * Initialise the Goku
     */
    public Goku()
    {
        ballscollected = 0;
    }
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
    public void act() 
    {
        checkKeyPress();
        lookForBalls();
<<<<<<< HEAD
        InjuredGoku();

=======
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
    }    
    
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")){
<<<<<<< HEAD
             if(this.getY()-this.getImage().getHeight()/2 > 0){
                 if(this.getY()>90)
                this.setLocation(this.getX(), this.getY() - 5);
        }}
=======
             if(this.getY()-this.getImage().getHeight()/2 > 0)
                this.setLocation(this.getX(), this.getY() - 5);
        }
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
        if(Greenfoot.isKeyDown("down")){
            if(this.getY()+this.getImage().getHeight()/2 < getWorld().getHeight())
                this.setLocation(this.getX(), this.getY() + 5);
        }
    }
<<<<<<< HEAD
    public void InjuredGoku()
    {
   
         if(isTouching(BuuFire.class))
         {         
            removeTouching(BuuFire.class);
            numOfHits++; 
            notifyObservers();// increment every hit
         }
         if(isTouching(FriezaFire.class))
         {         
            removeTouching(FriezaFire.class);
            numOfHits++;    // increment every hit
            notifyObservers();
         }
         if(isTouching(CellFire.class))
         {         
            removeTouching(CellFire.class);
            numOfHits++;    // increment every hit
             notifyObservers();
         }
         
         
    }
    public void lookForBalls()
    {
        if(isTouching(DragonBall.class))
        {
            removeTouching(DragonBall.class);
            l.incrementNBall();
            ballscollected = ballscollected+1;
            notifyObservers();
            //level.startNext();
        }
    }
    
    public Goku getGokuObject(){
        return this;
    }  
    
    /*public void loseLife(){
        if (!lifeIter.isDone())
        {
            lifeIter.next();
        }
    }*/
    
    /*public int countLives()
    {
        return lifeIter.currentItem();
    }*/
    
    public int getNumOfHits()       // return the num of hits sustained
    {
        return numOfHits;
    }
    
    public void resetHitCount()     // reset hit counter when life is lost
    {
        numOfHits = 0;
    }
    public void setNoBalls(int ballscollected){
        this.ballscollected = ballscollected;
    }
    
      public void attach(PointsObserver obj){
        
        observers.add(obj);
        //System.out.println(observers);
      
    }
    
    public void notifyObservers(){
            //observers[1].updatePoints(ballscollected, numOfHits) ;     
        for (int i=0; i<observers.size(); i++)
        {
            PointsObserver observer = observers.get(i) ;
            observer.updatePoints(ballscollected, numOfHits) ;
        }
       
    }
=======

    public void lookForBalls()
    {
        
    }  
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
}
