import java.util.Scanner;

public class ariketa1 {
	public static void main (String [] args){
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		String lerroa = "";
		double soldata = 0, atx = 0;
		System.out.println("Sartu soldata");
		lerroa = teklatua.nextLine();
		soldata=Integer.parseInt(lerroa);
		if (soldata<1000) {
			atx=soldata*0.9;
		} else if (soldata>1000)
			atx=soldata*0.86;
		else {
			atx=soldata*0.88;
		}	System.out.println("Soldata: "+atx);
			
			

		teklatua.close();
}
}