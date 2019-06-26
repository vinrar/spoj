import java.util.*;

public class SMPSEQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SortedSet<Integer> set1 = new TreeSet<>();
        SortedSet<Integer> set2 = new TreeSet<>();

        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            set1.add(in.nextInt());
        }

        int m = in.nextInt();
        for(int j = 0; j < m; j++) {
            set2.add(in.nextInt());
        }

        set1.removeAll(set2);
        Iterator<Integer> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}