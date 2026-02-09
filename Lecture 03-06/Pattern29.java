public class Pattern29 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            int total = 2 * i - 1;
             for (int s = 1; s <= n - i; s++) {
                System.out.print("   ");}

            for (int j = 1; j <= total; j++) {

                if (j == 1 || j == total) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
