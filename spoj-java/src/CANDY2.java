import java.util.*;

public class CANDY2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long cSum = 0L;
        long sSum = 0L;
        long bSum = 0L;

        Queue<Bag> cBags = new PriorityQueue<>(3, new Comparator<Bag>() {
            @Override
            public int compare(Bag o1, Bag o2) {
                return o2.c - o1.c;
            }
        });

        Queue<Bag> sBags = new PriorityQueue<>(3, new Comparator<Bag>() {
            @Override
            public int compare(Bag o1, Bag o2) {
                return o2.s - o1.s;
            }
        });

        Queue<Bag> bBags = new PriorityQueue<>(3, new Comparator<Bag>() {
            @Override
            public int compare(Bag o1, Bag o2) {
                return o2.b - o1.b;
            }
        });

        for(int i = 0; i < n; i++) {
            Bag bag = new Bag(i);
            bag.c = in.nextInt();
            bag.s = in.nextInt();
            bag.b = in.nextInt();
            cBags.add(bag);
            bBags.add(bag);
            sBags.add(bag);
            cSum += bag.c;
            bSum += bag.b;
            sSum += bag.s;
        }

        Bag cBag1 = cBags.poll();
        Bag sBag1 = sBags.poll();
        Bag bBag1 = bBags.poll();

        
    }

    static class Bag {
        public Bag(int id) {
            this.id = id;
        }
        int id;
        int c;
        int s;
        int b;
    }
}