class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int l = 0;
        int ctT = 0;
        int ctF = 0;
        int ans = 0;

        for (int i = 0; i < answerKey.length(); i++) {

            if (answerKey.charAt(i) == 'T') {
                ctT++;
            } else {
                ctF++;
            }

            while (Math.min(ctT, ctF) > k) {

                if (answerKey.charAt(l) == 'T') {
                    ctT--;
                } else {
                    ctF--;
                }

                l++;
            }

            ans = Math.max(ans, i - l + 1);
        }

        return ans;
    }
}