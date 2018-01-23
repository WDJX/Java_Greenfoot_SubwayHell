import greenfoot.*;

/**
 * Write a description of class HarderTrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HarderTrain extends Animators
{
    private int r;
    
   /* public Train(int speed) {
        r = speed;
     
}
    */
   public HarderTrain() {
       r = Greenfoot.getRandomNumber(24);
    }
    public void avoidZero() {
        
        if (r < 10) {
            r = 14;
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
