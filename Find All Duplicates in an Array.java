class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                }
                else{
                    i++;
                }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
