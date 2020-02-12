import java.util.Scanner;

/*
	Created by Tomasz Pajewski on 2020-01-28.
	Java some variants examples
*/
public class IfTest {

    public static void main(String[] args) {
        int a = 10;
        if (a < 10)
            System.out.println("a<10");
        else if (a == 10)
            System.out.println("a=10");
        else
            System.out.println("a>0");
        // zagnieżdzanie
        if (a < 10) {
            System.out.println("a<10");
            if (a == 8)
                System.out.println("a=8");
            else
                System.out.println("a!=8");
        }
        int b = 4;
        switch (b) {
        case 1:
            System.out.println("b=1");
            break;
        case 4:
            System.out.println("b=4");
            break;
        default:
            System.out.println("dziwne b");
            break;
        }
        int c = 10;
        int d;
        d = c < 10 ? -1 : 1;
        System.out.println("d = " + d);
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 5)
                break;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println("i = " + i);
        }
        // Przykład czytania z klawiatury
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.next();
        System.out.println(name);
        scanner.close();
    }
}