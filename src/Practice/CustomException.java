package Practice;

import java.util.Arrays;
import java.util.List;

public class CustomException {

	public static void validateEmail(String email) throws DomainNotValidException {
		List<String> validDomains = Arrays.asList("gmail.com", "yahoo.com", "outlook.com");

		  if (!isDomainValid(email)) {
	            throw new DomainNotValidException("Invalid domain");
	        }
	    }

	    private static boolean isDomainValid(String email) {
	        List<String> validDomains = Arrays.asList("gmail.com", "yahoo.com", "outlook.com");
	        if (validDomains.contains(email.substring(email.indexOf("@") + 1))) {
	            return true;
	        }
	        return false;
	    }
	    public static void main(String[] args) {
	    	try {
	    	CustomException.validateEmail("abc@gmail1.com");
	    }
	    	catch(DomainNotValidException e) {
	    		System.out.println("Exception" +e);
	    	}
 }
}

class DomainNotValidException extends RuntimeException {

    public DomainNotValidException(String message) {
        super(message);
    }
}