    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
    * Write a description of class MeuPeixe here.
    * 
    * @author (your name) 
    * @version (a version number or a date)
    */
    public class PeixeDourado extends Actor {
        GreenfootSound musicJump = new GreenfootSound("sound-jump.wav");
        public void act() {
            if (Greenfoot.isKeyDown("enter")){
                musicJump.play();
            }
        }
    }
