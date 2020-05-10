import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class CavaloMarinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CavaloMarinho extends Actor
{
    /**
     * Act - do whatever the CavaloMarinho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move((int)(Math.random() * 4 - 2));
    }    
}
