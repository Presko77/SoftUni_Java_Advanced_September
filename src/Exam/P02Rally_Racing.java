package Exam;

import java.io.IOException;
import java.util.Scanner;

public class P02Rally_Racing {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String racingCar = scanner.nextLine();
        String[][] matrix = new String[size][size];

        int rowIndex = -1;
        int columnIndex = -1;

        for (int i = 0; i < size; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = row[j];

                rowIndex = i - size + 1;
                columnIndex = j - size + 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            matrix[rowIndex][columnIndex] = String.valueOf('A');

            if (command.equals("right") && columnIndex != size - 1) {
                columnIndex++;
            } else if (command.equals("left") && columnIndex != 0) {
                columnIndex--;
            } else if (command.equals("down") && rowIndex != size - 1) {
                rowIndex++;
            } else if (command.equals("up") && rowIndex != 0) {
                rowIndex--;
            }

            if (matrix[rowIndex][columnIndex].equals("T")){
                int protalRow = findOtherMirrorLocationRow(matrix, rowIndex, columnIndex);
                int portalCol = findOtherMirrorLocationCol(matrix,rowIndex, columnIndex);
                matrix[protalRow][portalCol].replace("T" , "T");
            }

                command = scanner.nextLine();
            }
    }
    private static int findOtherMirrorLocationCol(String[][] matrix, int officerRow, int officerCol) {
        int start = officerCol + 1;
        for (int row = officerRow; row < matrix.length; row++) {
            for (int col = start; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("T")){
                    return col;
                }
            }
            start = 0;
        }
        return 0;
    }

    private static int findOtherMirrorLocationRow(String[][] matrix, int officerRow, int officerCol) {
        int start = officerCol + 1;
        for (int row = officerRow; row < matrix.length; row++) {
            for (int col = start; col < matrix[row].length; col++) {
                if (matrix[row][col].equals("T")){
                    return row;
                }
            }
            start = 0;
        }
        return 0;
    }
}
