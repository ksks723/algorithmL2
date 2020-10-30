package 큰수만들기;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            list.add(number.charAt(i) - '0');
        }

        System.out.println(list); //[1,2,3,1,2,3,4]

        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (k == arr.size()) {
                    break;
                }
                if (list.get(j) == i) {
                    arr.add(j);
                }
            }
        }

        for(int i=0;i<list.size();i++){

                if(i == arr.get(i)){
                    continue;
                }else{
                    answer += list.get(i);
                }


        }
        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1231234", 3)); //3234
    }
}
