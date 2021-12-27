class Solution {
    public int findComplement(int num) {
        int cou = num;
        int mask = 1;
        while(cou!=0){
            num = num^mask;
            mask = mask<<1;
            cou = cou>>1;
        }
        return num;
    }
}