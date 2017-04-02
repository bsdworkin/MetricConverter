package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DistanceListener implements ActionListener
{
	private Converter c;
	
	
	public DistanceListener(Converter c){
		this.c = c;
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Getting where the action takes place 
				JTextField txt = new JTextField();
				txt = (JTextField) e.getSource();
				
				//Variables to hold values for conversions 
				double cal = 0, kcal = 0, joule = 0, kj = 0, gj = 0, mj = 0;
				
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
					
					//Making sure the value isnt less than zero
					if (value < 0){
						JOptionPane.showMessageDialog(null, "Error: Please enter a postivie number", "Error Message", 
								JOptionPane.ERROR_MESSAGE);
					}
					else if (value >= 0){
						
						//The following if statements are seeing which JTextField is being changed	
						if(txtName.equals("cal")){
							
							//Creating Conversions and storing values
							cal = value;
							kcal = value * .001;
							joule = value * 4.1868;
							kj = value * .004184;
							gj = value * .0000000041868;
							mj = value * .0000041868;
							
							//Applying the converted values to respected places
							c.calTxt.setText(Double.toString(cal));
							c.kcalTxt.setText(Double.toString(kcal));
							c.jTxt.setText(Double.toString(joule));
							c.kjTxt.setText(Double.toString(kj));
							c.gjTxt.setText(Double.toString(gj));
							c.mjTxt.setText(Double.toString(mj));	
							
						}
						else if (txtName.equals("kcal")){
							
							//Creating Conversions and storing values
							cal = value * 1000;
							kcal = value;
							joule = value * 4186.8;
							kj = value * 4.1868;
							gj = value * .000004184;
							mj = value * .004184;
							
							//Applying the converted values to respected places
							c.calTxt.setText(Double.toString(cal));
							c.kcalTxt.setText(Double.toString(kcal));
							c.jTxt.setText(Double.toString(joule));
							c.kjTxt.setText(Double.toString(kj));
							c.gjTxt.setText(Double.toString(gj));
							c.mjTxt.setText(Double.toString(mj));	
						}
						else if (txtName.equals("j")){
							
							//Creating Conversions and storing values
							cal = value * 0.2388458966275;
							kcal = value * 0.0002388458966275 ;
							joule = value;
							kj = value * .001;
							gj = value * .000000001;
							mj = value * .000001;
							
							//Applying the converted values to respected places
							c.calTxt.setText(Double.toString(cal));
							c.kcalTxt.setText(Double.toString(kcal));
							c.jTxt.setText(Double.toString(joule));
							c.kjTxt.setText(Double.toString(kj));
							c.gjTxt.setText(Double.toString(gj));
							c.mjTxt.setText(Double.toString(mj));	
						}
						else if (txtName.equals("kj")){
							
							//Creating Conversions and storing values
							cal = value * 238.8458966275;
							kcal = value * 0.2388458966275;
							joule = value * 1000;
							kj = value ;
							gj = value * .000001;
							mj = value * .001;
							
							//Applying the converted values to respected places
							c.calTxt.setText(Double.toString(cal));
							c.kcalTxt.setText(Double.toString(kcal));
							c.jTxt.setText(Double.toString(joule));
							c.kjTxt.setText(Double.toString(kj));
							c.gjTxt.setText(Double.toString(gj));
							c.mjTxt.setText(Double.toString(mj));	
						}
						else if (txtName.equals("gj")){
							
							//Creating Conversions and storing values
							cal = value * 238845896.6275;
							kcal = value * 238845.8966275;
							joule = value * 1000000000;
							kj = value * 1000000;
							gj = value;
							mj = value * 1000;
							
							//Applying the converted values to respected places
							c.calTxt.setText(Double.toString(cal));
							c.kcalTxt.setText(Double.toString(kcal));
							c.jTxt.setText(Double.toString(joule));
							c.kjTxt.setText(Double.toString(kj));
							c.gjTxt.setText(Double.toString(gj));
							c.mjTxt.setText(Double.toString(mj));	
						}
						else if (txtName.equals("mj")){
							
							//Creating Conversions and storing values
							cal = value * 238845.8966275;
							kcal = value * 238.8458966275;
							joule = value * 1000000;
							kj = value * 1000;
							gj = value * 0.001;
							mj = value;
							
							//Applying the converted values to respected places
							c.calTxt.setText(Double.toString(cal));
							c.kcalTxt.setText(Double.toString(kcal));
							c.jTxt.setText(Double.toString(joule));
							c.kjTxt.setText(Double.toString(kj));
							c.gjTxt.setText(Double.toString(gj));
							c.mjTxt.setText(Double.toString(mj));	
						}
						
					}
				//To make sure the input is numerical 
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Error: Please enter a number", "Error Message", 
							JOptionPane.ERROR_MESSAGE);
				}
				
				
	}

}
