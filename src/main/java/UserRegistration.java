import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String First_Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";

    /*
    Method to validate First Name Of the User with first letter Capital and at least three Character
     and throwing Custom Exception.
     */
    public boolean validateFirstName(String fname) throws CustomException {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        if (pattern.matcher(fname).matches()) {
            return true;
        }
        throw new CustomException("Invalid Input");
    }

    private static final String Last_Name_Pattern = "^[A-Z]{1,}[a-z]{3,}+\s+[A-Z]{1,}[a-z]{2,}$";

    /*
    Method to validate Last Name Of the User with first letter Capital and at least three Character
     and throwing Custom Exception.
     */
    public boolean validateLastName(String lname) throws CustomException{
        Pattern pattern=Pattern.compile(Last_Name_Pattern);
        Matcher matcher= pattern.matcher(lname);
        if (matcher.matches()){
            return true;
        }else {
            throw new CustomException("Invalid Input");
        }
    }

    private static final String MobileNumber_Pattern = "^91{1}" + "\s" + "[0-9]{10,}$";
    /*
  Method to validate mobile number with country code and 10 digits and throwing Custom Exception.
  */
    public boolean vaildateMobileNumber(String MobileNumber) throws CustomException {
        Pattern pattern = Pattern.compile(MobileNumber_Pattern);
        if (pattern.matcher(MobileNumber).matches()) {
            return true;
        }
        throw new CustomException("Invalid Input");
    }

    private static final String Password_Pattern = "(?=.*[A-Z])" + "(?=.*[0-9])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,}";

    /*
     Validating password which has at least 8 character one uppercase letter and one numeric number and
      at least one special character and no whitespace allowed and throwing Custom Exception.
     */
    public boolean vaildatePassword(String Password) throws CustomException {
        Pattern pattern = Pattern.compile(Password_Pattern);

        if (pattern.matcher(Password).matches()) {
            return true;
        }
        throw new CustomException("Invalid Input");
    }

    private static final String Email_Pattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*" + "@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}([.]{2,4})?$";

    /*
    Validating email with Special Character and .com and some numeric words and throwing Custom Exception
     */
    public boolean vaildateEmail(String email) throws CustomException {
        Pattern pattern = Pattern.compile(Email_Pattern);
        if (pattern.matcher(email).matches()) {
            return true;
        }
        throw new CustomException("Invalid Input");


    }
}
