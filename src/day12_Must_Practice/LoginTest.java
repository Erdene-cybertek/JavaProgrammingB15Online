package day12_Must_Practice;

public class LoginTest {

    public static void main(String[] args) {

        String userName = "" , password = "";
        userName ="user123";
        password ="pass123";

        // ! ---->  boolean, boolean expression,

        if (userName.equals("user123") && password.equals("pass123") ) {
            System.out.println("Login Successful");

        } else if (! userName.equals("user123") && password.equals("pass123")) {
            System.out.println("user name is not correct");

        } else if ( userName.equals("user123") && ! password.equals("pass123")) {
            System.out.println("password is not correct");

        } else {
            System.out.println("username and password are both incorrect");
        }


    }
}
