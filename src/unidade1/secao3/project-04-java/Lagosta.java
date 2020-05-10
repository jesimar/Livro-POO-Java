import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lagosta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lagosta extends Actor
{
    public boolean isMoveRight = true;
    /**
     * Act - do whatever the Lagosta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isMoveRight){
            move(1);
        }else{
            move(-1);
        }
        int x=getX();
        if(isMoveRight && x>540){
            this.getImage().mirrorHorizontally();
            isMoveRight=false;
        }else if(!isMoveRight && x<500){
            this.getImage().mirrorHorizontally();
            isMoveRight=true;
        }
    }    
}
