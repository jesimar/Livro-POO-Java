import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carregador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carregador extends Actor
{
    boolean isMoveRight = true;
    public void act() 
    {
        if(isMoveRight){
            move(1);
        }else{
            move(-1);
        }
        int x=getX();
        if(isMoveRight && x>380){
            isMoveRight=false;
        }else if(!isMoveRight && x<260){
            isMoveRight=true;
        }
    }    
}
