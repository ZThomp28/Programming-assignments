import javax.swing.JOptionPane;
public class ProgramExersize3 {

	public static void main(String[] args) {
		String milesdriven = JOptionPane.showInputDialog("How many miles have you drove?");
		String gallonsused = JOptionPane.showInputDialog("How many gallons were used?");
		
		double miles, gallons;
		
		miles = Double.parseDouble(milesdriven);
		gallons = Double.parseDouble(gallonsused);
		
		double mpg = miles / gallons;
		
		JOptionPane.showMessageDialog(null, mpg + " miles per gallon");
		
		System.exit(0);

	}

}
