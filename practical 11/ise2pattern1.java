import java.util.Scanner;

 class pattern1 {

    public static void printUpper(int i, int j, int n, int mid) {
        if (i > mid) return;

        if (j == n) {
            System.out.println();
            printUpper(i + 1, 0, n, mid);
            return;
        }

        if (j >= mid - i && j <= mid + i)
            System.out.print("* ");
        else
            System.out.print("  ");

        printUpper(i, j + 1, n, mid);
    }

    public static void printLower(int i, int j, int n, int mid) {
        if (i == n) return;

        if (j == n) {
            System.out.println();
            printLower(i + 1, 0, n, mid);
            return;
        }

        int x = n - 1 - i;

        if (j >= mid - x && j <= mid + x)
            System.out.print("* ");
        else
            System.out.print("  ");

        printLower(i, j + 1, n, mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int mid = n / 2;

        printUpper(0, 0, n, mid);
        printLower(mid + 1, 0, n, mid);
    }
}