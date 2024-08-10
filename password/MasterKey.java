package password;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MasterKey extends Password{
	
	private static Random r = new Random();
	private static MasterKey m;
	
	protected static class Wallet extends Thread{
		static {
			System.out.println("Password generator initiated\n"
					+"___________________________________________________________________");	
		}
		
		protected List<String> passCodes = new ArrayList<>();
		Wallet(){
			//System.out.println("List initiated");
			for(var i = 0 ; i< 5; ++i)
				do
					m = new MasterKey(algorithm());
				while(m.getPassword().isEmpty()?true:passCodes.add(m.getPassword())?false:true);		
		 }
	}
		
	private static String algorithm() {
		String string= "";
		for(var i = 0; i< r.nextInt(10,20); ++i)
			string+=choice(r.nextInt(1,4));
		System.out.println(string);
		return string;
	}
	
	private static char choice(int choice) {
		switch(choice) {
		case 1:
			String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] capital= string.toCharArray();
			char[] small= string.toLowerCase().toCharArray();	
			if (r.nextBoolean())
				return small[r.nextInt(0,small.length)];
			else return capital[r.nextInt(0,capital.length)];
			
		case 2:
			return specialCharacter[r.nextInt(0,specialCharacter.length)];
			
		case 3:
			char[] numeric = "0123456789".toCharArray();
			return numeric[r.nextInt(0,numeric.length)];
			
		default:
			return '\u0000';
		}
	}
		
	public MasterKey(String string) {
		super(string);
	}
		
	public static void main(String[] args) {
		Wallet w = new Wallet();
		System.out.println("-----------------------Generated codes are-------------------------");
		for(var i: w.passCodes)
			System.out.println(i);
		System.out.println(counter+" tries occour to harness "+count+" codes processing yield is "+ (100-(float)counter/count)+"%");
		System.out.println("----------------------------Odem/\\Codes-----------------------------\n"+w);
		
	}	
}
