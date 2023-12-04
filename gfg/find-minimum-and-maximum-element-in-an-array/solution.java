

//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute {
    static Pair getMinMax(long a[], long n)  {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(long i : a) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        return new Pair(min, max);
    }
}