class Solution {
    public int mirrorFrequency(String s) {
         int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int ans = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            char m = (char) ('z' - (c - 'a'));

            if (c <= m) { 
                ans += Math.abs(freq[c] - freq[m]);
            }
        }

        for (char c = '0'; c <= '9'; c++) {
            char m = (char) ('9' - (c - '0'));

            if (c <= m) {
                ans += Math.abs(freq[c] - freq[m]);
            }
        }

        return ans;
    }
}
