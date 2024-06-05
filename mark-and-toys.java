
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int count =0;
        int totalCost=0;
        for(int i =0;i<prices.size();i++){
            if(totalCost+prices.get(i)<=k){
                count++;
                totalCost+=prices.get(i);
            }else{
                break;
            }
        }
    // Write your code here
    return count;
    //  Collections.sort(prices);
    // int i = 0;
    // while (k > -1){
    //     k = k - prices.get(i);
    //     i += 1;            
    // } 
    // return i - 1;   

    }
