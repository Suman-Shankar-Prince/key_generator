 package password;

public class Password {
	
	static {
		System.out.println("Password must contains these parameters : \n"
				+ "1. Must be more than 9 character and less than 19 characters\n"
				+ "2. Must contain 1 special symbol\n"
				+ "3. Must contains minimum 2 upper case and 2 lower case characters\n"
				+ "4. Must contain 1 numeric vaule\n"
				+ "Warning: Do not include spaces.\n"
				+ "___________________________________________________________________");
		devStatus = true;
		testStatus= false;
	}
	
	private String password;
	private char[] passWord;
    protected static final char[] specialCharacter= {'!','@','#','$','%','&','*','?','\\'};
	static final boolean devStatus;
	public static final boolean testStatus;
	static int counter=0;
	static long count=0;
		
	public Password(String string) {
		counter += 1;
		setPassword(string);
		if(checkLength()&&checkCharacter()&&checkCase()&&checkNumeric()&&checkGarbage()) 
			//System.out.println("Accepted");	
			count+=1;
		else 
			setPassword("");
		    //System.out.println("Not Accepted");
	}
	
	private boolean checkLength() {
		if(password.length()>=10 && password.length()<=19)
			return true;
		return false;			
	}
	
	private boolean checkCharacter() {
		for(var i = 0  ; i< passWord.length;++i)
			for(int j =0 ; j< specialCharacter.length;++j)
				if(passWord[i] == specialCharacter[j])
					return true;
		return false;
	}
	
	private boolean checkCase(){
		int lowerCase=0, upperCase=0;
		for(var i = 0 ; i< passWord.length; ++i)
			if(Character.isLowerCase(passWord[i]))
				lowerCase+=1;
			else if(Character.isUpperCase(passWord[i]))
				upperCase+=1;
		return upperCase>=2 && lowerCase>=2?true:false;
	}
	
	
	private boolean checkNumeric(){
		for(var i = 0 ; i< passWord.length;++i)
			if(Character.isDigit(passWord[i]))
				return true;
		return false;
	}
	
	private boolean checkGarbage() {
		if(password.contains(" ") || password.contains("\u0000"))
			return false;
		return true;
	}

	protected String getPassword() {
		return password;
	}
	
	private void setPassword(String password) {
		this.password = password;
		setPassWord();
	}
	
	private void setPassWord() {
		this.passWord= getPassword().toCharArray();
	}
}


