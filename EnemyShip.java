import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * EnemyShip here.
 * 
 * @author Marco 
 * @version June 2022
 */
public class EnemyShip extends Actor
{
    int xPos;
    int yPos;
    int horzMove = 3;
    int vertMove = 3;
    /**
     * Act - do whatever the EnemyShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = 390;
        int y = getY()+ 2;
        setLocation(x,y);
    }
    public void addedToWorld (World MyWorld)
    {
        setRotation(180);
    }
    public void move(){
        xPos = getX();
        yPos = getY();
    }
    
}
