import java.util.Scanner;

import static java.lang.Math.*;

class Main {

    static double y(
            double x){
        double res = 2 * x +3;
        return res;
    }

    static double areaDisk(double r){
        return PI*pow(r, 2);
    }

    static void main(String[] args) {

//        int [] arr = new int [] {2,5,3};
//        System.out.println(arr.length);
//        System.out.println(arr[1]);
//        int [] arr2 = arr;
//        arr2[1] = 100;
//        System.out.println(arr2[1]);
//        System.out.println(arr[1]);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        double r = in.nextDouble();
        double s = areaDisk(r);
        int y = 10;
        System.out.println(y(10.0) + y(10.0));

        System.out.println("s=" + (int)(s * 100)/100.00);


        System.out.println((int)(random() * 3 + 3));


//        int a = 3;
//        int b = 5;
//        System.out.println(a/b);
//        System.out.println((double)a/b);

    }
    
}
