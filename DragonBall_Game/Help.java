<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonHelp here.
 * 
 * @author Sai Harshith 
 * @version (V 1.0 11/18/2018)
 */
public class Help extends Button implements ButtonInvoker
{    
    private HelpScreen hs;
    private ButtonCommand newButtonCommand;
    public Help()
    {
        hs = new HelpScreen();
    }
    public HelpScreen getHelp()
    {
        return hs;
    }
    
    public void act() 
    {
        // Add your action code here.
//                if (Greenfoot.mouseClicked(this))
//        {
//            Greenfoot.setWorld(new Help());
//        }
        super.act();
    }    
        public void click()
    {
        newButtonCommand.executeCommand();
    }
    public void setCommand(ButtonCommand newCmd)
    {
        this.newButtonCommand = newCmd;
    }
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonHelp here.
 * 
 * @author Sai Harshith 
 * @version (V 1.0 11/18/2018)
 */
public class Help extends Button implements ButtonInvoker
{    
    private HelpScreen hs;
    private ButtonCommand newButtonCommand;
    public Help()
    {
        hs = new HelpScreen();
    }
    public HelpScreen getHelp()
    {
        return hs;
    }
    
    public void act() 
    {
        // Add your action code here.
//                if (Greenfoot.mouseClicked(this))
//        {
//            Greenfoot.setWorld(new Help());
//        }
        super.act();
    }    
        public void click()
    {
        newButtonCommand.executeCommand();
    }
    public void setCommand(ButtonCommand newCmd)
    {
        this.newButtonCommand = newCmd;
    }
}
>>>>>>> 6eb55a607310a4114c7f9ba30a10864cf028a49e
