import java.util.Scanner;

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    char [] ar = new char [] {'a', 'b', 'c', 'd'};

    /*String str1 = "abc";
    String str2 = "xyz";*/

    String s = new String("ABCD");
    char [] ar2 = s.toCharArray();
    String s2 = new String(ar);

    String s3 = s.concat(s2);

    int a = 2;
    int b = 2;

    String s4 = "Иванов          Иван          Иванович";
    String [] words = s4.split(" +");

    String words2 = String.join("#@",words);

    String s10 = new String("aBcD");
    String s11 = new String("aBcD");


    System.out.println(ar);
    System.out.println(ar.length);
    System.out.println(ar[1]);
    System.out.println(ar[0]);
    System.out.println((int) ar[0]);
    //System.out.println('a' < 'c');
    System.out.println((char) 98);
    System.out.println(s);
    System.out.println(s.length());
    System.out.println(s.charAt(0));

    System.out.println(ar2);
    System.out.println(ar2.length);

    System.out.println(s2);
    System.out.println(s2.length());

    System.out.println(s.concat(s2));
    System.out.println(s + s2);

    System.out.println(s3);
    System.out.println(s3.substring(2));
    System.out.println(s3.substring(2,6));

    System.out.println("aaaa\n\t\tbbb   ccccc\n  dd");

    System.out.println("   aaa   bbb   ".strip());
    System.out.println("   aaa   bbb   ".replaceAll(" +", "#"));
    System.out.println(".,  aaa.,   bbb   ...".replaceAll("[.,]", "1"));

    System.out.println(words.length);
    System.out.println(words[1]);

    System.out.println(words2);

    System.out.println(s10 == s11);
    System.out.println(s10.equals(s11));

    System.out.println("Ввести значения строчки");
    String str = in.nextLine().trim();

    str = str.replaceAll("[,.!]", "");
    String [] words5 = str.split(" +");

    //Нужно посчитать количество цифр в введенной строке
    int count = 0;
    int count1 = 0;

    for (int i = 0; i < words5.length; i++) {
        System.out.println(words5[i]);
        count1++;
    }

    for (int i = 0; i < words5.length; i++) {


    }

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) >= 48 & str.charAt(i) <= 57) {
            System.out.println(str.charAt(i));
            count++;
        }
    }


    // количество слов, если их слово начинается с большой буквы и word.length < 3
    System.out.println("Количество цифр: " +count);
    System.out.println("Количество слов: " +count1);
    System.out.println(str);
    System.out.println(words5.length);

}
