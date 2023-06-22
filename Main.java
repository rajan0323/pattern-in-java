public class Main {
    public static void main(String[] args) {
        paterrn(5);
    }

    public static void paterrn(int n) {
        for (int i = 0; i <= 2*n; i++) {
            int noofrow=i>n?2*n-i:i;

            for (int j = 0; j <= noofrow; j++) {
                System.out.print("*");
            }
            int SPACE=2*(n-noofrow);
            for(int s=0;s<=SPACE;s++){
                System.out.print(" ");
            }
            for (int j = 0; j <= noofrow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}









