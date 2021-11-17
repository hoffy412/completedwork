import wheelsunh.users.*;
import java.awt.color;

public class Car extends ShapeGroup implements Seasonal
{
    /**
     * Default constructor that makes a car at coordinates (0,0)
     */
    public Car()
    {
        super();
        this.makeCar(0,0);
    }

    /**
     * Constructor that makes a car at coordinates passed as parameters
     * @param x
     * @param y
     */
    public Car( int x, int y)
    {
        super();
        this.makeCar( x , y );
    }

    /**
     * Method that makes the car at the coordinates that are passed as parameters
     * @param x
     * @param y
     */
    public void makeCar( int x, int y)
    {
        Rectangle body = new Rectangle();
        body.setLocation( x, y );
        body.setSize ( 100, 100);
        body.setColor( Color.RED);

        Ellipse wheel1 = new Ellipse();
        wheel1.setLocation(x + 25, y + 100);
        wheel1.setSize(20,20);
        wheel1.setColor(Color.Black);

        Ellipse wheel2 = new Ellipse();
        wheel2.setLocation( x + 75, y + 100);
        wheel2.setSize(20,20);
        wheel2.setColor( Color.Black );

        RoundedRectangle roof = new RoundedRectangle();
        roof.setLocation( x + 50, y);
        roof.setSize(50, 25 );
        roof.setColor( Color.Gray );

        super.add(body);
        super.add(roof);
        super.add(wheel1);
        super.add(wheel2);
    }

    /**
     * Method that moves the car if wanted by amount of the passed parameters DX in the X coordinate and DY in the Y coordinate
     * @param dx
     * @param dy
     */
    public void Move( int dx, int dy )
    {
        super.setLocation( super.getXLocation() + dx, super.getYLocation() + dy);
    }

    /**
     * Spring method which creates a car with winter tires in case of snow, and the convertible roof in case its nice out.
     */
    @Override
    public void spring()
    {
        Car spcar = new Car();
        spcar.wheel1.setSize(30, 30);
        spcar.wheel2.setSize(30, 30);
        spcar.roof.hide();
    }

    /**
     * Winter method which creates a car in the winter which has bigger tires.
     */
    @Override
    public void winter()
    {
        Car wcar= new Car( 350, 250 );
        wcar.wheel1.setSize( 30, 30 );
        wcar.wheel2.setSize( 30, 30 );
    }

    /**
     * Summer method which creates a car in the summer which is a convertible and does not have a roof
     */
    @Override
    public void summer()
    {
        Car summer = new Car(350, 250 );
        super. roof.hide();
    }

    /**
     * Fall method which just creates the normal default car
     */
    @Override
    public void fall()
    {
        Car fall = new Car( 350, 250 );
    }

    /**
     * main method which creates the frame and implements the methods to create the cars on the frame.
     * @param args
     */
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Car spcar = new spring();
        Utilities.sleep(1000);
        Car wcar = new winter();
        Utilities.sleep(1000);
        Car sucar = new summer();
        Utilities.sleep(1000);
        Car fcar = new fall();

    }
}