public class StringCompression {
    public static int compressionString(char chars[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;
            while (chars.length - 1 > i && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            sb.append(chars[i]);
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        String ans = sb.toString();
        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }
    public static void main(String[] args) {
        char a[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compressionString(a)); 
    }
}