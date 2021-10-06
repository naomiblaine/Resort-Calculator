// Exercise on pages 745 - 748
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

 public class JResortCalculator extends JFrame implements ItemListener
 {

  // instance variables for this class
 	final int BASE_PRICE = 200;
 	final int WEEKEND_PREMIUM = 100;
 	final int BREAKFAST_PREMIUM = 20;
 	final int GOLF_PREMIUM = 75;
 	int totalPrice = BASE_PRICE;

 	JCheckBox weekendBox = new JCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);
 	JCheckBox breakfastBox = new JCheckBox("Breakfast premium $" + BREAKFAST_PREMIUM, false);
 	JCheckBox golfBox = new JCheckBox("Golf premium $" + GOLF_PREMIUM, false);
 	JLabel resortLabel = new JLabel("Resort Price Calculator");
 	JLabel optionExplainLabel = new JLabel ("Base price for a room is $" + BASE_PRICE);
 	JLabel optionExplainLabel = new JLabel("Check off any add-ons you wish.");
 	JLabel Pricelabel = new JLabel("The price for your stay is:");
 	JTextField totPriceField = new JTextField(4);



    // custom constructor for this class
    public JResortCalculator()
    {
    	super("Resort Price Calculator");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new FlowLayout());
    	add(resortLabel);
    	add(optionExplainLabel);
    	add(optionExplainLabel2);
    	add(weekendBox);
    	add(breakFastBox);
    	add(golfBox);
    	add(priceLabel);
    	add(totPriceField);

    	// when app loads, set the totalPrice into the field
    	totPriceField.setText("$" + totalPrice);
    	// add event listeners to the check boxes
    	weekendBox.addItemListener(this);
    	breakFastBox.addItemListener(this);
    	golfBox.addItemListener(this);

    }

    //Event handling method
    @Override
    public void (itemEvent event)
    {
    	Object source = event.getSource();
    	int select =event.getStateChange();
    }


 	public static void main(String[] args)
 	{

 	}
 }

