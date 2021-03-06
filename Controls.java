import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Explains the main controls.
 * 
 * @author Marco 
 * @version June 2022
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * Calls the methods
     */
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Create labels to explain controls
     */
    public void prepare(){
        Label controlLabel = new Label("Controls", 60);
        addObject(controlLabel, 300, 100);
        Label moveLabel = new Label("Use <mouse cursor> to move", 30);
        addObject(moveLabel, 300, 150);
        Label shootLabel = new Label("Use <space> to shoot", 30);
        addObject(shootLabel, 300, 200);
        Label enterLabel = new Label("Press enter to play", 30);
        addObject(enterLabel, 300, 250);
        
    }
    /**
     * If enter is pressed, go to MyWorld
     */
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            
        }
    }
}
