import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main menu of the game.
 * 
 * @author Marco 
 * @version June 2022
 */
public class TitleScreen extends World
{
    GreenfootSound mainSound = new GreenfootSound("Slience.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * Call Methods
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }
    /**
     * if 1 is pressed, go to objective world
     */
    public void act(){
        if(Greenfoot.isKeyDown("1")){
            Objective gameWorld = new Objective();
            Greenfoot.setWorld(gameWorld);
            stopped();
        }
    }
    
    public void prepare()
    {
        SpaceLogo Logo = new SpaceLogo();
        addObject(Logo, 300, 100);

        Label startLabel = new Label("Press <1> to start", 40);
        addObject(startLabel, 300, 300);
        Ship ship = new Ship();
        addObject(ship,289,205);
    }

    public void started(){
        mainSound.play();
    }
    public void stopped(){
        mainSound.stop();
    }
}
