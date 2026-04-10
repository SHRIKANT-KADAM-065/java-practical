import java.util.Scanner;

 class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int mid = n / 2;

        //  Upper Half 
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < n; j++) {

                if (j >= mid - i && j <= mid + i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        //  Lower Half
        for (int i = mid + 1; i < n; i++) {
            int x = n - 1 - i;  

            for (int j = 0; j < n; j++) {

                if (j >= mid - x && j <= mid + x)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}