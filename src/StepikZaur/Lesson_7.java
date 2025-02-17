package StepikZaur;

public class Lesson_7 {
    public static void main(String[] args) {

//В Java доступны следующие логические операции:
//Логическое отрицание, оно же NOT или инверсия. В Java обозначается символом “!” перед операндом. Применяется к одному операнду.
//Логическое и, оно же AND или конъюнкция. Обозначается символом “&” между двумя операндами, к которым применяется.
//Логическое или в Java, оно же — OR, оно же — дизъюнкция. В Java обозначается символом “|” между двумя операндами.
//Исключающее или, XOR, строгая дизъюнкция. В Java обозначается символом “^” между двумя операндами.
//В Java к логическим операторам можно отнести условное или, обозначаемое как ||, а также условное и — &&.
//Примечание: также в математической логике рассматривают отношение эквивалентности, проще говоря — равенства.
//Однако в Java оператор равенства == не принято относить к логическим.
//Внимание! В Java логические операторы &, | и ^ применяются также к целым числам.
//В этом случае они работают несколько иначе и называются поразрядными (или побитовыми) логическими операторами.

// && \ || \ ! ... & \ | \ ^
     //   boolean a = true;
     //   boolean b = false;
        //System.out.println(!b);

    //int c = 10;
    //int d = 20;
    //boolean c1 = !(c < d);
    //System.out.println(c1);

    int a = 10;
    int b = 50;
    int c = 99;
    int d = 100;

    boolean e = a > b || ++c == d; //
    //System.out.println(e);
    //System.out.println(c);

    int x = 10; // в двоичной системе 1010
    int y = 5; //  в двоичной системе 0101, если использовать & - будет 0

    //System.out.println(x | y);

// ^ - XOR - эксклюзив битвайс or - только когда одна переменная true, тогда операнд возвращает true
    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = true;
    boolean b4 = false;

    System.out.println(b1 ^ b2 ^ b3 ^ b4);

    // &&
    //a - true , b - true , a && b = true
    //a - true , b - false, a && b = false
    //a - false , b - true, a && b = false
    //a - false , b - false, a && b = false

    // ||
        //a - true , b - true , a || b = true
        //a - true , b - false, a || b = true
        //a - false , b - true, a || b = true
        //a - false , b - false, a || b = false

    // ! - противоположный результат
        //a - true, !b - false
        //a - false, !b - true

    // ^
        //a - true , b - true , a ^ b = false
        //a - true , b - false, a ^ b = true
        //a - false , b - true, a ^ b = true
        //a - false , b - false, a ^ b = false





    }
}
