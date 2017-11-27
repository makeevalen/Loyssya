package loyssya.labs.lab3;


public class LabThird {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Calculator calculator = new Calculator();

        matrix1.setLength(7);
        matrix1.setWidth(8);
        matrix1.getRandom();
        calculator.setLength(matrix1.getLength());
        calculator.setWidth(matrix1.getWidth());
        calculator.setMas(matrix1.getMas());
        calculator.getMaximum();
        calculator.getMinimum();

    }
}







