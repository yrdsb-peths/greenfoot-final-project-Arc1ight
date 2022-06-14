import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objective of the game.
 * 
 * @author Marco 
 * @version June 2022
 */
public class Objective extends World
{

    /**
     * Constructor for objects of class Objective.
     * 
     */
    public Objective()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    //Prepare Labels for main objective
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
    //If 2 is pressed 
    public void act(){
        if(Greenfoot.isKeyDown("2")){
            Controls gameWorld = new Controls();
            Greenfoot.setWorld(gameWorld);
        }
    }
}