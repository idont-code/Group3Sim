import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Fences extends SuperSmoothMover {
    //public static SuperStatBar fenceHPBar;
    //private boolean barCreated = false;
    private static boolean fenceMade = false;
    private static int hitpoint = 1000;
    GreenfootImage fence = new GreenfootImage("images/fence.png");

    public Fences()
    {
        fence.scale(30,60);
        setImage(fence);
    }
    
    public void act()
    {
        if(hitpoint <= 0)
        {
            //getWorld().removeObject(fenceHPBar);
            removeFence();
            if (getWorld() == null) return;
        }
    }
    
    private void removeFence()
    {
        if (getWorld() == null) 
        {
            return;
        }
         
        List<Fences> fences = getWorld().getObjects(Fences.class);
        for (Fences f : fences) {
            if (getWorld() == null) 
            {
                return;
            }
            getWorld().removeObject(f);
        }
    }
    
    public void damage(int amount)
    {
        hitpoint -= amount;
        //fenceHPBar.update(hitpoint);
    }
    
    public static void fenceMade()
    {
        fenceMade = true;
    }
    
    public void addBar()
    {
        //fenceHPBar = new SuperStatBar(hitpoint, hitpoint, null , 50, 6, -40, Color.GREEN, Color.RED);
        //getWorld().addObject(fenceHPBar, getX() , getWorld().getHeight()/2 + 50);
        
    }
}
