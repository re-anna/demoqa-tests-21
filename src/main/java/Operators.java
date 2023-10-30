public class Operators {
    public static void main(String[] args) {
        // Арифметические операторы
        int a = 4;
        int b = 3;
        int c = 1;
        System.out.println("Арифметические операторы");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a++   = " + (++a));
        System.out.println("b--   = " + (b--));
        System.out.println("______________________________________________");


        // Операторы сравнения
        System.out.println("Операторы сравнени");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("______________________________________________");

        // Логические операторы
        boolean d = true;
        boolean e = false;

        System.out.println("Логические операторы");
        System.out.println("d && e = " + (d && e));
        System.out.println("d || e = " + (d || e));
        System.out.println("!(d && e) = " + !(d && e));
        System.out.println("______________________________________________");

        // Переполнение
        int f = Integer.MAX_VALUE;
        System.out.println("Переполнение");
        System.out.println("maximum Integer = " + f);
        System.out.println("Integer overflow " + (f + 1));
        System.out.println("______________________________________________");

        // Комбинация типов
        int g = 1;
        double h = 5.53;
        System.out.println("Комбинация типов");
        System.out.println("int + double = " + (g + h));
        System.out.println("int / double = " + (g / h));
        System.out.println("______________________________________________");

        // If Else...
        //if (sex == 'm') {
        //    nameFirst = "Valera";
        //} else {
        //    nameFirst = "Matia";
        //}

        //Тернарный оператор. То же, что выше
        char sex = 'm';
        String nameFirst = sex == 'm'
                ? "Valera"
                : "Maria";
    }
}
