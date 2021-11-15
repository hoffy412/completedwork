import wheelsunh.users.*;

/**
 * Subclass of car that is extended from Car. Uses inheritance to build upon already made Car class to add modifications
 * to easily create the submarine car
 */
public class SubCar extends Car
{
    /**
     * Constructor for submarine car that has no paramaters and places the submarine car at (0,0) by default
     */
    public SubCar()
    {
        this.makeCar(0,0);
        RoundedRectangle subBody1 = new RoundedRectangle();
        subBody1.setLocation(0, 0);
        //subBody1.setColor( Color.YELLOW );
        subBody1.setSize( 100, 100);
    }


    /**
     * Constructor for submarine car that takes integers X and Y as parameters for coordinates to place submarine car in frame
     * @param x
     * @param y
     */
    public SubCar(int x, int y) {
        this.makeCar( x, y);
        RoundedRectangle subBody = new RoundedRectangle();
        subBody.setLocation(x, y);
        //subBody.setColor( Color.YELLOW);
        subBody.setSize(100, 100);
    }

    /**
     * Main method for running the code in the class
     * @param args
     */
    public static void main(String[] args)
    {
        Frame f3 = new Frame();
        SubCar sc1 = new SubCar();
        Utilities.sleep(1000);
        SubCar sc2 = new SubCar(70, 80);
        Utilities.sleep(1000);
    }
}
