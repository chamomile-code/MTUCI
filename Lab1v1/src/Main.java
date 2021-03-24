public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (chisla(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    public static boolean chisla(int n) {
        for (int i = 2; i < n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}

