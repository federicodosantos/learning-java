package OOP.util;

import OOP.Data.LoginRequest;
import OOP.Error.ValidationException;

public class ValidationUtil {
    public static void ValidationException(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        }
    }
}
