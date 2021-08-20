package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class WriteSymptomsDataInFile implements ISymptomsWriter{

    public void write(Map<String, Integer> symptoms, List<String> listeOrdonne) throws IOException {
        FileWriter writer = new FileWriter ("result.out");
        Collections.sort(listeOrdonne);
        for (String symptom : listeOrdonne){
            writer.write(symptom + ": " + symptoms.get(symptom) + "\n" );
        }
        writer.flush();
    }
}
