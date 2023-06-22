public class pattern2 {
    
        public static void main(String[] args) {
            patttern(5);
        }
    
        public static void patttern(int n) {
            for (int i = 0; i <= n; i++) {
                int space = n - i;
                for (int s = 0; s <= space; s++) {
                    System.out.print("  ");
                }
                    for (int j = i; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                    for (int j = 2; j <= i; j++) {
                        System.out.print(j + " ");
    
                    }
                    System.out.println();
                }
            }
        }
    
    
