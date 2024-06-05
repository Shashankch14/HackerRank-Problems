public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
    int n= arr.size();
    List<Integer> al = new ArrayList<>();
    Collections.sort(arr);
    int minDiff=Integer.MAX_VALUE;
    
    for(int i =1;i<n;i++){
        int diff = arr.get(i)- arr.get(i-1);
        minDiff = Math.min(diff,minDiff);
    }
    for(int i=1;i<n;i++){
        int diff = arr.get(i)-arr.get(i-1);
        if(diff==minDiff){
            al.add(arr.get(i-1));
            al.add(arr.get(i));
            
        }
    }
    return al;

    }

}
