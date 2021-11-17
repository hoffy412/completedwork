import wheelsunh.users.Ellipse;
import wheelsunh.users.Frame;
import wheelsunh.users.ShapeGroup;
import wheelsunh.users.Utilities;

/**
 * Class that creates either a hockey puck or ball depending on the method that is called.
 */
public class Hockey extends ShapeGroup implements Seasonal
{
    /**
     * Method that creates a hockey ball for springtime.
     */
    @Override
    public void spring()
    {
        Ellipse hockeyball = new Ellipse();
        hockeyball.setLocation(350, 250 );
        hockeyball.setSize( 15, 15 );
        hockeyball.setColor(Color.YELLOw); //yellow balls are softer and do better in the cooler tempatures when playing street hockey
    }

    /**
     * Mathod that creates a puck for winter time
     */
    @Override
    public void winter()
    {
        Ellipse wpuck = new Ellipse();
        wpuck.setColor(Color.BLACK);
        wpuck.setSize( 15, 15 );
        wpuck.setLocation( 350, 250 );
    }

    /**
     * Method that creates a hockey ball for summer
     */
    @Override
    public void summer()
    {
        Ellipse sball = new Ellipse();
        sball.setColor(Color.ORANGE);//orange balls are harder, and work better in the higher tempatures
        sball.setLocation( 350, 250);
        sball.setSize(12,12); //because these are harder they are usually a little bit smaller, but not much
    }

    /**
     * Method that creates a puck for the fall time.
     */
    @Override
    public void fall()
    {
        Ellipse fpuck = new Ellipse();
        fpuck.setColor( Color.BLACK);
        fpuck.setSize( 15, 15 );
        fpuck.setLocation( 350, 250 );
    }

    /**
     * Main method, creates a frame and calls methods to display them.
     * @param args
     */
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Hockey fpuck = new fall();
        Utilities.sleep(1000);
        Hockey suball = new summer();
        Utilities.sleep(1000);
        Hockey wpuck = new winter();
        Utilities.sleep(1000);
        Hockey spball = new spring();
    }
    }
}
