package loyssya.labs.lab6;

import com.google.gson.*;
import java.io.*;
import java.util.logging.*;

public class LoyssyaJson {
    private static final String FILENAME = "d:\\loyssya.json";

    public static void main(String[] args) {
        Author author = new Author("Loyssya", 20, Author.Sex.FEMALE);
        Matrix originalMatrix = new Matrix(author);
        Matrix restoredMatrix = null;
        Calculator calculator = new Calculator();

        originalMatrix.setLength(7);
        originalMatrix.setWidth(7);
        originalMatrix.getRandomMatrix();

        System.out.println("\n\t\tMATRIX\n");
        originalMatrix.printMatrix();
        System.out.println("\n\tAUTHOR\n");
        System.out.println("Name: " + originalMatrix.getName() +
                "\nAge: " + originalMatrix.getAge() +
                "\nSex: " + originalMatrix.getSex());
        calculator.getMaximum(originalMatrix);
        calculator.getMinimum(originalMatrix);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String firstJson = gson.toJson(originalMatrix);

        try (FileWriter fileWriter = new FileWriter(FILENAME)) {
            fileWriter.write(firstJson);
        } catch (IOException ex) {
            Logger.getLogger(LoyssyaJson.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(FILENAME));
            restoredMatrix = gson.fromJson(reader, Matrix.class);

        } catch (IOException ex) {
            Logger.getLogger(LoyssyaJson.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        if (originalMatrix.equals(restoredMatrix) ){
            System.out.println("\nDone!");
        } else System.out.println("\nError! :/");
    }
}
