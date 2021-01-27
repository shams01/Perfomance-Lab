package Task01_01;/*
Реализуйте метод integrate, который будет вычислять определенный интеграл методом левых прямоугольников.
Функия передается в первом агрументе,
отрезок ограничиавается 2-мя координатами по оси х заданным вторым и третьим аргументами.
При необходимости опишите необходимые классы и интерфейсы.
Возьмите шаг 0.1.
Википедия о том, что такое метод прямоульников.
https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D1%82%D0%BE%D0%B4_%D0%BF%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA%D0%BE%D0%B2

Пример вызова:
integrate(x -> 1, 1, 10); //-> 10
 */

public class Task01 {
    public static void main(String[] args) {
        Method_Left_Triangle method_left_triangle = new Method_Left_Triangle();
        double calc = method_left_triangle.integrate(x -> 1, 1, 10);
        System.out.println(calc);
    }
}
