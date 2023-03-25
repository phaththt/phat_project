import java.util.Random;
import java.util.Scanner;

class Phat {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int num = 1 + random.nextInt(101 - 1);
        //System.out.print(num);

        int a = sc.nextInt();
        int number = 1;

        while (a != num) {

            if (a > num) {
                System.out.println("Я сам в шоке, но, загаданное число меньше, брат");
                number+=1;
                a = sc.nextInt();
                //System.out.println(number);

            } else {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
                number+=1;
                a = sc.nextInt();
                //System.out.println(number);

            }

        }

        System.out.println("колличество попыток = " + number + "\n" + "верное число = " + a);

    }


}