public class StringManipulation {
    public static void main(String[] args) {
        String input = "NUGRAHA";
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j >= length - i) {
                    System.out.print("*");
                } else {
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
