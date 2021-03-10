public class GuguDan {
    public static void main(String[] args) {

        /**
         * 메서드는 한 가지 일만 처리해야 한다.
         * 비슷한 일을 하는 메서드를 여러개 만들어 작업 단위를 쪼개라.
         */

        // 3단은 순서대로, 4단은 역순으로, 엇갈리면서 구구단 찍기
        for (int i = 1; i < 10; i++) {
            for (int j = i; j == i; j++) {
                System.out.println(3 * j);
            }
            for (int k = 10 - i; k == 10 - i; k--) {
                System.out.println(4 * k);
            }
        }

        System.out.println();


    }


}

