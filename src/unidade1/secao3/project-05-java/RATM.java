import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class MeuPeixe here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class RATM extends Actor
{
    String imgRoboFrente = "robo1.png";
    String imgRoboTraz = "robo2.png";
    String imgRoboEsquerda = "robo3.png";
    String imgRoboDireita = "robo4.png";
    int velocidade = 1;
    int posX = 0;
    int posY = 0;
    public RATM(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }    
    private boolean avaliaPosicao(int posX, int posY){
        if (posX < 40 || posX > 560 || posY < 60 || posY > 360){
            return false;//delimitaçao da fronteira da sala/galpao
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 240 && posY <= 400)){
            return false;//delimitaçao da regiao de operaçao de maquinas
        }
        if ((posX >= 0 && posX <= 100) && (posY >= 0 && posY <= 200)){
            return false;//delimitaçao da regiao de caixas com livros 
        }
        if ((posX >= 500 && posX <= 600) && (posY >= 0 && posY <= 200)){
            return false;//delimitaçao da regiao de caixas com impressoras
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 0 && posY <= 90)){
            return false;//delimitaçao da regiao de caixas com HDs acima
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 120 && posY <= 200)){
            return false;//delimitaçao da regiao de caixas com HDs abaixo
        }
        return true;
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("down")){
            this.setImage(imgRoboFrente);
            if (avaliaPosicao(posX, posY + velocidade)){
                posY = posY + velocidade;
                this.setLocation(posX, posY);
            }
        }
        if (Greenfoot.isKeyDown("up")){
            this.setImage(imgRoboTraz);
            if (avaliaPosicao(posX, posY - velocidade)){
                posY = posY - velocidade;
                this.setLocation(posX, posY);
            }
        }
        if (Greenfoot.isKeyDown("left")){
            this.setImage(imgRoboEsquerda);
            if (avaliaPosicao(posX - velocidade, posY)){
                posX = posX - velocidade;
                this.setLocation(posX, posY);
            }
        }
        if (Greenfoot.isKeyDown("right")){
            this.setImage(imgRoboDireita);
            if (avaliaPosicao(posX + velocidade, posY)){
                posX = posX + velocidade;
                this.setLocation(posX, posY);
            }
        }
        if (Greenfoot.isKeyDown("space")){
            if (velocidade == 1){
                velocidade = 2;
            } else if (velocidade == 2){
                velocidade = 1;
            }
        }
    }  
}
