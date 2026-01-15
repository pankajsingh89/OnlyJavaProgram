class DuplicateCharacter {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Input String: " + input);
        System.out.print("Duplicate Characters: ");
        
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // ASCII character set

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Print duplicate characters
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.print((char)i + " ");
            }
        }
    }
}