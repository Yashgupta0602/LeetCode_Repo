class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int minSal = Integer.MAX_VALUE;
        int maxSal = salary[0];
        int sum = 0;
        for(int i = 0; i<salary.length; i++){
            maxSal = Math.max(maxSal,salary[i]);
            minSal = Math.min(minSal,salary[i]);
            sum += salary[i];
        }
        double average = (double) (sum - maxSal - minSal) / (n -2);
        return average; 
    }
}
