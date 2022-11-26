class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Job> list = new ArrayList<>();
        int numberOfJobs = startTime.length;
        
        for(int i=0;i<numberOfJobs;i++){
            list.add(new Job(startTime[i], endTime[i], profit[i]));
        }
        Collections.sort(list, (a,b)-> a.getEndTime() - b.getEndTime());
        
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        
        int maxProfit = 0;
        for(Job job : list){
            Integer entryTillStartTime = map.floorKey(job.getStartTime()); // Gives closer key to current key
            Integer maxProfitTillStartTime = entryTillStartTime == null ? 0 : map.get(entryTillStartTime);
            maxProfit = Math.max(maxProfit, maxProfitTillStartTime + job.getProfit());
            map.put(job.getEndTime(), maxProfit);
        }
        
        return maxProfit;
    }
}

class Job{
    private Integer startTime;
    private Integer endTime;
    private Integer profit;
    
    public Job(Integer startTime, Integer endTime, Integer profit){
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }
    
    public Integer getEndTime(){
        return endTime;
    }
    
    public Integer getStartTime(){
        return startTime;
    }
    
    public Integer getProfit(){
        return profit;
    }
}