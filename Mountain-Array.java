class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndexInMountainArray(target,mountainArr);
        int first=orderAgnosticBS(mountainArr,target,0,peak);
        if(first!=-1){
            return first;
        }else{
          return orderAgnosticBS(mountainArr,target,peak+1, mountainArr.length()-1);
        }
        
    }
    public int orderAgnosticBS( MountainArray mountainArr,int target,int start,int end){
        boolean ascending=mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(ascending){
                if(mountainArr.get(mid)>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(mountainArr.get(mid)<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return-1;
    }
    public int peakIndexInMountainArray(int target, MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
             int mid=start+(end-start)/2;
            
             if( mountainArr.get(mid)< mountainArr.get(mid+1)){
                 start=mid+1;
               }
             else{
                 end=mid;
             }
            
        }
        return start;   
    }
}
