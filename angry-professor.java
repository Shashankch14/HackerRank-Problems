public static String angryProfessor(int k, List<Integer> a) {
        String ans ="";
        
        int neg=0;
        for(int i =0;i<a.size();i++){
            if(a.get(i)<=0){
                neg++;
            }
            
        }
        if(neg>=k){
            ans="NO";
        }else {
            ans="YES";
        }
        return ans;
        
    // Write your code here

    }

}
