import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrackLevel extends World
{

    /**
     * Constructor for objects of class Tracks.
     * 
     */
    public TrackLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
//         Player anims = new Player();
//         int theUserPts = anims.userPts;
//         int theNumStruck = anims.numStruck;
        
//         addObject(new Health(), 50, 550);
//         addObject(new Health(), 150, 550);
//         addObject(new Health(), 250, 550);
        
        addObject(new Beacons(), 500, 70);
        addObject(new Beacons(), 500, 150);
        addObject(new Beacons(), 500, 230);
        addObject(new Beacons(), 500, 310);
        addObject(new Beacons(), 500, 390);
        addObject(new Beacons(), 500, 470);
        
        addObject(new firstAid(), Greenfoot.getRandomNumber(775)+25, Greenfoot.getRandomNumber(600));
        addObject(new firstAid(), Greenfoot.getRandomNumber(775)+25, Greenfoot.getRandomNumber(600));
       // addObject(new firstAid(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        
       addObject(new Train(),Greenfoot.getRandomNumber(600), 70);
       addObject(new Train(),Greenfoot.getRandomNumber(600), 150);
       addObject(new Train(),Greenfoot.getRandomNumber(600), 230);
       addObject(new Train(),Greenfoot.getRandomNumber(600), 310);
       addObject(new Train(),Greenfoot.getRandomNumber(600), 390);
       addObject(new Train(),Greenfoot.getRandomNumber(600), 470);
       
//         addObject(new Heart1(), 60, 550);
//         addObject(new Heart2(), 140, 550);
//         addObject(new Heart3(), 220, 550);
       
       addObject(new Complete(), 500, 550);
      
       
       
      
       
       addObject(new Player(), 500, 25);
       
        
        
    }
    
    
    
   
        
}
