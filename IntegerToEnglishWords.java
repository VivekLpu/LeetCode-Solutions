public class IntegerToEnglishWords {
    public static String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        String[] bigString = new String[]{"Thousand", "Million", "Billion"};
        String result = numberToWordsHelper(num % 1000);
        num = num / 1000;

        for (int i = 0; i < 3; i++) {
            if (num > 0 && num % 1000 > 0) {
                result = numberToWordsHelper(num % 1000) + bigString[i] + " " + result;
            }
            num = num / 1000;
        }

        return result.trim();
    }

    public static String numberToWordsHelper(int num) {
        String[] digitString = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teenString = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tenString = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String result = "";
        if (num > 99) {
            result += digitString[num / 100] + " Hundred ";
        }
        num = num % 100;

        if (num < 20 && num > 9) {
            result += teenString[num % 10] + " ";
        } else {
            if (num > 19) {
                result += tenString[num / 10] + " ";
            }
            num = num % 10;
            if (num > 0)
                result += digitString[num] + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 394342;
        System.out.println(numberToWords(num));
    }
}
