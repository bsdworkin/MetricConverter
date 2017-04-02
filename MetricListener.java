package swing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MetricListener implements ActionListener
{
	
	private Converter c;
	
	
	public MetricListener(Converter c){
		this.c = c;
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
		//Getting where the action takes place 
		JTextField txt = new JTextField();
		txt = (JTextField) e.getSource();
		
		//Variables to hold values for conversions 
		double meters = 0, feet = 0, miles = 0, inches = 0, cm = 0, km = 0;
		
		//Used to get the name of JTextField that gets changed
		String txtName = null;
		txtName = txt.getName();
		
		try{
			//Extracting input from GUI
			String input = null;
			input = e.getActionCommand();
			
			//Turing the taken in value into type double 
			double value = 0;
			value = Double.parseDouble(input);
			
			if (value < 0){
				JOptionPane.showMessageDialog(null, "Error: Please enter a postivie number", "Error Message", 
						JOptionPane.ERROR_MESSAGE);
			}
			else if (value >= 0){
				
				//The following if statements are seeing which JTextField is being changed	
				if(txtName.equals("meters")){
						
					//Creating conversions from meters 
					meters = value;
					feet = value * .3048;
					miles = value * 0.000621371;
					inches = value * 39.3701;
					cm = value * 100;
					km = value * .001;
						
					//Applying the converted values to respected places
					c.metersTxt.setText(Double.toString(meters));
					c.feetTxt.setText(Double.toString(feet));
					c.milesTxt.setText(Double.toString(miles));
					c.inchesTxt.setText(Double.toString(inches));
					c.cmTxt.setText(Double.toString(cm));
					c.kmTxt.setText(Double.toString(km));
						
					
				}
				
				else if(txtName.equals("feet")){
					//Creating conversions from feet 
					meters = value * .3048;
					feet = value ;
					miles = value * 0.000189394;
					inches = value * 12;
					cm = value * 30.48;
					km = value * 0.0003048;
							
					//Applying the converted values to respected places
					c.metersTxt.setText(Double.toString(meters));
					c.feetTxt.setText(Double.toString(feet));
					c.milesTxt.setText(Double.toString(miles));
					c.inchesTxt.setText(Double.toString(inches));
					c.cmTxt.setText(Double.toString(cm));
					c.kmTxt.setText(Double.toString(km));
				}
				else if(txtName.equals("miles")){
					//Creating conversions from feet 
					meters = value * 1609.34;
					feet = value * 5280;
					miles = value;
					inches = value * 63360;
					cm = value * 160934;
					km = value * 1.60934;
							
					//Applying the converted values to respected places
					c.metersTxt.setText(Double.toString(meters));
					c.feetTxt.setText(Double.toString(feet));
					c.milesTxt.setText(Double.toString(miles));
					c.inchesTxt.setText(Double.toString(inches));
					c.cmTxt.setText(Double.toString(cm));
					c.kmTxt.setText(Double.toString(km));
				}
				else if(txtName.equals("inches")){
					//Creating conversions from feet 
					meters = value * 0.0254;
					feet = value * 0.0833333;
					miles = value * .0000157828;
					inches = value;
					cm = value * 2.54;
					km = value * .0000254;
							
					//Applying the converted values to respected places
					c.metersTxt.setText(Double.toString(meters));
					c.feetTxt.setText(Double.toString(feet));
					c.milesTxt.setText(Double.toString(miles));
					c.inchesTxt.setText(Double.toString(inches));
					c.cmTxt.setText(Double.toString(cm));
					c.kmTxt.setText(Double.toString(km));
				}
				else if(txtName.equals("cm")){
					//Creating conversions from feet 
					meters = value * 0.01;
					feet = value * 0.0328084;
					miles = value * .00000621371;
					inches = value * 0.393701;
					cm = value;
					km = value * .00001;
							
					//Applying the converted values to respected places
					c.metersTxt.setText(Double.toString(meters));
					c.feetTxt.setText(Double.toString(feet));
					c.milesTxt.setText(Double.toString(miles));
					c.inchesTxt.setText(Double.toString(inches));
					c.cmTxt.setText(Double.toString(cm));
					c.kmTxt.setText(Double.toString(km));
				}
				else if(txtName.equals("km")){
					//Creating conversions from feet 
					meters = value * 1000f;
					feet = value * 3280.84;
					miles = value * 0.621371;
					inches = value * 39370.1;
					cm = value * 100000;
					km = value;
							
					//Applying the converted values to respected places
					c.metersTxt.setText(Double.toString(meters));
					c.feetTxt.setText(Double.toString(feet));
					c.milesTxt.setText(Double.toString(miles));
					c.inchesTxt.setText(Double.toString(inches));
					c.cmTxt.setText(Double.toString(cm));
					c.kmTxt.setText(Double.toString(km));
				}
			}
				
		} catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Error: Please enter a number", "Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
