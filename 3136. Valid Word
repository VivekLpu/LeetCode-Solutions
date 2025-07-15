class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int v = 0, c = 0;
        long vb = (1L << 'a') | (1L << 'e') | (1L << 'i') | (1L << 'o') | (1L << 'u') |
                  (1L << 'A') | (1L << 'E') | (1L << 'I') | (1L << 'O') | (1L << 'U');

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;
            if (Character.isAlphabetic(ch)) {
                if ((vb & (1L << ch)) != 0)
                    v++;
                else
                    c++;
            }
        }

        return v > 0 && c > 0;
    }
}
