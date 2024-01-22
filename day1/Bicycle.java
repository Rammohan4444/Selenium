package week1.day1;

public class Bicycle {
	private void Cyclecolor() {
		// TODO Auto-generated method stub
		System.out.println("Grey");
	}
	public void Cyclewheels() {
		System.out.println("2");
		
	}
	public void Cyclebrand() {
		System.out.println("VITA");
		
	}
	public boolean CycleBrake() {
		return true;
		
	}
	public String CycleName() {
		return "CTS";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle obj = new Bicycle();
		obj.Cyclecolor();
		obj.Cyclewheels();
		obj.Cyclebrand();
		System.out.println(obj.CycleName());
		System.out.println(obj.CycleBrake());
	}

}
