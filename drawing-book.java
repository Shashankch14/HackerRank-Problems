public static int pageCount(int n, int p) {
    // Write your code here
    int front= p/2;
    int back = (n/2) - (p/2);
    return Math.min(front,back);

    }

}
