package Lv_1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        String[] phone_num_arr = phone_number.split("");
        for (int i = 0; i < phone_number.length() - 4; i++) {
            phone_num_arr[i] = "*";
        }
        for (int i = 0; i < phone_num_arr.length; i++) {
            answer += phone_num_arr[i];
        }
        return answer;
    }
}
