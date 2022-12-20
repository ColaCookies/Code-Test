public class _0042 {
    private static String getType(Object a) {
//        return a.getClass().getName();
        return a.getClass().toString();
    }
    public static void main(String[] args) {
        float b = 12.4f;
        double a = 23.45;

        System.out.println(a);
        System.out.println(b);
        System.out.println(5.12e2);
        System.out.println(5.12E-2);
        System.out.println(getType(5.12e-2));
        System.out.println(getType(a));

        float num1 = 2.2259559521f;
        double num2 = 2.2259559521;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(1.798E30);

    }
}
