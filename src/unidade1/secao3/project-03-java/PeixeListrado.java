import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PeixeListrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeixeListrado extends Actor {
    public boolean isMovingToRight = true;
    public void act() {
        if(isMovingToRight){
            move(1);
        }else{
            move(-1);
        }
        if(isMovingToRight && getX() > 540){
            this.getImage().mirrorHorizontally();
            isMovingToRight=false;
        }else if(!isMovingToRight && getX() < 60){
            this.getImage().mirrorHorizontally();
            isMovingToRight=true;
        }
    }    
}
