1. Create a class called UsernameValidator.
 Accept a username from the user.
 Remove leading and trailing spaces.
 Convert the username to lowercase.
 Display the cleaned username.

import java.util.Scanner;
class UsernameValidator {
    private String username;

    public UsernameValidator(String username) {
        this.username = username;
    }

    public String cleanUsername() {
        return username.trim().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        UsernameValidator uv = new UsernameValidator(input);
        System.out.println(uv.cleanUsername());
    }
}
