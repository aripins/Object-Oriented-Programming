public class StringManipulation3 {
    public static void main(String[] args) {
        String nama = "NUGRAHA";
        printVertically(nama);
    }

    public static void printVertically(String name) {
        int middleIndex = name.length() / 2; 
        for (int i = 0; i < name.length(); i++) {
            if (i == middleIndex) {
                System.out.println(name); 
            } else {
                System.out.println("***" + name.charAt(i) + "***"); 
            }
        }
    }
}
