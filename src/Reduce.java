public class Reduce {
    public static void main(String[] args) {
        int i = 0;
        int n = 100;

        while (n > 0) {
            boolean even = n % 2 == 0;

            if (even) {
                n = n /2;
                i++;
            }

            else {
                n--;
                i++;
            }
        }

        System.out.println(i);
    }
}
