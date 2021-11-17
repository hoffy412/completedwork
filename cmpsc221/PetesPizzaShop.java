/**
 * @author Hunter Hoffman
 * Program that creats a Pizza Shop window and allows the user to order a pizza
 */

import java.awt.Component;

import java.awt.Font;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.Box;

import javax.swing.BoxLayout;

import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

import javax.swing.ScrollPaneConstants;

import javax.swing.SwingConstants;

/**
 * Main class of the program, calls all necessary things to create pizza app
 */
public class PizzaApp extends JFrame
{
    JCheckBox check[], check1[];
    Jlabel lab1;
    JRadioButton radio[];
    static String[] veggies = "Peppers, Onions, Mushrooms, Olives, Banana Peppers".split(",");
    static String[] meats = "Ham, Pepperoni, Sausage, Salami, Chicken, Steak".split(",");
    static String[] sizes = "Small, Medium, Large".split(",");
    static final String CLEAR = "clear";
    static final String TOTAL = "total";
    final ButtonGroup groupSizes = new ButtonGroup();
    final ButtonGroup groupSizes1 = new ButtonGroup();
    JPanel Veggies, Meats, Sizes;
    JTextArea textArea;
    static final private int[] SizePrices = {1000, 1100, 1200};

    /**
     * constructor that makes the pizza app
     */
    public PizzaApp()
    {
        super("Pizza Shop");
        radio = new JRadioButton[pizzaSizes.length];
        check = new JRadioButton[pizzatypes.length];
        check1 = new JCheckBox[pizzaToppings.length];
        JPanel options = makeOptions();
        add(options);
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * main function that creats the pizza app by calling standard constructor
      * @param args
     */
    public static void main(String[] args)
    {
        new PizzaApp();
    }

    /**
     * Panel for the options
     * @returns the completed panels
     */
    private JPanel makeOptions()
    {
        sizes = addRadioBoxes(sizes,"Pizza Sizes",radio, groupSizes);
        veggies = addCkBoxes(veggies, check);
        meats = addCkBoxes(meats, check1);
        JPanel sizetype = new JPanel();
        sizetype.setLayout(new GridLayout(1, 2, 15, 10));
        sizetype.add(sizes);
        JPanel buttonControls = new JPanel();
        buttonControls.setBorder(BorderFactory.createEmptyBorder(1,10,1,10));
        JButton clear = new JButton("clear");
        clear.setActionCommand(CLEAR);
        clear.addActionListener(new MyButtonListener());
        JButton total = new JButton("Process Selection");
        total.setActionCommand(TOTAL);
        total.addActionListener(new MyButtonListener());
        buttonControls.add(clear);
        buttonControls.add(total);
        JPanel si_ty_cont = new JPanel();
        si_ty_cont.setLayout(new GridLayout(2,1,15,15));
        si_ty_cont.add(sizetype);
        si_ty_cont.add(buttonControls);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,2,15,15));
        p.add(veggies);
        p.add(si_ty_cont);
        p.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel.completePanel = new JPanel();
        jlb1.setAlignmentX(Component.CENTER_ALIGNMENT);
        completePanel.setLayout(new BoxLayout(completePanel,BoxLayout,PAGE_AXIS));
        JLabel jlb = new JLabel("Your Order: ", SwingConstants.LEFT);
        textArea = new JTextArea();
        textArea.setRows(5);
        JScrollPane sp = new JScrollPane(textArea);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jlb1 = new JLabel("Welcome to Pete's Pizza!");
        jlb1.setFont(new Font("Courier New", FONT.BOLD, 20));
        jlb1.setForeground(COLOR.RED);
        completePanel.add(jlb1);
        completePanel.add(Box.createVerticalGlue());
        completePanel.add(p);
        completePanel.add(Box.createVerticalGlue());
        completePanel.add(jlb);
        completePanel(sp);
        return completePanel;
    }

    /**
     * method that calculates the price
     * @return Returns the total
     */
    private void price()
    {
        int total = 0, subTotal = 0;
        int priceindex = 0, priceindex1 = 0;
        for(int i = 0; i < radio.length;i++)
        {
            if (radio[i].isSelected())
            {
                priceindex = i;
                break;
            }
        }
        textArea.setText("");
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Pizza Type: %s%n", pizzatypes[priceindex1]));
        sb.append(String.format("Pizza size %s%n", pizzaSizes[priceindex]));
        sb.append("Toppings: ");
        total += PRICE_SIZES[priceindex];
        String accumTops = "";
        for (int i = 0; i<ckb.length, i++)
        {
            if (ckb[i].isSelected())
            {
                accumTops += "" + i + ",";
                subTotal += 150;
            }
        }
        if (!accumTops.isEmpty())
        {
           String[] orderedTops = accumTops.split(",");
           for(int i = 0; i < orderedTops.length; i++)
           {
               sb.append(String.format("%s, ",pizzaToppings[Integer.parse(orderedTops[i])]));
           }
        }
        else
        {
            sb.append(String.format("%s%n", "<no extras"));
        }
        total += subTotal;
        sb.append(String.format("\nAmount Due: $ %d.%2d%n", total / 100, total % 100));
        textArea.setText(sb.toString());
    }

    /**
     * Adds the radio boxes
     * * @param opts
     * @param title
     * @param jrb
     * @param bg
     * @returns the panel with radio boxes
     */
    private JPanel addRadioBoxes(String[] opts, String title, JRadioButton jrb[], ButtonGroup bg)
    {
        int rows = opts.length;
        JPanel p = new JPanel();
        addBorder(p);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        jlb1 = new JLabel(title);
        jlb1.setFont(new Font("Courier New", Font.ROMAN_BASELINE, 18));
        jlb1.setForeground(color.RED);
        p.add(jlb1);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(rows, 1));
        for (int i = 0; i<rows; i++)
        {
            jlb[i] = new JRadioButton(opts[i]);
            p1.add(jlb[i]);
            bg.add(jlb[i]);
        }
        p.add(p1);
        return p;
    }

    /**
     * adds the border to the panel
     * @param p
     */
    private void addBorder (JPanel p)
    {
        p.setBorder(BorderFactory.createLineBorder(color.RED));
    }

    /**
     * Adds the checkboxes to the panels
     * @param opts
     * @param checkbox
     * @returns checkboxes in panels.
     */
    private JPanel addCkBoxes(String[] opts, JCheckBox checkbox[])
    {
        int rows = opts.length;
        JPanel p = new Jpanel();
        addBorder(p);
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        jlb1 = new JLabel("Veggies are $0.50 each, Meats are $2.00 each and $1.50 after 2 are selceted",SwingConstants.LEFT);
        jlb1.setFont(new Font("Courier New" , Font.ROMAN_BASELINE,18));
        jlb1.setForeground(Color.RED);
        p.add(jlb1);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(rows,1));
        for (int i = 0; i< rows, i++)
        {
            checkbox[i] = new JCheckBox(opts[i]);
            p1.add(checkbox[i]);
        }
        p.add(p1);
        return p;
    }

    /**
     * method tells program what to do when clear button is clicked
     */
    private void clearButtons()
    {
        groupSizes.clearSelection();
        groupSizes1.clearSelection();
        for (int i = 0, i < ckb.length; i++);
        {
            ckb[i].setSelected(false);
        }
        textArea.setText("");
    }

    /**
     * Listener method which tells buttons what to do when clicked
     */
    class MyButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getActionCommand().equals(CLEAR))
            {
                clearButtons();
            }
            else if (e.getActionCommand().equals(TOTAL))
            {
                price();
            }
        }
    }
}
