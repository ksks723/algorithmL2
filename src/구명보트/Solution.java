package 구명보트;

import java.util.ArrayList;
import java.util.*;

public class Solution {
    public int solution(int[] people, int limit) { //이해가안되는군..
        int answer = 0;
        Arrays.sort(people);
        int index = people.length - 1;
        for (int i = 0; i <= index; i++, answer++) {
            while (index > i && people[i] + people[index--] > limit) {
                answer++;
            }
        }
        return answer;
    }

    public int solution2(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;

        while (i < j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            answer++;
        }

        if (i == j) {
            answer++;
        }

        return answer;
    }
    public int solution3(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        // 몸무게가 적게 나가는 사람 index
        int index = 0;
        for(int i = people.length-1; i>=index; i--){

            // 최대 최소 합이 limit보다 크면 제일 무거운사람 먼저 보냄
            if(people[i] + people[index] > limit){
                answer++;

            }
            // 최대 최소 합이 limit 보다 작거나 같으면 둘다 보냄
            else{
                index++;
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] pp = {70, 50, 80, 50, 60, 40, 80};
        int limit = 100;
        System.out.println(s.solution(pp, limit));
    }
}
