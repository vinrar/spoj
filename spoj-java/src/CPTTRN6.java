import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class CPTTRN6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();

            int x = in.nextInt();
            int y = in.nextInt();

            boolean first = true;

            for(int i = 0; i < n; i++) {
                for (int k = 0; k < x; k++) {
                    first = true;
                    for (int l = 0; l < m; l++) {
                        if (first) {
                            for (int Z = 0; Z < y; Z++) {
                                System.out.print(".");
                            }
                            System.out.print("|");
                            for (int Z = 0; Z < y; Z++) {
                                System.out.print(".");
                            }
                        }

                        if (!first) {
                            System.out.print("|");
                            for (int Z = 0; Z < y; Z++) {
                                System.out.print(".");
                            }
                        }
                        first = false;
                    }
                    System.out.println();
                }


                first = true;
                for (int l = 0; l < m; l++) {
                    if (first) {
                        for (int Z = 0; Z < y; Z++) {
                            System.out.print("-");
                        }
                        System.out.print("+");
                        for (int Z = 0; Z < y; Z++) {
                            System.out.print("-");
                        }
                    }

                    if (!first) {
                        System.out.print("+");
                        for (int Z = 0; Z < y; Z++) {
                            System.out.print("-");
                        }
                    }
                    first = false;
                }

                System.out.println();
            }


            for (int k = 0; k < x; k++) {
                first = true;
                for (int l = 0; l < m; l++) {
                    if (first) {
                        for (int Z = 0; Z < y; Z++) {
                            System.out.print(".");
                        }
                        System.out.print("|");
                        for (int Z = 0; Z < y; Z++) {
                            System.out.print(".");
                        }
                    }

                    if (!first) {
                        System.out.print("|");
                        for (int Z = 0; Z < y; Z++) {
                            System.out.print(".");
                        }
                    }
                    first = false;
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}