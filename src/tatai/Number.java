package tatai;


public class Number {
	
	private int number;
	private int tens;
	private int ones;
	private String maoriNumber;
	
	private final String[] maori= new String[]{"tahi", "rua", "toru", "whaa", "rima", "ono", "whitu", "waru", "iwa"};
	private final String maoriTen = "tekau";
	private final String connecter = "maa";
	
	
	public Number(int number) {
		
		this.number = number;
		
			
	}
	
	public void splitNumber() {
		
		tens = number/10;
		ones = number - (tens*10);
		
	}
	
	public String outputMaoriNumber() {
		
		splitNumber();
		
		if (tens == 0) {
			maoriNumber = maori[ones - 1];
			return maoriNumber;
		}
		
		else if (ones == 0) {
			if (tens == 1) {
				return maoriTen;
				
			}
			else {
				maoriNumber = maori[tens - 1] + " " + maoriTen;
				return maoriNumber;
			}
		}
		
		else if (tens == 1){
			maoriNumber = maoriTen + " " + connecter + " " + maori[ones - 1];
			return maoriNumber;
		
		}
		
		else {
			maoriNumber = maori[tens - 1] + " " + maoriTen + " " + connecter + " " + maori[ones - 1];
			return maoriNumber;
		}
	}
	
	
}