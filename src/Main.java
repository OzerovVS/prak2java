import java.util.Scanner;

class Baza {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a;
        do {
            print("Выберите задачу:\n1.Задача цикла for\n2.Задача цикла while");
            a = i.nextInt();
        }while (a != 1 && a != 2);
        if (a == 1) {
            zadacha_na_for(i);
        }
        if(a == 2) {
            zadacha_na_while(i);
        }
    }
    public static void zadacha_na_for(Scanner i){
        float b;
        do {
            print("Введите вещественное число меньше 1 и больше 0");
            b = i.nextFloat();
            if(b>0 && b<1)
                break;
        }while(true);
        int a;
        do{
            print("Введите целочисленное значение переменной");
            a = i.nextInt();
        }while(a<0);
        float x1=b,rez=b;
        for (int u = 2; u <= a; u++) {

            x1 *= -1 * b;
            rez += x1 / u;
        }
        print("Ваш результат приближенный результат ln(" + (1+b) + ") = " + rez);
    }
    public static void zadacha_na_while(Scanner i){
        int a,b = 1;
        do {
            print("Введите число больше 1: ");
            a = i.nextInt();
            if(a>1)
                break;
        }while(true);
        while(Math.pow(3,b) < a){
            b+=1;
        }
        print("3^" + b + "(" + (int)Math.pow(3,b) + ")" + " > " + a);
    }
    public static void print(Object a) {
        System.out.println(a);
    }
}