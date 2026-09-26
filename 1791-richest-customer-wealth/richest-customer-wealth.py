class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        max=0
        for i in range(len(accounts)):
            s=sum(accounts[i])
            if(max<s):
                max=s
        return max
        