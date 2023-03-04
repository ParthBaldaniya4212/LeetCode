public class PalindromeNumber {
    
    public static boolean isPolidrome(int x) {
        int p = x;
        int y = 0;
        int z;
        while (x > 0) {
            z = x % 10;
            y = (10 * y) + z;
            x = x / 10;
            System.out.println(y);
        }
        if (p == y) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPolidrome(x)); 
    }
}