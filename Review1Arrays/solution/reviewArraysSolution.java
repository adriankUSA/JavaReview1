/**
 * Class for beginner Java methods.
 * This class is used to create methods and understand java fundamentals.
 *
 * @author  Adrian Khlim
 * @version Jan 17, 2025
 */
package Review1Arrays.solution;

public class reviewArraysSolution {

    /**
     * Default constructor.
     */
    public reviewArraysSolution() {

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    /**
     * This method takes in two integers and prints the larger number.
     * @param num1, an integer
     * @param num2, another integer
     */
    public void printGreaterThan(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else System.out.println("num2");
    }

    /**
     * This method should take in two integers and return the larger number.
     * @param num1, an integer
     * @param num2, another integer
     * @return int, the larger number
     */
    public int greaterThan(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else return num2;
    }

    /**
     * This method should take an array of integers and return the largest int. 
     * If the the size of the array is 0, return 0.
     * @param nums, an array of integers.
     * @return int the largest int.
     */
    public int findLargestInt(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;

        /*
         * Using a for-each loop, or enhanced for loop.
         * int largest = nums[0];
         * for (int next : nums) {
         *      if (next > largest) {
         *          largest = next;
         *      }
         * }
         * 
         * return largest;
         */
    }

    /**
     * This method should take an array of integers and return the smallest int.
     * If the the size of the array is 0, return 0.
     * @param nums, an array of integers.
     * @return int, the smallest int.
     */
    public int findSmallestInt(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int smallest = nums[0];

        for (int next : nums) {
            if (next < smallest) {
                smallest = next;
            }
        }
        return smallest;
    }

    /**
     * This method should take an array of integers and return the sum of the elements.
     * If the size of the array is 0, return 0.
     * @param numbers, an array of integers.
     * @return int, the sum of all the elements in the array.
     */
    public int sumOfElements(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    /**
     * This method should take an array of Strings and returns the String with the shortest length.
     * If the string is null, return null.
     * @return String the shortest string.
     */
    public String findShortestString(String[] arrayOfStrings) {
        if (arrayOfStrings == null) {
            return null;
        }
        String shortest = arrayOfStrings[0];
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].length() < shortest.length()) {
                shortest = arrayOfStrings[i];
            }
        }
        return shortest;
    }

    /**
     * This method should take in a string and return how many vowels are in the string.
     * If the string is null, return 0.
     * @param word, a string.
     * @return int, the number of vowels in the string.
     */
    public int countVowels(String word) {
        if (word == null) {
            return 0;
        }

        int counter = 0;
        String wordLowerCase = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char letter = wordLowerCase.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'
                    || letter == 'u') {
                counter++;
            }
        }
        return counter;
    }

    /**
     * This method should take in a positive int and return the first digit.
     * If the number is negative, just return 0.
     * You may not turn turn the integer into a string.
     * @param num, an integer.
     * @return int, the first digit.
     */
    public int findFirstDigit(int num) {

        if (num < 0) {
            return 0;
        }
         
        if (num < 10) {
            return num;
        }

        while (num > 10) {
            num = num / 10;
        }
        return num;
    }

}

