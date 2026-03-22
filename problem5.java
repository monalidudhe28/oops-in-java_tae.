// 5. Define a class employee with the following specification:
//  Members are: empno of type integer, ename of type String, basic, hr and da
// are of type float, netpay of type float.
//  Member functions:
//  Calculate() : A function to find basix+hra+da with the float return type.
//  havedata(): function to accept values for empno, ename, basic, hra, da and
// invoke calculate() to calculate netpay.
//  dispdata(): function to display all the data members.

import java.util.Scanner;

class employee {
    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        empno = sc.nextInt();
        ename = sc.next();
        basic = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.havedata();
        e.dispdata();
    }
}
