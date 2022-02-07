import java.util.Random;
import java.util.Scanner;
/*
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек
4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока. */

public class TicTacToe {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }



    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }




    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean checkWin(char symb) {
       for (int i = 0; i< SIZE; i++) {
           int row = 0;
           int column = 0;
           int mainDiag = 0;
           int subDiag = 0;
           for (int j = 0; j < SIZE; j++) {
               if (map[i][j] == symb) {
                   row++;
               }
               if (map[i][j] == symb) {
                   column++;
               }
               if (map[i][j] == symb) {
                   mainDiag++;
               }
               if (map[i][SIZE - 1 - j] == symb) {
                   subDiag++;
               }
               if(row == DOTS_TO_WIN ||
               column == DOTS_TO_WIN ||
               mainDiag == DOTS_TO_WIN ||
               subDiag == DOTS_TO_WIN) {
                   return true;
               }
           }
       }
       return false;
    }

   public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
   }


    public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("The Human won");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Even score");
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("The bot won");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Even score");
                }
            }
        }
}

