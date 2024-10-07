void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Date now = new Date();
    int year = now.getYear() + 1900;
    int i = 0;


    System.out.println(now);
    System.out.println(year);

    /*do {
        System.out.println("Привет");
        i++;
    }while (i < 3);*/

    for (; i < 3; i++) {
        System.out.println("Привет" +i);
    } //113


    do {
        System.out.println("Текущий год:" +year);
        year++;
    } while (year < 2026);

    /*System.out.println("Введите число x: ");
    int x = in.nextInt();

    if (x < 10) {
        System.out.println();
    } else if (x == 30) {
        System.out.println();
    } else {
        System.out.println();
    }
}

    if (x == 0) System.out.println("012345");
    if (x%2 == 0) System.out.println("Четное число");
    if (x%2 != 0) System.out.println("Нечетное число");*/



    /*if (x > 10 & x%2 == 0) {
        System.out.println(x);
    }*/


}
