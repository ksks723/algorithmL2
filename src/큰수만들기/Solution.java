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
        System.out.println(arr);
        System.out.println(list);
        int ar = 0;
        for (int j = 0; j < list.size(); j++) { //[1,2,3,1,2,3,4]
            if (ar < k) {
                if (arr.get(ar) == j) {
                    ar += 1;
                    continue;
                }
            }
            answer += list.get(j);

        }

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1231234", 3)); //3234
    }
}
