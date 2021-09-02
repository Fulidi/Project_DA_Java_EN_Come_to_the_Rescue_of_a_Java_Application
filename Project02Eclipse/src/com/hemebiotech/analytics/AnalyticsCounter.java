package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class AnalyticsCounter {


	public static void main(String args[]) {
		// Appel la classe qui lit le fichier

		ISymptomReader reader  = new ReadSymptomDataFromFile("C:\\Users\\maxim\\OneDrive\\Documents\\Projet Openclassroom\\Projet 2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master\\Project02Eclipse\\symptoms.txt");

		// Construit la Map et la list à partir des données extraites

		List<String> listeBrute =reader.getSymptoms() ;
		Map<String, Integer> symptoms  = new HashMap<>();
		List<String> listeOrdonne = new ArrayList();

		for (String symptom: listeBrute) {
			if (!symptoms.containsKey(symptom)){
				symptoms.put(symptom, 1);
				listeOrdonne.add(symptom);
			}
			else {
				symptoms.put(symptom,symptoms.get(symptom)+1);
		}


			// Imprime la liste des symptomes et leur occurence
		}
		for (String symptom: symptoms.keySet()
			 ) {
			System.out.println(symptom +" : " + symptoms.get(symptom));

		}
		System.out.println(symptoms);
		System.out.println(symptoms.size());
		
		// Appel de classe pour écriture

		ISymptomsWriter writer = new WriteSymptomsDataInFile();
		writer.write(symptoms, listeOrdonne);

	}


}
