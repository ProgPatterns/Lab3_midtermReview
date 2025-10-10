public class TikTakToe {
    public static void main(String[] args) {
        char[][] tikTakToe = {
                {'O', 'O', 'O'},
                {'X', 'O', 'X'},
                {'O', 'X', 'X'}
        };

        char[][] tikTakToe2 = {
                {'O', 'X', 'O'},
                {'O', 'O', 'X'},
                {'O', 'X', 'X'}
        };

        char[][] tikTakToe3 = {
                {'O', 'X', 'O'},
                {'X', 'O', 'X'},
                {'O', 'X', 'O'}
        };

        char[][] tikTakToe4 = {
                {'O', 'X', 'O'},
                {'X', 'O', 'X'},
                {'O', 'X', 'X'}
        };

        System.out.println(checkWin(tikTakToe));
        System.out.println(checkWin(tikTakToe2));
        System.out.println(checkWin(tikTakToe3));
        System.out.println(checkWin(tikTakToe4));

    }

    public static boolean checkWin(char[][] tikTakToe){
        int n = tikTakToe.length;
        for(int i = 0; i < n; i++){
            int counterA = 0;
            int counterB = 0;
            for(int j = 0; j < tikTakToe[i].length; j++){
                if(tikTakToe[i][j] == 'X'){
                    counterA++;
                } else {
                    counterA = 0;
                }

                if (tikTakToe[i][j] == 'O') {
                    counterB++;
                }else {
                    counterB = 0;
                }
            }
            if(counterA == 3 || counterB == 3){
                return true;
            }
        }

        for(int i = 0; i < n; i++) {
            int counterA = 0;
            int counterB = 0;
            for (int j = 0; j < tikTakToe[i].length; j++) {
                if(tikTakToe[j][i] == 'X'){
                    counterA++;
                } else {
                    counterA = 0;
                }
                if (tikTakToe[j][i] == 'O') {
                    counterB++;
                }else {
                    counterB = 0;
                }
            }
            if(counterA == 3 || counterB == 3){
                return true;
            }
        }

        int counterA = 0;
        int counterB = 0;
        for(int i = 0; i < n; i++) {
            if(tikTakToe[i][i] == 'X'){
                counterA++;
            }
            if (tikTakToe[i][i] == 'O') {
                counterB++;
            }
        }
        if(counterA == 3 || counterB == 3){
            return true;
        }else{
            counterA = 0;
            counterB = 0;
        }

        for(int i = 0; i < n; i++){
            if(tikTakToe[i][n-1-i] == 'X'){
                counterA++;
            }
            if(tikTakToe[i][n-1-i] == 'O'){
                counterB++;
            }
        }
        if(counterA == 3 || counterB == 3){
            return true;
        }
        return false;
    }
}
