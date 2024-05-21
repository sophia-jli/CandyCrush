import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    int[][] candies = new int[20][19];
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(20, 25, 25); 
        
        for (int i=5; i<24; i++) {
            for (int j=1; j<19;j++) {
                addObject(new Tile(),j,i);
            }
        }
        //prepare(); sorry doesnt work
    }
    
    public void prepare() {
        for (int i=0; i<candies.length; i++) {
            for (int j=0; j<candies[0].length; j++) {
                candies[i][j]=Greenfoot.getRandomNumber(5);
            }
        }
        
        for (int i=0; i<candies.length; i++) {
            for (int j=0; j<candies[0].length; i++) {
                if (candies[i][j]==0) {
                    addObject(new BlueCandy(),j+1,i+5);
                }
                
            }
        }
        
    }
    
    
}
