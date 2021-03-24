public class Palindrom {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println( s + "-это палиндром?" + palindrom(s));
        }
    }
    public static boolean palindrom(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length/2; i++) {
            if (str[i] != str[str.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
