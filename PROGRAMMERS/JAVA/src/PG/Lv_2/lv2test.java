package PG.Lv_2;

public class lv2test {
    public static int solution(int n, int m, String[] names, String[][] authors) {
        int answer = 0;
        int a = authors[0].length;
        int b = a + 1;
        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 8;
        String[] names = {"justi", "cehui", "jhnah", "erdos", "aaaaa", "bbbbb", "ccccc", "ddddd"};
        String[][] authors = {{"erdos","justi"},{"justi","cehui"},{"cehui","jhnah"},{"jhnah","aaaaa"},{"aaaaa","bbbbb"},{"bbbbb","ccccc"},{"ccccc","ddddd"},{"ccccc","ddddd"}};
        int result = solution(n, m, names, authors);
        System.out.println("결과는 = " + result);
    }
}
