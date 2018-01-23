import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Animators
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //DON'T FORGET TO ACTIVATE EACH METHOD!!! DON'T BE STUPID!!!!!!!!!!!!!!!!
    
    
    public static int timer = 1000000000;
    
    
    public void act() 
    {
       
      
        timer--;
        startGame();
       
        keyboardMove();
        touchingBeacon();
        struckByTrain();
        struckByTrainLev2();
     
        gameOver();
        becomeHealthy();
        completeCrossing();
       
        timeOut();
       
        
    }    
    
   
  
    public void startGame() {
        if(touch(StarterBox.class)) {
            Greenfoot.setWorld(new TrackLevel());
            Greenfoot.playSound("T1DoorChime.wav");
            Greenfoot.playSound("T1Departing.wav");
            //Greenfoot.playSound("BGM.mp3");
            timer = 3600;
        }
    }
    
    public void keyboardMove() {
        if(Greenfoot.isKeyDown("up")) {
         setLocation(getX(),getY()-3 );}
         else if(Greenfoot.isKeyDown("down")) {
          setLocation(getX(),getY()+3); }
 
        }
        
    public void touchingBeacon() {
        if(touch(Beacons.class) ) {
            userPts++;
            disappear(Beacons.class);
            Greenfoot.playSound("pass.wav");
        }
    }
    
    public void struckByTrain() {
        if(touch(Train.class) ) {
            numStruck++;
            //System.out.println(numStruck);
            disappear(Train.class);
            Greenfoot.playSound("Bang.wav");
            
            
            
        }
    }
    public void struckByTrainLev2() {
        if(touch(HarderTrain.class) ) {
            numStruck++;
            //System.out.println(numStruck);
            disappear(HarderTrain.class);
            Greenfoot.playSound("Bang.wav");
            
            
            
        }
    }
            
    public void gameOver() {
        if(numStruck == 3) {
            Greenfoot.stop();
            
           JOptionPane.showMessageDialog(new JInternalFrame(), "YOU WERE STRUCK AND KILLED BY ROCKETS. \nThank you for choosing the better way.",
           "GAME OVER", JOptionPane.INFORMATION_MESSAGE);

        }   
    }
    
    public void becomeHealthy() {
        if(touch(firstAid.class)) {
            disappear(firstAid.class);
            numStruck = numStruck - 1;
            Greenfoot.playSound("gainHealth.wav");
        }
    }
    
    public void completeCrossing() {
        if(touch(Complete.class)) {
            Greenfoot.stop();
            JOptionPane.showMessageDialog(new JInternalFrame(), "Congratulations! You have survived from the subway hell. \nThis level is now cleared.",
           "Level Clear", JOptionPane.INFORMATION_MESSAGE);
           Greenfoot.setWorld(new Level2());
           numStruck = 0;
        }
    }
    
    
    
    public void timeOut() {
        if(timer == 0) {
            Greenfoot.stop();
            timer = 3600;
             JOptionPane.showMessageDialog(new JInternalFrame(), "Time Over! \nThank you for choosing the better way.",
           "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
}
