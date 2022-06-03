import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Space ship actor.
 * 
 * @author Marco 
 * @version June 2022
 */
public class SpaceShip extends Actor
{
    /**
     * Act - do whatever the SpaceShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(20);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(-20);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            
        }
        if(Greenfoot.isKeyDown("down"))
        {
            
        }
    }
}
