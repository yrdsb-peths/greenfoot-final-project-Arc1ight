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
    SimpleTimer shotTimer = new SimpleTimer();
    MyWorld thisGame;
    public void act()
    {
        if (shotTimer.millisElapsed()> 2000)
        {
            getWorld().addObject(new EnemyBullets(), getX(), getY());
            shotTimer.mark();
        }
        hitBullets();
        move();
    }
    public void addedToWorld (World MyWorld)
    {
        setRotation(180);
    }
    public void move(){
        move(1);
    }
    public void hitBullets()
    {
        Bullets b = (Bullets) getOneIntersectingObject(Bullets.class);
        if (isTouching(Bullets.class))
        {
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            thisGame.score++;
            
        
        }

    }
    
}
