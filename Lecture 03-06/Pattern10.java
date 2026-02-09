public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
       for (int i = 1; i <= n; i++) {
        for (int s = 1; s <= i - 1; s++) {
                System.out.print("   ");
            }for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
