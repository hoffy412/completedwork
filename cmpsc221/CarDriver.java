/**
 * CarDriver.java:
 * Puts a Car through its paces.
 *
 * @author Professor Rossi
 * @aurhor Hunter Hoffman
 */

import wheelsunh.users.*;
import java.awt.*;



public class CarDriver
{ 
    //---------------- instance variables ------------------------------
    private Car myCar;
    private final TextBox label;
    private final TextBox colorLabel;
    private final TextBox locStartLabel;
    private final TextBox locEndLabel;
    
    //--------------- constructor --------------------------------------
    /**
     *  Construct a Car and then test it.
     *  TextBox objects are displayed  to show results.
     */
    public CarDriver()
    {
        label = new TextBox( 270, 40 );
        label.setSize( 290, 100 );
        label.setText( "No parameter Constructor" );

        myCar = new Car();
        
        Utilities.sleep( 2000 );
        
        label.setText( "Two parameter Constructor\n ( 20,200 )" );
        Utilities.sleep( 1000 );
        myCar = new Car( 20, 200 );
        
        Utilities.sleep( 2000 );
        
        label.setText( "One parameter Constructor\n (ORANGE)" );
        Utilities.sleep( 1000 );
        myCar = new Car( Color.ORANGE );
        
        Utilities.sleep( 2000 );
        
        label.setText( "SetLocation ( 40, 350 ) " );
        Utilities.sleep( 1000 );
        myCar.setLocation( 40, 350 );
        
        Utilities.sleep( 2000 );
        label.setText( "SetColor (PINK) " );
        Utilities.sleep( 1000 );
        myCar.setColor( Color.pink );
        
        
        Utilities.sleep( 2000 );
        colorLabel = new TextBox( 270, 140 );
        colorLabel.setSize( 290, 100 );
        
        colorLabel.setText( "getColor =  " + myCar.getColor() +
                           "\n ( 225, 175, 175 )" );
        
        Utilities.sleep( 2000 );
        
        locStartLabel = new TextBox( 270, 240 );
        locStartLabel.setSize( 290, 100 );      
        locStartLabel.setText( "Start Location" +
                              "\ngetXlocation =  " +
                              myCar.getXLocation() +
                              "\ngetYLocation = " + 
                              myCar.getYLocation() +
                              "\n (40, 350)\n" );     
        Utilities.sleep( 1000 );
        
        label.setText( "moveDown " );
        Utilities.sleep( 1000 );
        
        for( int i = 0; i < 60; i++ )
        {
            myCar.moveDown( 5 );
            Utilities.sleep( 20 );
        }
        
        locEndLabel = new TextBox( 270, 340 );
        locEndLabel.setSize( 290, 100 ); 
        locEndLabel.setText( "End Location" +
                            "\ngetXlocation = " +
                            myCar.getXLocation() +
                            "\ngetYLocation = " + 
                            myCar.getYLocation());
    }
    
    //-------------------- main ----------------------------------------
    /**
     * Just create a CarDriver object.
     * @param args String
     */
    public class Car<color> { //declaration of our class.
        private int y;
        private int x; //declaration of our X and Y variables used for coordinates

        public int getYLocation() { //gets the y location
            return y;
        }

        public void setYLocation(int y) { //sets the y location
            this.y = y;
        }

        public int getXLocation() { //gets the x location
            return x;
        }

        public void setXLocation(int x) { //sets the x location
            this.x = x;
        }

        public void setLocation(x, y){ //sets location to new coordinates
            this.setLocation(x,y);
        }

        public color setColor(Color){ //mutator for setting color, takes Color as parameter and sets it to it
            this.setColor(Color.Color);
        }

        public void moveDown(int a){ //mutator for get down, adds value a to the current Y which shifts it downward
            this.y = y + a;
            this.setLocation(x, y);
        }

        Car(){ //empty default constructor for Car
            Car myCar = new Car(); //creates new instance of our class car
            myCar.setLocation(0,0); //sets our default parameters for our car
        }

        Car(x, y){ //Car constructor that takes coordinates as parameter
            Car myCar = new Car(); //creates new instance of our class car
            myCar.setLocation(x,y); //sets our cars location to x + y values
        }
        Car(color){ //car constructor that takes color as parameter
            Car myCar = new Car(); //creates new instance of our class car
            myCar.setLocation(0,0); //sets default location
            myCar.setColor(Color.color); //sets default color
        }
    }
    public static void main( String[] args )
    {
        new Frame();
        new CarDriver();
    }
}
