package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class WriteSymptomsDataInFile implements ISymptomsWriter{
    /**
     * Crée un nouveau fichier ou le remplace et ajoute dans
     * celui-ci l'ensemble des symptomes dans l'odre alphabétique
     * suivi de leur occurences
     *
     * @param symptoms
     *                  correspond à la map où se trouve l'ensemble des symptomes et le nombre de leur occurence
     * @param listeOrdonne
     *                   correspond à la liste ordonnée des symptomes
     *
     * @throws IOException
     */

    public void write(Map<String, Integer> symptoms, List<String> listeOrdonne) throws IOException {
        FileWriter writer = new FileWriter ("result.out");
        Collections.sort(listeOrdonne);
        for (String symptom : listeOrdonne){
            writer.write(symptom + ": " + symptoms.get(symptom) + "\n" );
        }
        writer.flush();
    }
}
