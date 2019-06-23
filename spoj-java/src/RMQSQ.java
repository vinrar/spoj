import java.util.Scanner;

public class RMQSQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        Node node = new Node(0, n - 1);
        createRMQTree(arr, 0, n - 1, node);

        int tc = in.nextInt();

        while(tc-- > 0) {
            int qs = in.nextInt();
            int qe = in.nextInt();

            System.out.println(findMinInRMQ(qs, qe, node));
        }
    }

    private static int findMinInRMQ(int qs, int qe, Node node) {
        if(qs > qe)
            return Integer.MAX_VALUE;
        int mid = (node.low + node.high)/2;

        if(node.low == qs && node.high == qe)
            return node.min;

        if(qs > mid)
            return findMinInRMQ(qs, qe, node.right);

        if(qe < mid)
            return findMinInRMQ(qs, qe, node.left);

        return Math.min(findMinInRMQ(qs, mid, node.left), findMinInRMQ(mid + 1, qe, node.right));
    }

    private static int createRMQTree(int[] arr, int ss, int se, Node node) {
        if(ss == se) {
            node.min = arr[ss];
            return arr[ss];
        }

        int mid = (se + ss) / 2;

        node.left = new Node(ss, mid);
        node.right = new Node(1 + mid, se);

        node.min = Math.min(createRMQTree(arr, ss, mid, node.left), createRMQTree(arr, mid + 1, se, node.right));

        return node.min;
    }

    static class Node {
        int low;
        int high;
        int min;

        Node left;
        Node right;

        Node(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }
}