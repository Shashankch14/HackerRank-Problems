public static String balancedSums(List<Integer> arr) {
    // Write your code here
    int n = arr.size();
     int rightSum=0;
     for(int i =0;i<n;i++){
         rightSum+=arr.get(i);
     }
     int leftSum=0;
     for(int i =0;i<n;i++){
         rightSum-=arr.get(i);
         if(leftSum==rightSum){
             return "YES";
         }
         leftSum+=arr.get(i);
     }
     return "NO";

    }
