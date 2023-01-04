public class 가위바위보 {
    public String solution(String rsp) {
        String answer = "";
        char[] rsp_c = rsp.toCharArray();
        for (char rspc : rsp_c) {
            if (rspc == '2') {
                answer += "0";
            } else if (rspc == '0') {
                answer += "5";
            } else if (rspc == '5') {
                answer += "2";
            }
        }
        return answer;
    }
}
