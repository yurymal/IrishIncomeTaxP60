package yury.graphics;




import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input {
	private Double totalPay;
	private Double taxDeducted;
	private Double GrossPayUSC;
	private Double USCdeucted;
	private Double RentPaid;
	private Double totalPaySpouse;
	private Double taxDeductedSpouse;
	private Double GrossPayUSCSpuse;
	private Double USCdeuctedSpouse;
	private Double MedicalExpencies;
	private MaritalStatus status;
	
	
	public void setStatus(MaritalStatus status){
		this.status = status;
	}
	
   
	public boolean setTotalPay(String string) {
		if (checkNumber(string)){
				totalPay = Double.parseDouble(string);
				System.out.println("Here");
				return true;
			}
		return false;
		
	}
	public boolean setTaxDeducted(String string) {
		if (checkNumber(string)){
				taxDeducted = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setGrossPayUSC(String string) {
		
			if (checkNumber(string)){
				GrossPayUSC = Double.parseDouble(string);
				return true;
			}
			return false;
		
	}
	public boolean setUSCdeucted(String string) {
		if (checkNumber(string)){
				USCdeucted = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setRentPaid(String string) {
		if (checkNumber(string)){
				RentPaid = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setTotalPaySpouse(String string) {	
		
			if (checkNumber(string)){
				totalPaySpouse = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setTaxDeductedSpouse(String string) {
		
			if (checkNumber(string)){
				taxDeductedSpouse = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setGrossPayUSCSpuse(String string) {
		
			if (checkNumber(string)){
				GrossPayUSCSpuse = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setUSCdeuctedSpouse(String string) {
		if (checkNumber(string)){
				USCdeuctedSpouse = Double.parseDouble(string);
				return true;
			}
			return false;
	}
	public boolean setMedicalExpencies(String string) {
		if (checkNumber(string)){
				MedicalExpencies = Double.parseDouble(string);
				return true;
			}
			return false;
	
	}
	
	private boolean checkNumber(String string){
		try {
				double number = Double.parseDouble(string);
				if (number >= 0)
					return true;
				}catch (RuntimeException ex){
					return false;
				}
				
		return false;
	}
}