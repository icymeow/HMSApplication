package Utils;

import java.io.*;
import java.util.*;

public class CSVUtils {

    // Load data from CSV file
    public static List<String[]> readCSV(String fileName) {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
        return records;
    }

    // Write data to CSV file
    public static void writeCSV(String fileName, List<String[]> data) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (String[] record : data) {
                pw.println(String.join(",", record));
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + fileName);
        }
    }
}