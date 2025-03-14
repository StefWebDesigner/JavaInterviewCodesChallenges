package org.example.codeClasses;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExtractingFromFile {

    public List<String> extractFile(String fileName) throws IOException {
        // Creating an object of Path class
        Path path = Paths.get(fileName);

        // To read file to byte array
        byte[] bytes = Files.readAllBytes(path);

        // Display message only
        System.out.println(
                "Extracting the information");

        // Reading the file to String List
        @SuppressWarnings("unused")

        // Creating a List class object of string type
        // as data in file to be read is words
        List<String> allLines = Files.readAllLines(
                path, StandardCharsets.UTF_8);
        System.out.println(new String(bytes));

        return allLines;
    }







}
