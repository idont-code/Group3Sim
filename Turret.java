import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Turret extends SuperSmoothMover
{
    GreenfootImage turret = new GreenfootImage("images/turret.png");
    
    public Turret()
    {
        turret.scale(100,200);
        turret.mirrorHorizontally();
        setImage(turret);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) {
            shoot();
        }
    }
    
    private void shoot()
    {
        Projectile b = new Projectile(1);                 // create a Bullet object
        getWorld().addObject(b, getX()+60, getY()-43);
    }
}
