package 구명보트;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int[] people, int limit) { //이해가안되는군..
        int answer = 0;
        Arrays.sort(people);
        int index = people.length-1;
        for(int i=0;i<= index; i++, answer++){
            while (index > i && people[i] + people[index--] > limit){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] pp = {70,50,80,50,60,40,80};
        int limit = 100;
        System.out.println(s.solution(pp,limit));
    }
}
