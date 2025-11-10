import greenfoot.*;  
import java.util.List;

public class Fences extends SuperSmoothMover {
    public static SuperStatBar fenceHPBar;
    private static boolean fencesComplete = false;
    private static int hitpoint = 1000;
    GreenfootImage fence = new GreenfootImage("images/fence.png");

    public Fences() {
        fence.scale(30, 60);
        setImage(fence);
    }

    public void act() {
        if (fencesComplete && hitpoint <= 0 && getWorld() != null) {
            getWorld().removeObject(fenceHPBar);
            removeAllFences();
        }
    }

    private void removeAllFences() {
        if (getWorld() == null) return;
        List<Fences> all = getWorld().getObjects(Fences.class);
        for (Fences f : all) {
            if (f.getWorld() != null) f.getWorld().removeObject(f);
        }
    }

    public void damage(int amount) {
        if (fencesComplete && fenceHPBar != null) {
            hitpoint -= amount;
            fenceHPBar.update(hitpoint);
        }
    }

    public static void buildComplete(World world) {
        fencesComplete = true;
        fenceHPBar = new SuperStatBar(hitpoint, hitpoint, null, 120, 12, -40, Color.GREEN, Color.RED);
        world.addObject(fenceHPBar, world.getWidth() / 2, world.getHeight() - 30);
    }
}
