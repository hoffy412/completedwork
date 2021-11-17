/**
 * Program creates a class extended from Car, which makes a flying car
 *
 * @author Hunter Hoffman
 */

import wheelsunh.users.*;


/**
 * Class extended from Car that creates a Flying Car model
 *
 */
public class Flying_Car extends Car
{
    /** Constructer for Flying Car that builds the car by default at 0, 0
     *
     */
    public Flying_Car()
    {
        this.makeCar(0,0);
        Rectangle wing = new Rectangle();
        wing.setLocation(50, 50); //sets wing in the middle of the car
        //wing.setColor(Color.Blue); //wing color set to blue to decipher from rest of car
        //my java.awt would not work, so I have commented out the code
        wing.setSize(25, 25); //sets size of the wing
    }

    /**Constructor for Flying Car that takes two integers, X and Y for coordinates to place the car
     *
     * @param x
     * @param y
     */
    public Flying_Car(int x, int y)
    {
        this.makeCar(x, y);
        Rectangle wing2 = new Rectangle();
        wing2.setLocation(x + 50, y + 50); //sets wing in the middle of the car
        wing2.setSize(25, 25); //sets size of the wing
        //wing2.setColor(Color.Blue); //wing color set to blue to dechipher from rest of the car
    }

    /**Main method for running the code in the class
     *
     * @param args
     */
    public static void main(String[] args){
        Frame F = new Frame();
        Car Car = new Car();
        Utilities.sleep(1000);
        Flying_Car fc1 = new Flying_Car();
        Utilities.sleep(1000);
        Flying_Car fc2 = new Flying_Car(50, 30);
        Utilities.sleep(1000);
    }
}
