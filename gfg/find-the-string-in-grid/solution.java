

//User function Template for Java

class Solution
{
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        int len = word.length();
        int i=0,j,k,z;
        int a=0;
        char w = word.charAt(0);
        int df,dlf,drf,uf,ulf,urf,lf,rf;
        //System.out.println(m + " " + n + " " + len);
        int ar[] = new int[1000];
        for(k=0;k<(m*n);k++)
        { 
            j=k;
            if(k>=n && k%n==0)
                i++;
            if(k>=n)
                j=k-(i*n);
            
            if(grid[i][j]==w)     
            {
                //System.out.println("i:" + i + "j: " + j);
                df=dlf=drf=uf=ulf=urf=lf=rf=1;
                for(z=1;z<len;z++)
                {
                    //down
                    if(m>(i+len-1))
                    {
                        if(grid[i+z][j]==word.charAt(z))
                            df++;
                        if((j-(len-1))>=0 && grid[i+z][j-z]==word.charAt(z))
                            dlf++;
                        if((j+(len-1))<n && grid[i+z][j+z]==word.charAt(z))//
                            drf++;
                    }
                    //right
                    if(j+(len-1)<n)
                    {
                        if(grid[i][j+z]==word.charAt(z))
                            rf++;
                    }
                    //up
                    if((i-len+1)>=0)
                    {
                        if(grid[i-z][j]==word.charAt(z))
                            uf++;
                        if((j-(len-1))>=0 && grid[i-z][j-z]==word.charAt(z))
                            ulf++;
                        if((j+(len-1))<n && grid[i-z][j+z]==word.charAt(z))//
                            urf++;
                    }
                    //left
                    if(j-(len-1)>=0)
                    {
                        if(grid[i][j-z]==word.charAt(z))
                            lf++;
                    }
                    
                }
                if(df==len || dlf==len || drf==len || uf==len || ulf==len || urf==len || lf==len || rf==len)
                {
                    ar[a++]=i;
                    ar[a++]=j;
                }
            }
        }
        int arr[][] = new int[a/2][2];
        j=0;
        for(i=0;i<a;)
        {
            arr[j][0]=ar[i++];
            arr[j][1]=ar[i++];
            j++;
        }
        return arr;
    }
}