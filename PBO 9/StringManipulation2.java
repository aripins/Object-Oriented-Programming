public class StringManipulation2 {
    public static void main(String[] args) {
        String input = "NUGRAHA"; 
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    System.out.print(input.charAt(i)); 
                } else {
                    System.out.print("*"); 
                }
            }
            System.out.println(); 
        }
    }
}
