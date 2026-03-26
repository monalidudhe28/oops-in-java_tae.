// 4. Create a class MessageFormatter.
//  Accept first name and last name.
//  Concatenate both names with space.
//  Display full name in proper format.

import java.util.Scanner;
class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
