 public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
     int charged = b;
     int actual=0;
     for(int i =0;i<bill.size();i++){
         
         if(i==k){
             continue;
         }else{
             actual+=bill.get(i);
         }
     }
     actual=actual/2;
     if(charged==actual){
         System.out.println("Bon Appetit");
     }
     else{
         System.out.println(charged-actual);
     }

    }

}
