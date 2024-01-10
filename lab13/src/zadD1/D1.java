package zadD1;

import java.util.LinkedList;

public class D1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);

        PalindromeChecker p1 = new PalindromeChecker();
        System.out.println(p1.isPalindrome(list));
    }
}
