import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World
{

    /**
     * Constructor for objects of class StartPage.
     * 
     */
    public StartPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject(new StarterBox(), 720, 540);
        addObject(new Player(), 720, 370);
    }
    
   
}
