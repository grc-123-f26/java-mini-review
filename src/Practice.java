public class Practice {
    /**
     * Prints each item from an array on a separate line.
     * 
     * @param items an array of strings to print
     */
    public static void printItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    /**
     * Returns whether a is more than twice the value of b.
     * 
     * @param a an int
     * @param b an int
     * @return true if a is strictly more than twice the value of b, false otherwise
     */
    public static boolean moreThanDouble(int a, int b) {
        if (a > 2 * b) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns whether every word in the array starts with the letter A (either
     * upper or lower case).
     * 
     * @param words a array of words
     * @return true if every word starts with A (case-insensitive), false otherwise.
     */
    public static boolean allStartWithA(String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] lettersInWord = words[i].toCharArray();
            String firstLetterInWord = String.valueOf(lettersInWord[0]);

            if (firstLetterInWord.equals("a") || firstLetterInWord.equals("A")) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("///// Print items /////");
        System.out.println("Calling printItems(new String[]{\"welcome\", \"to\", \"cs\", \"123\"})");
        printItems(new String[]{"welcome", "to", "cs", "123"});
        System.out.println();
        System.out.println("Calling printItems(new String[]{\"hello\", \"world\"})");
        printItems(new String[]{"hello", "world"});

        System.out.println();
        System.out.println("///// More than Double /////");
        System.out.println("moreThanDouble(10, 3): " + moreThanDouble(10, 3));
        System.out.println("moreThanDouble(6, 4): " + moreThanDouble(6, 4));
        System.out.println("moreThanDouble(4, 2): " + moreThanDouble(4, 2));

        System.out.println();
        System.out.println("///// All Start With A /////");
        System.out.println("allStartWithA(new String[]{\"alligators\", \"are\", \"AWESOME\"}): " + allStartWithA(new String[]{"alligators", "are", "AWESOME"}));
        System.out.println("allStartWithA(new String[]{\"apes\", \"can\", \"be\", \"amazing\"}): " + allStartWithA(new String[]{"apes", "can", "be", "amazing"}));
        System.out.println("allStartWithA(new String[]{}): " + allStartWithA(new String[]{}));
        System.out.println();
    }
}
