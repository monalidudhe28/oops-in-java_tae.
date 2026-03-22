// 4. Define a class Resort with the following description:
//  Members are: RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
//  Member functions:
//  Compute() to calculate and return Amount as Days * Charges and if the
// values of Days*Charges is more than 11000 then as 1.02*Days*Charges
//  Getinfo() A function to enter the content Rno, Name, Charges and Days.
//  DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().

import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        RNo = sc.nextInt();
        Name = sc.next();
        Charges = sc.nextFloat();
        Days = sc.nextInt();
    }

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = 1.02f * amount;
        }
        return amount;
    }

    void DispInfo() {
        float amount = Compute();
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges per day: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}
