package Java_ZaurTregulov;

public class Lesson_6 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 5;

        //boolean b1 = a > b;
        boolean b1 = a >= b;
        boolean b2 = b <= c;
        boolean b3 = c == b;
        boolean b4 = c != b;


        boolean x = true;
        boolean y = true;
        boolean z = false;

        boolean result = x || y && z;
        boolean result1 = x && y && z;
        boolean result2 = x || y || z;


        System.out.println(result);




    }
}
