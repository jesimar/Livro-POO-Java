import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class MyWorld here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class GalpaoEstoque extends World
{
    public GalpaoEstoque()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Simulador: R-ATM", 110, 14);
        addObject(new BoxLivros(), 50, 70);
        addObject(new BoxLivros(), 50, 120);
        addObject(new BoxLivros(), 50, 170);
        addObject(new BoxImpressoras(), 550, 70);
        addObject(new BoxImpressoras(), 550, 125);
        addObject(new BoxImpressoras(), 550, 180);
        addObject(new BoxHDs(), 240, 178);
        addObject(new BoxHDs(), 300, 178);
        addObject(new BoxHDs(), 360, 178);
        addObject(new BoxHDs(), 240, 68);
        addObject(new BoxHDs(), 300, 68);
        addObject(new BoxHDs(), 360, 68);
        addObject(new Carregador(), 300, 330);
        addObject(new RATM(65, 330), 65, 330);
    }  
}