public class DateDemo{
	public static void main(String[] args){
		DateFirstTry d1=new DateFirstTry();
		DateSecondTry d2=new DateSecondTry();
		DateThirdTry d3=new DateThirdTry();
		//---------------------------
		//---Begin to Modify---
		//---------------------------
		d1.month = "July";
		d1.day = 7;
		d1.year = 2013;
		
		d2.readInput();
		
		d3.setDate(6,17,2013);
		//---------------------------
		//---End to Modify-----
		//---------------------------
		d1.writeOutput();
		d2.writeOutput();
		d3.writeOutput();
	}

}