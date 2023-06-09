package exception;

public class ExceptionHand1 {

    public static void main(String[] args) {
        try {
            // ArrayIndexOutOfBoundsException
            int[] num = new int[2];

            num[0] = 1;
            num[1] = 2;
            num[2] = 3;

            System.out.println("1, 2, 3 저장");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다.");
        }
        System.out.println("done");
    }
}
