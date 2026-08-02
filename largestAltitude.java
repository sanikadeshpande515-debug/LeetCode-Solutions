class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude=0;
        int maxAltitude=0;
        for(int i=0;i<gain.length;i++){
            currentAltitude+=gain[i];
            if(maxAltitude<currentAltitude){
                maxAltitude=currentAltitude;
            }

        }
    return maxAltitude;   
    }
}
