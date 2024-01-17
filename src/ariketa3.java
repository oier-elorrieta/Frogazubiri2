import java.util.Scanner;

public class ariketa3 {
		public static void main (String [] args){
			// TODO Auto-generated method stub
			Scanner teklatua = new Scanner(System.in);
			String lerroa = "";
			System.out.println("Esan zenbaki bat");
			lerroa=teklatua.nextLine();
			
			for (int i=0; i<lerroa.length(); i++) {
				
				System.out.println(lerroa.charAt(i));
			}
			
			
			teklatua.close();
}
}