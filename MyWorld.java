import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    GreenfootImage background = new GreenfootImage("images/background.png");
    public MyWorld()
    {    
        super(1240,700, 1); 
        setBackground(background);
        
        Builders men = new Builders();
        addObject(men, getWidth()/2, getHeight()/4);
        
        Turret turret = new Turret();
        addObject(turret, 100 , getHeight()/2+100);
    }
}
