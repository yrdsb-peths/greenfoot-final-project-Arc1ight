import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world the actors live in.
 * 
 * @author Marco 
 * @version June 2022
 */
public class MyWorld extends World
{
    SimpleTimer spawnTimer = new SimpleTimer();
    public static int score= 0;
    private int timer = 200;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //Call Methods
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Spaceship();
        shipSpawn();
    }
    // spawn time of enemies and calling win method
    public void act()
    {
        showText("Score; " + score, 50, 25);
        timer--;
        if (timer <= 0) {
            Enemyship();
            timer+= 200;
            Enemyship();
            timer+= 100;
        }
        win();
    }
    // Win Screen and Method
    public void win()
    {
        if (score >= 25)
        {
            YouWin win = new YouWin();
            addObject(win, 300, 200);
            score = 0;
            Greenfoot.stop();
        }
    }
    
    public void shipSpawn(){
        Enemyship();
    }
    public void Spaceship()
    {
        SpaceShip ship = new SpaceShip();
        addObject(ship, 50, 200);
    }
    
    public void Enemyship()
    {
        EnemyShip[] enemy = new EnemyShip[3];
        for (int i = 0; i < enemy.length; i++)
        {
            enemy[i] = new EnemyShip();
            int EnemyShipY = Greenfoot.getRandomNumber(getHeight());
            addObject(enemy[i], 600, EnemyShipY);
        }
    }
}

