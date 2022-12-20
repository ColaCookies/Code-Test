
public class _0044 {
    public static void main(String[] args) {
        double n1 = 2.7;
        double n2 = 8.1 / 3;

        System.out.println(n1);
        System.out.println(n2);
        if( n1 == n2 ){
            System.out.println("相等");
        }
        else{
            System.out.println("不相等");
        }

        if(Math.abs(n1 - n2) < 0.000001) {
            System.out.println("差值非常小，在我的规定精度，认为相等！");
        }
        System.out.println(Math.abs(n1 - n2));
        System.out.println(n2 - n1);
    }
}

