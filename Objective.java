import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Explains the Objective of the game.
 * 
 * @author Marco 
 * @version June 2022
 */
public class Objective extends World
{
    GreenfootSound mainTwoSound = new GreenfootSound("Time.mp3");
    /**
     * Constructor for objects of class Objective.
     * Calls Methods
     */
    public Objective()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Create labels to explain objectives
     */
    public void prepare(){
        Label objectiveLabel = new Label("Objective", 60);
        addObject(objectiveLabel, 300, 100);
        Label mainLabel = new Label("Main Objective: Get a score of 25" , 30);
        addObject(mainLabel, 300, 150);
        Label shootLabel = new Label("Defeat enemies and survive, your score is saved", 30);
        addObject(shootLabel, 300, 200);
        Label enterLabel = new Label("Press 2 to continue", 30);
        addObject(enterLabel, 300, 250);
    }
    /**
     * if 2 is pressed, go to controls world
     */
    public void act(){
        if(Greenfoot.isKeyDown("2")){
            Controls gameWorld = new Controls();
            Greenfoot.setWorld(gameWorld);
        }
    }
    public void started(){
        mainTwoSound.play();
    }
    public void stopped(){
        mainTwoSound.stop();
    }
}
