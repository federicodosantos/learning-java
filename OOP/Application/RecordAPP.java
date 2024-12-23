package OOP.Application;

import OOP.Data.LoginRequest;
import OOP.Data.Sedan;
import OOP.Error.ValidationException;
import OOP.util.ValidationUtil;

public class RecordAPP {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "123");

        try {
            ValidationUtil.ValidationException(loginRequest);
            System.out.println("Berhasil login");
        } catch (ValidationException | NullPointerException e) {
            System.out.printf("Terjadi kesalahan pada nilai request : %s", e.getMessage());
        }
    }
}