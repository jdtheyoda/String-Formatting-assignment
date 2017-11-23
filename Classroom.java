import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * This is my class MyWorld here.
 * 
 * @author (Jazzdin Eulalia) 
 * @version (November, 23, 2017)
 */
public class Classroom extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        Student student1 = new Student(1, "Nicholas", "Tanga", 11, 25.4, true);
        
        Student student2 = new Student(2, "Tanga", "Nathan", 11, 26.2, false);
        
        Student student3 = new Student(3, "Bob", "Builder", 11, 94.5, false); 
        
        addObject(student1, 60, 60);
        
        addObject(student2, 540, 60);
        
        addObject(student3, 300, 340);
    }
}
