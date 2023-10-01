package pr4.task4;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    // Конструктор для создания матрицы с указанным количеством строк и столбцов
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    // Метод для сложения матрицы с другой матрицей
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Матрицы имеют разные размеры");
        }

        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения матрицы на число
    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для умножения матриц
    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Нельзя умножить матрицы с данными размерами");
        }

        Matrix result = new Matrix(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                double sum = 0.0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    // Метод для вывода матрицы на печать
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.data[0][0] = 1;
        matrix1.data[0][1] = 2;
        matrix1.data[0][2] = 3;
        matrix1.data[1][0] = 4;
        matrix1.data[1][1] = 5;
        matrix1.data[1][2] = 6;

        Matrix matrix2 = new Matrix(3, 2);
        matrix2.data[0][0] = 7;
        matrix2.data[0][1] = 8;
        matrix2.data[1][0] = 9;
        matrix2.data[1][1] = 10;
        matrix2.data[2][0] = 11;
        matrix2.data[2][1] = 12;

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        Matrix product1 = matrix1.multiply(2);
        System.out.println("Умножение матрицы 1 на число 2:");
        product1.print();

        Matrix product2 = matrix1.multiply(matrix2);
        System.out.println("Умножение матриц:");
        product2.print();
    }
}

