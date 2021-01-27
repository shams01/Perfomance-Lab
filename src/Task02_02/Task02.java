package Task02_02;
/*
Реализуйте класс Pair, который позволяет хранить 2 объекта строго определенных типов.
Реализуйте методы getFirst, getSecond, equals и hashcode (в соответствии с требованием их согласованности).
Нижеприведенный код должен компилироваться и работать.
Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); //-> 1
String s = pair.getSecond(); //-> "hello"
Pair<Integer, String> pair2 = Pair.of(1, "hello");
Pair<Integer, String> pairWithNull = Pair.of(1, null);
pair.equals(pair2); //-> true
pair.equals(pairWithNull); //-> false
 */
public class Task02 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); //-> 1
        String s = pair.getSecond(); //-> "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        Pair<Integer, String> pairWithNull = Pair.of(1, null);
        pair.equals(pair2); //-> true
        pair.equals(pairWithNull); //-> false
    }
}
