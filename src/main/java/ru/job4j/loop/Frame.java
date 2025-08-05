package ru.job4j.loop;

public class Frame {

    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isTopBottomBorder = row == 0 || row == size - 1;
                boolean isSideBorder = col == 0 || col == size - 1;
                if (isTopBottomBorder && isSideBorder) {
                    System.out.print("+");  // углы рамки
                } else if (isTopBottomBorder) {
                    System.out.print("-");  // верхняя и нижняя границы
                } else if (isSideBorder) {
                    System.out.print("|");  // левые и правые границы
                } else {
                    System.out.print(" ");  // внутреннее пространство рамки
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }

}

