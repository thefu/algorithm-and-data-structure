/**
 * 字节问题
 */
public class Main {
    static final class ClassA {
        int b = v;
        int a1;
        int a2 = v++;
        static int a3 = v++;

        ClassA() {
            a1 = v++;
        }
    }

    static int v = 1;

    // 题目要求：写出代码执行之后， 18 行到 22 行的值分别是多少（用注释的方式写在每行尾）
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println("v=" + v);
        System.out.println("b=" + classA.b);
        System.out.println("a1=" + classA.a1);
        System.out.println("a2=" + classA.a2);
        System.out.println("a3=" + ClassA.a3);

        System.out.println("is "+ 100 + 5);
        System.out.println(100 + 5 +" is");
        System.out.println("is "+ (100 + 5));
    }
}