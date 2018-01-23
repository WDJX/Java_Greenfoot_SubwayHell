import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trains here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Animators
{
    /**
     * Act - do whatever the Trains wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int r;
    
   /* public Train(int speed) {
        r = speed;
     
}
    */
   public Train() {
       r = Greenfoot.getRandomNumber(17);
    }
    public void avoidZero() {
        
        if (r < 6) {
            r = 8;
        }
    }
    public void act() 

    {
       moving();
       avoidZero();
       rewind();// Add your action code here.
    }    
    
    public void moving() {
        
       
        setLocation(getX()+r, getY());
    
    }
    
    public void rewind() {
        if(getX() == 799) {
            setLocation(0, getY());
        }
       
    }
    
   
}


   


