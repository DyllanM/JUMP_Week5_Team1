
package Exceptions;

public class LoginInvalidException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public LoginInvalidException(String message)
	{
		super(message);
	}
}



/*package Exceptions;

public class PasswordShortException extends Exception {

	private static final long serialVersionUID = 1L;

	public PasswordShortException(String message) {
    super(message);

	}
}

try {
	//Checks if password is long enough
	if(password.length() < 9){
		throw new PasswordShortException("Invalid, needs to be at least 8 characters long");
}
catch(PasswordShortException e){
	System.out.println("Password too short");
}

*/