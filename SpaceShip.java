import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Space ship actor.
 * 
 * @author Marco 
 * @version June 2022
 */
public class SpaceShip extends Actor
{
    /**
     * Act - do whatever the SpaceShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int targetx=0, targety=0;
    private int line =0;
    MyWorld thisGame;
    
    //Calling Methods
    public void act()
    {
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            targetx=mouse.getX();
            targety=mouse.getY();
        }
        move();
        if("space".equals(Greenfoot.getKey()))
        {
            fire(); 
        }
        hitEnemy();
    }
    // Movement through mouse
    public void move()
    {
        double rx=targetx-getX();
        double ry=targety-getY();
        double r=Math.sqrt(rx*rx+ry*ry);
        int bts = 5;
        int posx=0, posy=0;
        if(r>bts){
            posx=(int)(getX()+bts*rx/r);
            posy=(int)(getY()+bts*ry/r);
        }
        else{
            posx=targetx;
            posy=targety;
        }
        setLocation(posx,posy);
    }
    public void addedToWorld(World MyWorld)
    {
        targetx=getX();targety=getY();
    }
    //Added bullets
    public void fire()
    {
        Bullets bullets = new Bullets();
        getWorld().addObject(bullets, getX(), getY());
        MyWorld world = (MyWorld) getWorld();
        if(getX() >= world.getWidth())
        {
            world.removeObject(bullets);
        }
    }
    public void hitEnemy(){
        if (isTouching(EnemyShip.class))
        {
            getWorld().addObject(new GameOver(), 300, 200);
            getWorld().removeObject(this);
            thisGame.score = 0;
        }
    }
    public void hitEnemyBullets(){
        if(isTouching(EnemyBullets.class)){
            getWorld().addObject(new GameOver(), 300, 200);
            getWorld().removeObject(this);
            thisGame.score = 0;
        }
    }
}
