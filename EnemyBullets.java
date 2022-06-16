import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullets here.
 * 
 * @author Marco 
 * @version June 2022
 */
public class EnemyBullets extends Actor
{
    /**
     * Act - do whatever the EnemyBullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public EnemyBullets(){
        getImage().scale(20,20);
    }
    public void addedToWorld (World MyWorld)
    {
        setRotation(180);
    }
    public void act()
    {
        
        setLocation(getX(), getY());
        SpaceShip s =(SpaceShip) getOneIntersectingObject(SpaceShip.class);
        if(s != null)
        {
            getWorld().removeObject(s);
            World MyWorld = getWorld();
            GameOver g = new GameOver();
            MyWorld.addObject(g, 300, 200);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion+3.mp3");
            
        }
        move(5);
    }
}
