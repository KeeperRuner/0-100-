public class 随机生成数字 {
    public static void main(String[] args) {
        //[0,100)随机整数
        int r = (int)(Math.random()*100);
        System.out.println(r);

        if (r <16) {
            System.out.println("数比较小");
        }
    }
}