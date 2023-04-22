package dtos.response;

import java.time.LocalDate;

public class UserRegistrationResponse {
    private String fullName;
    private LocalDate timeCreated;

    public String toString() {
        return String.format("""
                        UserName: %s
                        Password: %s
                        Time created: %s
                """, userName,passWord,timeCreated);





    }
