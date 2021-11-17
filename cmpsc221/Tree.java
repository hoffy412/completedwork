import wheelsunh.users.*;

//import java.awt.color;


/**
 * Class that creates a Tree extended from ShapeGroup which implements Seasonal.java
 */
public class Tree extends ShapeGroup implements Seasonal
{
    /**
     * Constructor for tree without parameters
     */
    public Tree()
    {
        super();
        this.makeTree(0,0);
    }

    /**
     * Constructor for tree with parameters X and Y which are used to place the tree at those coordinates in the frame
     * @param x
     * @param y
     */
    public Tree( int x, int y)
    {
        super();
        this.makeTree( x , y );
    }

    /**
     * Method that makes the tree, parameters are where the base will be located in the frame
     * @param x
     * @param y
     */
    public void makeTree( int x, int y)
    {
        Rectangle base = new Rectangle();
        base.setSize( 20, 50 );
        base.setLocation( x, y );
        base.setColor( Color.BROWN );

        Ellipse leaves = new Ellipse();
        leaves.setSize( 30, 30 );
        leaves.setLocation( x, y+25);
        leaves.setColor( Color.GREEN );

        super.add( base );
        super.add( leaves );
    }

    /**
     * Method that moves the tree if desired. DX and DY are the amount the change will be by.
     * @param dx
     * @param dy
     */
    public void moveTree( int dx, int dy )
    {
        super.setLocation( super.getXLocation() + dx, super.getYLocation() + dy);
    }

    /**
     * Methods from the implementation that create the tree for the appropriate season. In this case Spring
     */
    @Override
    public void spring()
    {
        Tree sptree = new Tree( 350, 250);
    }

    /**
     * Method that makes a winter tree, adds snow to tree as it is winter.
     */
    @Override
    public void winter()
    {
        Tree wtree = new Tree(350, 250 );
        Ellipse snow = new Ellipse();
        snow.setLocation( wtree.getXLocation(), wtree.getYLocation() + 25);
        snow.setSize ( 20, 20 );
        snow.setColor( Color.White );
    }

    /**
     * Method that makes a tree in the summer
     */
    @Override
    public void summer()
    {
        Tree sutree = new Tree( 350, 250 );
    }

    /**
     * Method that makes a tree in the fall which has orange leaves
     */
    @Override
    public void fall()
    {
        Tree ftree = new Tree ( 350, 250 );
        ftree.leaves.setColor(Color.ORANGE);
    }

    /**
     * Main method which creates frame and trees that are called in it.
     * @param args
     */
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Tree sptree = new spring();
        Utilities.sleep(1000);
        Tree wtree = new winter();
        Utilities.sleep(1000);
        Tree sutree= new summer();
        Utilities.sleep(1000);
        Tree fall = new fall();
    }
}
