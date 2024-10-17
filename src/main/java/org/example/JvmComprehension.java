package org.example;

public class JvmComprehension { // поиск в Application ClassLoader класса JvmComprehension , JvmComprehension размещается в Metaspace

        public static void main(String[] args) {
            int i = 1;                      // 1 В стеке создается фрейм с методом "main". В фреме метода main храниться "i = 1".
            Object o = new Object();        // 2 В куче - "new Object()", "О"(ссылка на объект) в фреме метода "main".
            Integer ii = 2;                 // 3 Переменная "ii" хранит ссылку на объект в стеке.
            printAll(o, i, ii);             // 4 Для метода "printAll" создается фрейм стека, "o, i и ii" - в методе.
            System.out.println("finished"); // 7 Фрейм в стеке метода "println", со значением "finished".

        }

        private static void printAll(Object o, int i, Integer ii) {
            Integer uselessVar = 700;                   // 5 В стеке метода "printAll" сохраняется переменная "uselessVar"
            // с ссылкой на объект, "Integer", который хранится в куче.
            System.out.println(o.toString() + i + ii);  // 6 Новый фрейм в стеке с методом, ссылка на "o.toString() + i + ii".
        }
}
