package leetcode.trees;

public class Solution_1154 {
    public int dayOfYear(String date) {
        int []arr ={31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));

        // leap year check
        if(month>2 && year%4==0 && (year %100 != 0 || year %400  == 0)) day= day+1;
        
        while(--month>0){
            day = day + arr[month-1];
        }
        return day;
    }
}
