package v1.leetcode;

public class LongestCommonSubSequence {

	public int longestCommonSubsequence(String s, String t) {
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		int[][] dp = new int[sArray.length+1][tArray.length+1];

		for (int i=0; i<sArray.length; i++){
			for (int j=0; j<tArray.length; j++){

				// optional
				if(i==0 || j==0) dp[i][j] = 0;
				else if(sArray[i-1] == tArray[j-1]){
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[sArray.length][tArray.length];
	}
}
