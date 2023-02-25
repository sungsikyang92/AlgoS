package PG.Lv_0;

public class 외계어사전 {
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        int chk = 0;
        for (String word : dic) {
            for (String sp : spell) {
                System.out.println(word);
                System.out.println(sp);
                System.out.println(chk);
                if (word.contains(sp)) {
                    chk++;
                }
            }
            if (chk == spell.length) {
                answer = 1;
            }
            chk = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] spell = new String[]{"p", "o", "s"};
        String[] dic = new String[]{"sod", "eocd", "qixm", "adio", "soo"};
        int result = solution(spell, dic);
        System.out.println(result);
    }
}
