import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Shoot out of the SpaceShip actor.
 * 
 * @author Marco 
 * @version June 2022
 */
public class Bullets extends Actor
{
    private boolean toRemove=false;
    private int vx = 3;
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World MyWorld)
    {
        GreenfootImage image = new GreenfootImage(50,10);
        
    }
    public void act()
    {
        if(!toRemove)
        {
            setLocation(getX()+vx,getY());
        }
        else{
            getWorld().removeObject(this);
        }
    }
}
