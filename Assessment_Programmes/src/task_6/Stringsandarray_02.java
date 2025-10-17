package task_6;

public class Stringsandarray_02 {

	public static void main(String[] args) {
				        
		        // 1. Count Vowels and Consonants in a String
		        String str1 = "Hello World";
		        int vowels = 0, consonants = 0;
		        str1 = str1.toLowerCase();
		        for (char ch : str1.toCharArray()) {
		            if (ch >= 'a' && ch <= 'z') {
		                if ("aeiou".indexOf(ch) != -1)
		                    vowels++;
		                else
		                    consonants++;
		            }
		        }
		        System.out.println("1. Vowels: " + vowels + ", Consonants: " + consonants);

		        // 2. Check if a String is a Palindrome
		        String str2 = "madam";
		        String rev = new StringBuilder(str2).reverse().toString();
		        System.out.println("2. \"" + str2 + "\" is Palindrome? " + str2.equals(rev));

		        // 3. Remove All White Spaces from a String
		        String str3 = "Java Programming Language";
		        String noSpaces = str3.replaceAll("\\s+", "");
		        System.out.println("3. Without spaces: " + noSpaces);

		        // 4. Count Words in a String
		        String str4 = "Java is fun to learn";
		        String[] words = str4.trim().split("\\s+");
		        System.out.println("4. Word count: " + words.length);

		        // 5. Find the First Non-Repeated Character in a String
		        String str5 = "swiss";
		        char firstNonRepeat = '\0';
		        for (char ch : str5.toCharArray()) {
		            if (str5.indexOf(ch) == str5.lastIndexOf(ch)) {
		                firstNonRepeat = ch;
		                break;
		            }
		        }
		        System.out.println("5. First non-repeated character: " + (firstNonRepeat == '\0' ? "None" : firstNonRepeat));

		        // 6. Check if Two Strings are Anagrams
		        String s1 = "listen", s2 = "silent";
		        char[] arr1 = s1.toCharArray();
		        char[] arr2 = s2.toCharArray();
		        java.util.Arrays.sort(arr1);
		        java.util.Arrays.sort(arr2);
		        System.out.println("6. \"" + s1 + "\" and \"" + s2 + "\" are Anagrams? " + java.util.Arrays.equals(arr1, arr2));

		        // 7. Reverse Each Word in a Sentence
		        String str7 = "Java is easy";
		        String[] splitWords = str7.split(" ");
		        StringBuilder reversedSentence = new StringBuilder();
		        for (String w : splitWords) {
		            reversedSentence.append(new StringBuilder(w).reverse()).append(" ");
		        }
		        System.out.println("7. Reversed each word: " + reversedSentence.toString().trim());

		        // 8. Find All Substrings of a String
		        String str8 = "abc";
		        System.out.println("8. All substrings:");
		        for (int i = 0; i < str8.length(); i++) {
		            for (int j = i + 1; j <= str8.length(); j++) {
		                System.out.println(str8.substring(i, j));
		            }
		        }

		        // 9. Remove Duplicates from a String
		        String str9 = "programming";
		        StringBuilder noDup = new StringBuilder();
		        for (char c : str9.toCharArray()) {
		            if (noDup.indexOf(String.valueOf(c)) == -1) {
		                noDup.append(c);
		            }
		        }
		        System.out.println("9. After removing dup: " + noDup);

		        // 10. Merge Two Arrays
		        int[] a1 = {1, 2, 3};
		        int[] a2 = {4, 5, 6};
		        int[] merged = new int[a1.length + a2.length];
		        System.arraycopy(a1, 0, merged, 0, a1.length);
		        System.arraycopy(a2, 0, merged, a1.length, a2.length);
		        System.out.print("10. Merged array: ");
		        for (int n : merged) System.out.print(n + " ");
		        System.out.println();

		        // 11. Find the Second Largest Element in an Array
		        int[] arr11 = {10, 30, 20, 50, 40};
		        java.util.Arrays.sort(arr11);
		        System.out.println("11. Second largest: " + arr11[arr11.length - 2]);

		        // 12. Remove Duplicates from an Array
		        int[] arr12 = {1, 2, 2, 3, 4, 4, 5};
		        java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
		        for (int n : arr12) set.add(n);
		        System.out.print("12. Array without duplicates: ");
		        for (int n : set) System.out.print(n + " ");
		        System.out.println();

		        // 13. Find the Intersection of Two Arrays
		        int[] arr13a = {1, 2, 3, 4, 5};
		        int[] arr13b = {3, 4, 5, 6, 7};
		        System.out.print("13. Intersection: ");
		        for (int x : arr13a) {
		            for (int y : arr13b) {
		                if (x == y)
		                    System.out.print(x + " ");
		            }
		        }
		        System.out.println();

		        // 14. Rotate an Array (Right Rotation by k positions)
		        int[] arr14 = {1, 2, 3, 4, 5};
		        int k = 2;
		        int len = arr14.length;
		        int[] rotated = new int[len];
		        for (int i = 0; i < len; i++) {
		            rotated[(i + k) % len] = arr14[i];
		        }
		        System.out.print("14. Array after right rotation by " + k + ": ");
		        for (int n : rotated) System.out.print(n + " ");
		        System.out.println();

		        // 15. Find Pair of Elements with a Given Sum
		        int[] arr15 = {2, 4, 3, 5, 6, 7, 8};
		        int target = 9;
		        System.out.print("15. Pairs with sum " + target + ": ");
		        for (int i = 0; i < arr15.length; i++) {
		            for (int j = i + 1; j < arr15.length; j++) {
		                if (arr15[i] + arr15[j] == target)
		                    System.out.print("(" + arr15[i] + "," + arr15[j] + ") ");
		            }
		        }
		        System.out.println();
		    }
		}
