package LengthofLastWord58;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));
    }

    private static int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }
}
