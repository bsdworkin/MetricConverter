package swing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class Converter extends JFrame{
	//Creating text fields to be put into the "Distance" Tab
	JTextField metersTxt = new JTextField(), feetTxt = new JTextField(), milesTxt = new JTextField(), 
			inchesTxt = new JTextField(), cmTxt = new JTextField(), kmTxt = new JTextField(); 
	//Creating text fields to be put into the Energy tab
	JTextField calTxt = new JTextField(), kcalTxt = new JTextField(), jTxt = new JTextField(), 
			kjTxt = new JTextField(), gjTxt = new JTextField(), mjTxt = new JTextField();
	
	
	public Converter(){
		   //Creating the GUI object for frame 
		   JFrame frame = new JFrame("Distance/Energy Converter");
		   frame.setSize(600, 600);
		   frame.setVisible(true);
		   
		   
		   //Making an instance of a tabbedPane to be able to add 2 panes. 
		   JTabbedPane tabbedPane = new JTabbedPane();
		   
		   //Making the first tab to convert distance values 
		   JPanel panel1 = new JPanel(true);
		   tabbedPane.addTab("Distance", panel1);
		   panel1.setLayout(new GridLayout(0,6));
		   
		   //A second tab to switch to energy conversions
		   JPanel panel2 = new JPanel(true);
		   tabbedPane.addTab("Energy", panel2);
		   panel2.setLayout(new GridLayout(0,6));
		   
		   //Add the tabbedPane to this panel.
	       frame.add(tabbedPane);
	       
	       //Creates labels for the "Distance" tab
	       JLabel meters = new JLabel("Meters");
	       JLabel feet = new JLabel("Feet");
	       JLabel miles = new JLabel("Miles");	       
	       JLabel inches = new JLabel("Inches");	       
	       JLabel cm = new JLabel("Centimeters");	      
	       JLabel km = new JLabel ("Kilometers");
	       
	       //Adding labels and text boxes to distance  in order to be formatted right 
	       panel1.add(meters); 
	       panel1.add(metersTxt);
	       panel1.add(feet); 
	       panel1.add(feetTxt);
	       panel1.add(miles); 
	       panel1.add(milesTxt);
	       panel1.add(inches); 
	       panel1.add(inchesTxt);
	       panel1.add(cm); 
	       panel1.add(cmTxt);
	       panel1.add(km); 
	       panel1.add(kmTxt);
	       
	       //Assigning a name to JTextFile for distance 
		   metersTxt.setName("meters");
		   feetTxt.setName("feet");
		   milesTxt.setName("miles");
		   inchesTxt.setName("inches");
		   cmTxt.setName("cm");
		   kmTxt.setName("km");
	       
	       //Allowing the user to edit the text boxes 
	       metersTxt.setEditable(true);
	       feetTxt.setEditable(true);
	       milesTxt.setEditable(true);
	       inchesTxt.setEditable(true);
	       cmTxt.setEditable(true);
	       kmTxt.setEditable(true);
	       
	     //Assigning a default text to JTextFile for distance 
		   metersTxt.setText("1609.34");
		   feetTxt.setText("5280.0");
		   milesTxt.setText("1");
		   inchesTxt.setText("63360.0");
		   cmTxt.setText("160934.0");
		   kmTxt.setText("1.60934");
		   
		 //Assigning a default text to JTextFile for energy 
		   calTxt.setText("238845.8966275");
		   kcalTxt.setText("238.8458966275");
		   jTxt.setText("1000000.0");
		   kjTxt.setText("1000.0");
		   gjTxt.setText("0.001");
		   mjTxt.setText("1");

	       
	       //Attaching the metric listener to each JTextField 
		   metersTxt.addActionListener(new MetricListener(this));
		   feetTxt.addActionListener(new MetricListener(this));
		   milesTxt.addActionListener(new MetricListener(this));
		   inchesTxt.addActionListener(new MetricListener(this));
		   cmTxt.addActionListener(new MetricListener(this));
		   kmTxt.addActionListener(new MetricListener(this));
		   
		   //Creating Labels for the Energy tab
		   JLabel calorie = new JLabel("Calorie");
	       JLabel kcalorie = new JLabel("Kilo Calorie");
	       JLabel joule = new JLabel("Joule");	       
	       JLabel kjoule = new JLabel("Kilo Joule");	       
	       JLabel gigajoule = new JLabel("Giga Joule");	      
	       JLabel megajoule = new JLabel ("Mega Joule");
	       
	       //Adding labels and text boxes to energy panel in order to be formatted right 
	       panel2.add(calorie); 
	       panel2.add(calTxt);
	       panel2.add(kcalorie); 
	       panel2.add(kcalTxt);
	       panel2.add(joule); 
	       panel2.add(jTxt);
	       panel2.add(kjoule); 
	       panel2.add(kjTxt);
	       panel2.add(gigajoule); 
	       panel2.add(gjTxt);
	       panel2.add(megajoule); 
	       panel2.add(mjTxt);
	       
	     //Assigning a name to JTextFile for energy 
		   calTxt.setName("cal");
		   kcalTxt.setName("kcal");
		   jTxt.setName("j");
		   kjTxt.setName("kj");
		   gjTxt.setName("gj");
		   mjTxt.setName("mj");
		   
		   //Allowing the user to edit the text boxes 
	       calTxt.setEditable(true);
	       kcalTxt.setEditable(true);
	       jTxt.setEditable(true);
	       kjTxt.setEditable(true);
	       gjTxt.setEditable(true);
	       mjTxt.setEditable(true);
	       
	       //Attaching the metric listener to each JTextField 
		   calTxt.addActionListener(new DistanceListener(this));
		   kcalTxt.addActionListener(new DistanceListener(this));
		   jTxt.addActionListener(new DistanceListener(this));
		   kjTxt.addActionListener(new DistanceListener(this));
		   gjTxt.addActionListener(new DistanceListener(this));
		   mjTxt.addActionListener(new DistanceListener(this));
	       
	       //To clean up interface and close it when close the window 
	       frame.pack();
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public static void main(String args[]){
		Converter mf = new Converter();
	}
		


}
