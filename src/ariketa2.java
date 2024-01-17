import java.util.Scanner;

public class ariketa2 {
	public static void main (String [] args){
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		String lerroa = "";
		int zbk=0, batura=0;
		System.out.println("Erabiliko duzun zenbaki bikoiti batura egiteko da: ");
		lerroa=teklatua.nextLine();
		zbk=Integer.parseInt(lerroa);
		while (zbk!=0) {
			if (zbk % 2 == 0)
			batura=batura+zbk;
			zbk--;	
		}
		System.out.println(batura);
		}
		//teklatua.close();
}