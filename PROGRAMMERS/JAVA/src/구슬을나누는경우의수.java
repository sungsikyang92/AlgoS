public class 구슬을나누는경우의수 {
    public int combination(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        } else {
            return combination(balls - 1, share - 1) + combination(balls - 1, share);
        }
    }
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static void main(String[] args) {
        int result = solution(30, 30);
        System.out.println(result);
    }
}
