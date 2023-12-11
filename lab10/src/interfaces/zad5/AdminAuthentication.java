package interfaces.zad5;

public class AdminAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        return true;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return true;
    }
}
