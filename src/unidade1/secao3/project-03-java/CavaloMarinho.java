import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class CavaloMarinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CavaloMarinho extends Actor{
    public void act() {
        move((int)(Math.random() * 4 - 2));
    }    
}
