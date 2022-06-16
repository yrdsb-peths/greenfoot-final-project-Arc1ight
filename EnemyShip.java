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
    //Time of the enemy bullets and calling methods
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
    //Flip the object 
    public void addedToWorld (World MyWorld)
    {
        setRotation(180);
    }
    //Move the actor
    public void move(){
        move(1);
    }
    //Remove Enemy actor if bullets hit and increase score
    public void hitBullets()
    {
        Bullets b = (Bullets) getOneIntersectingObject(Bullets.class);
        if (isTouching(Bullets.class))
        {
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            thisGame.score++;
            Greenfoot.playSound("Explosion+2.mp3");
            
        
        }

    }
    
}
