import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mar extends World {
    GreenfootSound music = new GreenfootSound("music-mario.mid");
    public Mar() {    
        super(600, 400, 1); 
        showText("Mundo Subaquatico", 120, 12);
        addObject(new PeixeVerde(), 200, 100);
        addObject(new PeixeVerde(), 400, 100);
        addObject(new PeixeListrado(), 350, 180);
        addObject(new CavaloMarinho(), 120, 360);
        addObject(new Ancora(), 500, 375);
        addObject(new PeixeDourado(), 300, 80);
    }
    public void started(){
        music.play();
    }
    public void stopped(){
        music.stop();
    }       
}