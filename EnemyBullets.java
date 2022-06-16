import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullets extends Actor
{
    /**
     * Act - do whatever the EnemyBullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound = new GreenfootSound("Explosion.mp3");
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
            sound.play();
            
        }
        move(5);
    }
}
