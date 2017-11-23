import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * This is my class Student here.
 * 
 * @author (Jazzdin Eulalia) 
 * @version (November, 23, 2017)
 */
public class Student extends Actor
{
    int studentNumber;
    String firstName;
    String lastName;
    int gradeLevel;
    double average;
    boolean it;
    String upKey;
    String downKey;
    String leftKey;
    String rightKey;
    int itDelay;
    
    public Student(int number, String first, String last, int grade, double avg, boolean isIt)
    {
        studentNumber = number;                       
        firstName = first;
        lastName = last;
        gradeLevel = grade;
        average = avg;
        it = isIt;
        if(studentNumber == 1)
        {
            upKey = "w";
            
            downKey = "s";
            
            leftKey = "a";
            
            rightKey = "d";
        }
        else if(studentNumber == 2)
        {
            upKey = "u";
            
            downKey = "j";
            
            leftKey = "h";
            
            rightKey = "k";         
        }
        else
        {
            upKey = "up";
            
            downKey = "down";
            
            leftKey = "left";
            
            rightKey = "right";                                                
        }
        itDelay = 200;
        if(it == true)
        {
            setImage("ppl1.png");
        }
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
        
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    public double getAverage()
    {
        return average;
    }
    
    public boolean getit()
    {
        return it;
    }
    
    public String toString()
    {
        return String.format("Name: %15s, %10s\nGrade: %12d\nAverage: %22.1f%%\n", lastName, firstName, gradeLevel, average);
    }
    
    private void checkCollision()
    {
        Actor otherStudent = getOneIntersectingObject(Student.class);
        if(otherStudent !=null)
        {
            if(itDelay >= 200)
            {
                if(it == true)
                {
                    it = false;
                    
                    setImage("ppl2.png");
                    
                    itDelay = 0;
                }
                else
                {
                    it = true;
                    
                    setImage("ppl1.png");
                    
                    itDelay = 0;
                    
                }
            }
                                                               
        }
    }
    
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown( upKey ) )
        {
            setLocation( getX(), getY() -3 );
            
        }
        
        if(Greenfoot.isKeyDown( downKey ) )
        {
            setLocation( getX(), getY() +3 );
        }
        
        
    
        if(Greenfoot.isKeyDown( leftKey ) )
        {
            setLocation( getX()-3, getY() );
            
        }
        
        if(Greenfoot.isKeyDown( rightKey ) )
        {
            setLocation( getX()+3, getY() );
        }
      
    }   
           
            
    /**
     * Act - do whatever the Student wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkCollision();
        
        checkKeyPress();
        
        if( Greenfoot.mouseClicked(this) )
        {
            System.out.println( toString() );
        }
        
        itDelay++;
    }    
}
