public class qwerty {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int a = 432;
        int b = 111;
        int nod = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        System.out.println(nod);

        long time = System.currentTimeMillis() - start;
        System.out.println("Time:" + time);
    }
}
