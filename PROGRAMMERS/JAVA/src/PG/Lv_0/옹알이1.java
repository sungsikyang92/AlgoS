package PG.Lv_0;

public class 옹알이1 {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] nephew = new String[]{"aya", "ye", "woo", "ma"};
        String[] copied_bab = babbling.clone();
        for (int i = 0; i < babbling.length; i++) {
            for (String ne : nephew) {
                if (copied_bab[i].contains(ne)) {
                    copied_bab[i] = copied_bab[i].replace(ne, " ");
                }
            }
        }
        for (int i = 0; i < copied_bab.length; i++) {
            copied_bab[i] = copied_bab[i].replace(" ","");
        }
        for (int i = 0; i < copied_bab.length; i++) {
            if (copied_bab[i].equals("")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = new String[]{"aya", "yee", "u", "maa", "wyeoo"};
//        String[] babbling = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int result = solution(babbling);
        System.out.println(result);
    }
}
