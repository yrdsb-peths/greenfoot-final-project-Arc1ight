import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world the actors live in.
 * 
 * @author Marco 
 * @version June 2022
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Spaceship();
        
    }
    public void Spaceship()
    {
        SpaceShip ship = new SpaceShip();
        addObject(ship, 50, 200);
    }
    public void Enemyship()
    {
        EnemyShip enemyship = new EnemyShip();
        
        
    }
    
}
