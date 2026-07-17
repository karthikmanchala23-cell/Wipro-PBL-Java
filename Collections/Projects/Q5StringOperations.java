package Collections.Projects;

import java.util.ArrayList;

public class Q5StringOperations {

    public ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // 1
        String r1 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                r1 += s2;
            else
                r1 += s1.charAt(i);
        }
        list.add(r1);

        // 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);
        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String r2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(r2);
        } else {
            list.add(s1 + s2);
        }

        // 3
        if (first != last)
            list.add(s1.replaceFirst(s2, ""));
        else
            list.add(s1);

        // 4
        int mid = (s2.length() + 1) / 2;
        list.add(s2.substring(0, mid) + s1 + s2.substring(mid));

        // 5
        String r5 = "";
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1)
                r5 += "*";
            else
                r5 += c;
        }
        list.add(r5);

        return list;
    }
}