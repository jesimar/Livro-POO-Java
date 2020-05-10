    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
    * Write a description of class MeuPeixe here.
    * 
    * @author (your name) 
    * @version (a version number or a date)
    */
    public class PeixeDourado extends Actor {
        boolean isOrientedToLeft = true;
        int posX = 0;
        int posY = 0;
        public PeixeDourado(int posX, int posY){
            this.posX = posX;
            this.posY = posY;
        }
        public void act() {
            if (Greenfoot.isKeyDown("left")){
                this.setRotation(0);
                if (!isOrientedToLeft){
                    isOrientedToLeft = true;
                    this.getImage().mirrorHorizontally();
                }
                if (posX > 40){
                    posX = posX - 1;
                    this.setLocation(posX, posY);
                }
            }
            if (Greenfoot.isKeyDown("right")){
                this.setRotation(0);
                if (isOrientedToLeft){
                    isOrientedToLeft = false;
                    this.getImage().mirrorHorizontally();
                }
                if (posX < 560){
                    posX = posX + 1;
                    this.setLocation(posX, posY);
                }
            }
            if (Greenfoot.isKeyDown("up")){
                if (isOrientedToLeft){
                    this.setRotation(30);
                }
                if (!isOrientedToLeft){
                    this.setRotation(-30);
                }
                if (posY > 80){
                    posY = posY - 1;
                    this.setLocation(posX, posY);
                }
            }
            if (Greenfoot.isKeyDown("down")){
                if (isOrientedToLeft){
                    this.setRotation(-30);
                }
                if (!isOrientedToLeft){
                    this.setRotation(30);
                }
                if (posY < 340){
                    posY = posY + 1;
                    this.setLocation(posX, posY);
                }
            }
            if (Greenfoot.isKeyDown("space")){
                if (isOrientedToLeft){
                    this.setRotation(30);
                }
                if (!isOrientedToLeft){
                    this.setRotation(-30);
                }
                if (posY > 80){
                    posY = posY - 3;
                    this.setLocation(posX, posY);
                }
            }
        }    
    }
