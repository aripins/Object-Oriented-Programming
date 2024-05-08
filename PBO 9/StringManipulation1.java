public class StringManipulation1 {
    public static void main(String[] args) {
        String input = "NUGRAHA";
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            String output = "";
            for (int j = 0; j < length; j++) {
                if (j < length - i) {
                    output += input.charAt(j);
                } else {
                    output += "*";
                }
            }
            System.out.println(output);
        }
    }
}
