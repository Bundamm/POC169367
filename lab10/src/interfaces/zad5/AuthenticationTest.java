package interfaces.zad5;

public class AuthenticationTest {
    public static void main(String[] args) {
        Authentication userAuth = new UserAuthentication();
        boolean userLoginResult = userAuth.login("123","password");
        System.out.println(userLoginResult);
        userAuth.logout();
        boolean resetPasswordResult = userAuth.resetPassword("123","password","password2");
        System.out.println(resetPasswordResult);
    }


}
