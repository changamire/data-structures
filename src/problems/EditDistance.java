package problems;

public class EditDistance {


    boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i=0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    boolean oneEditInsert(String s1, String s2) {
        int index1 = 0, index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main (String args[]) {
        EditDistance e = new EditDistance();

        System.out.println(e.oneEditReplace("bale", "pale"));

    }
}
