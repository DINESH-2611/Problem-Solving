package problemsolving;

import java.util.*;

public class PermutationString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression");
        String s = scanner.nextLine();
        TreeSet<String> set=printUniquePermutations(s);
        for(String s1:set){
            System.out.print(s1+" ");
        }
    }
    public static TreeSet<String> printUniquePermutations(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort the characters to ensure lexicographically sorted permutations
        str = new String(chars);

        Stack<String> stack = new Stack<>();
        TreeSet<String> set=new TreeSet<>();
        stack.push("");

        while (!stack.isEmpty()) {
            String curr = stack.pop();

            if (curr.length() == str.length()) {
//                System.out.print(curr + " ");
                set.add(curr);
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (!curr.contains(String.valueOf(str.charAt(i)))) {
                        stack.push(curr + str.charAt(i));
                    }
                }
            }
        }
        return set;
    }
}
