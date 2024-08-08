package tasksSummary;

public class testMatrixPlay {
    public static void play(int[][] matrix){
        // generate random start point
        int rangeI = matrix.length;
        int rangeJ = matrix[0].length;
        int i = (int)(Math.random() * rangeI);
        int j = (int)(Math.random() * rangeJ);

        System.out.println("first point "+ i + " "+ j);
        //matrix[y][x] = 1;

        boolean endFlag = false;

        // Переменная direction отвечает за направление движения
        String direction = "upright"; // start direction

        int num = 1;

        while(!endFlag){
            switch (direction) {
                case "upright":
                    while (i > 0 && j < matrix[0].length-1 && !endFlag)
                    {
                        if (matrix[i][j] == 0){
                            matrix[i][j] = num;
                            num++;
                        }
                        else endFlag = true;
                        i--;
                        j++;
                    }
                    if(endFlag) break;
                    if (matrix[i][j]==0){
                        matrix[i][j] = num;
                        num++;
                    }
                    else endFlag = true;
                    if (i == 0 && j == matrix[0].length - 1 || endFlag)
                    {// upper right corner
                        endFlag = true;
                        break;
                    }
                    if (i==0) {
                        direction = "downright";
                        i++;
                        j++;
                        break;
                    }
                    if (j == matrix[0].length - 1)
                    {
                        direction = "upleft";
                        i--;
                        j--;
                        break;
                    }
                case "upleft":
                    while (i > 0 && j > 0 && !endFlag)
                    {
                        if (matrix[i][j]==0){
                            matrix[i][j] = num;
                            num++;
                        }
                        else endFlag = true;
                        i--;
                        j--;

                    }

                    if(endFlag) break;
                    if (matrix[i][j]==0){
                        matrix[i][j] = num;
                        num++;
                    }
                    else endFlag = true;


                    if (i == 0 && j == 0 || endFlag)
                    {// down right corner
                        endFlag = true;
                        break;
                    }
                    if (i == 0) {
                        direction = "downleft";
                        i++;
                        j--;
                        break;
                    }
                    if (j == 0)
                    {
                        direction = "upright";
                        i--;
                        j++;
                        break;
                    }
                    endFlag = true;
                    break;
                case "downright":
                    while (i < matrix.length - 1 && j < matrix[0].length - 1 && !endFlag)
                    {
                        if (matrix[i][j]==0){
                            matrix[i][j] = num;
                            num++;
                        }
                        else endFlag = true;
                        i++;
                        j++;
                    }

                    if(endFlag) break;
                    if (matrix[i][j]==0){
                        matrix[i][j] = num;
                        num++;
                    }
                    else endFlag = true;

                    if (i == matrix.length - 1 && j == matrix[0].length - 1)
                    {// down right corner
                        endFlag = true;
                        break;
                    }
                    if (i == matrix.length - 1) {
                        direction = "upright";
                        i--;
                        j++;
                        break;
                    }
                    if (j == matrix[0].length - 1)
                    {
                        direction = "downleft";
                        i++;
                        j--;
                        break;
                    }
                    endFlag = true;
                    break;
                case "downleft":
                    while (i < matrix.length - 1 && j > 0 && !endFlag)
                    {
                        if (matrix[i][j]==0){
                            matrix[i][j] = num;
                            num++;
                        }
                        else endFlag = true;
                        i++;
                        j--;
                    }
                    if(endFlag) break;
                    if (matrix[i][j]==0){
                        matrix[i][j] = num;
                        num++;
                    }
                    else endFlag = true;
                    if (i == matrix.length - 1 && j == 0 || endFlag)
                    {// down left corner
                        endFlag = true;
                        break;
                    }
                    if (i== matrix.length - 1) {
                        direction = "upleft";
                        i--;
                        j--;
                        break;
                    }
                    if (j == 0)
                    {
                        direction = "downright";
                        i++;
                        j++;
                        break;
                    }
                    endFlag = true;
                    break;

            }
        }
        System.out.println(direction);

    }
}
