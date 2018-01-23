import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animators here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animators extends Actor
{
    /**
     * Act - do whatever the Animators wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int userPts = 0 ;
    public int beginChecker = 0;
    public int numStruck = 0;
    
    
//     public Animators() {
//         this.userPts = 0;
//         this.numStruck = 0;
//     }
    public void act() 
    {
        // Add your action code here.
    }  
    
    public boolean touch(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor !=null;
    }
    
    
    public void disappear(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        {
            if(actor != null) {
                getWorld().removeObject(actor);
            }
        }
    }
    
  
    
    }
    
 
   

