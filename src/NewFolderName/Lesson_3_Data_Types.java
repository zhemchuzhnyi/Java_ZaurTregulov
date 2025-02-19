package StepikZaur;

public class Lesson_3_Data_Types {
    public static void main(String[] args) {

        byte  b1 = 10;
//        тип  имя   значение
//      данных перем-й
        byte b2 = 20;
        byte b3 = 100;
//        байт от -128 до 127

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;
//        по умолчанию джава все считает за int

        long l1 = 1000;
        long l2 = 1000000000000L;
//        если хочешь большие числа, нужно на конце ставить L
        long l3 = 51L;

        float f1 = 3.14F;
//        по умолчанию в джаве все дабл, если хочешь работать с флоат
//        то надо ставить F
        float f2 = 2.5F;
        float f3 = 20.0F;


        double d1 = 5.5;
        double d2 = 87.65;


        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = 'Ь';
//        символ всегда в одинарных кавычках и всегда 1
//            пробел это тоже символ

        char c5 = 500; //10ричная система исчисления 0-9
//        это отображение 300 символа в юникоде

        char c6 = '\u0500'; //16ти ричная сичтема исчисления 0-9;a-f


        boolean bool = true;
        boolean bool2 = true;
        //логические значения только тру или фалс

        int a1 = 60; // 10 ричная система

        int a2 = 0b111100; // 2ичная система большая или маленькая неважно

        int a3 = 074; // 8ричная система

        int a4 = 0x3c; //16ричная система

        int a5 = 1_000_000; // нижнее подчеркивание это андерскор
        //нужен для удобства записи и чтения кода
        //его нельзя использовать вначале или конце числа
        //до и после точки в дробных числах
        //до и после букв L F D
        //до и после b между символов 0B 0X



    byte q1 = 0b1100;
    byte q2 = 0_14;
    byte q3 = 12;
    byte q4 = 0xC;

    System.out.println(q1);
    System.out.println(q2);
    System.out.println(q3);
    System.out.println(q4);

    short w1 = 0b10100010100;
    short w2 = 0_2424;
    short w3 = 1300;
    short w4 = 0x514;

    System.out.println(w1);
    System.out.println(w2);
    System.out.println(w3);
    System.out.println(w4);

    int e1 = 0b0;
    int e2 = 0_0;
    int e3 = 0;
    int e4 = 0x0;

    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println(e4);

    long r1 = 0b111010110111100110100010101;
    long r2 = 0_726746425;
    long r3 = 123456789;
    long r4 = 0x75bcd15;

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);

    float t1 = 12.15f;
    float t2 = 13.24f;

    System.out.println(t1);
    System.out.println(t2);

    double y1 = 15.87;
    double y2 = 16.98;

    System.out.println(y1);
    System.out.println(y2);

    boolean u1 = true;
    boolean u2 = false;

    System.out.println(u1);
    System.out.println(u2);

    char p1 = 'a';
    char p2 = 250;
    char p3 = '\u6587';
    char p4 = 'Й';

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);

    }
}
