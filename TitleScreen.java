import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main menu of the game.
 * 
 * @author Marco 
 * @version June 2022
 */
public class TitleScreen extends World
{
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.isKeyDown("s")){
            Controls gameWorld = new Controls();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    public void prepare()
    {
        SpaceLogo Logo = new SpaceLogo();
        addObject(Logo, 300, 100);

        Label startLabel = new Label("Press <s>", 40);
        addObject(startLabel, 300, 300);
    }

    public void started(){
    
    }
    public void stopped(){
    
    }
}
