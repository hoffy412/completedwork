/**
 * Class that makes a car
 * @author Hunter Hoffman
 */


import wheelsunh.users.*;
//import java.awt.Color;

/**
 * Class that builds a car using inheritance by extending from Shape Group
 *
 * @params integers X, Y
 */
public class Car extends ShapeGroup {
    protected int x;
    protected int y;

    /**
     * Default Constructor that builds a car at position (0,0) with no parameters
     */
    public Car() {
        super();
        this.makeCar(0, 0);
    }


    /**
     * Constructor that takes in integer inputs X and Y for coordinates to locate the car
     * @param x
     * @param y
     */
    public Car(int x, int y) {
        super();
        this.makeCar(x, y);
    }

    /**
     * Method that moves the car's position when called upon, takes parameters DX and DY which are the integer value we
     * want the car to be moved by
     *
     * @param dx
     * @param dy
     */
    public void moveCar(int dx, int dy) {
        super.setLocation(super.getXLocation() + dx, super.getYLocation() + dy);
    }

    /**
     * Method for creating the car, takes integer inputs X and Y for locating the Car in the frame
     *
     * @param x
     * @param y
     */
    public void makeCar(int x, int y) {
        Rectangle body = new Rectangle();
        body.setLocation(x, y);
        body.setSize(100, 100);
        //body.setColor(Color.Red);

        Ellipse wheel1 = new Ellipse();
        wheel1.setLocation(x + 25, y + 100);
        wheel1.setSize(15, 15);
        //wheel1.setColor(Color.BLACK);

        Ellipse wheel2 = new Ellipse();
        wheel2.setLocation(x + 75, y + 100);
        wheel2.setSize(15, 15);
        //wheel2.setColor(Color.BLACK);

        RoundedRectangle roof = new RoundedRectangle();
        roof.setSize(25, 25);
        roof.setLocation(x + 25, y);
        //roof.setColor( Color. RED);

        super.add(roof);
        super.add(body); //adding the parts of the car to the super so they can be used later
        super.add(wheel1);
        super.add(wheel2);
    }

    /**
     * Main method which allows the frame and car to be built
     * 
     * @param args
     */
    public static void main( String[] args ){
        Frame nf = new Frame();
        Utilities.sleep(1000);
        Car car1 = new Car();
        Utilities.sleep(1000);
        Car car2 = new Car(40, 22);
        car1.moveCar(30, 50);
        Utilities.sleep(1000);
        car2.moveCar(20, 30);
    }
}