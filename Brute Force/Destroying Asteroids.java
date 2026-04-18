class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int i =0;i<asteroids.length;i++){
            int curr  = asteroids[i];
            if(currMass >= curr){
                currMass += curr;
            }else{
                return false;
            }
        }
        return true;
    }
}
