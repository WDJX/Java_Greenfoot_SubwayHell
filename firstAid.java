import greenfoot.*;

/**
 * Write a description of class firstAid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstAid extends Animators
{
    /**
     * Act - do whatever the firstAid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        deploy();
        rewindFA();// Add your action code here.
    }    
    
    public void deploy() {
        setLocation(getX() + Greenfoot.getRandomNumber(18), getY());
    }
   
    
    public void rewindFA() {
        if(getX() == 799) {
            if(Greenfoot.getRandomNumber(2) == 1) {setLocation(0,
                Greenfoot.getRandomNumber(600)); }
                else{disappear(firstAid.class); }
            }
}
}
