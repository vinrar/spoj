import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SMPCPH1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] arr = in.next().toCharArray();
        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < n - 1; i++) {
            map.put(arr[i], arr[i+1]);
        }

        map.put(arr[n-1], arr[0]);

        int m = in.nextInt();
        in.nextLine();
        for(int i = 0; i < m; i++) {
//            char[] inp = in.next().toCharArray();
//            for(int j = 0; j < inp.length; j++) {
            String s = in.nextLine();
            for(int k = 0; k < s.length(); k++) {
                Character c = s.charAt(k);
                if(map.get(c) == null)
                    System.out.print(c);
                else
                    System.out.print(map.get(c));
            }
            System.out.println();
        }
    }
}