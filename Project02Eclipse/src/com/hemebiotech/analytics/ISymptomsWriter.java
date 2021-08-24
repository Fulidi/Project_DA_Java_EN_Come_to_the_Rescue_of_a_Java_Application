package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * Permet d'interfacer le résultat obtenu avec map et list
 * pour l'écrire (injecter) dans n'importe quoi
 *
 */

public interface ISymptomsWriter {
    /**
     *  Sauvegarde les paramètres map et l'ordre défini dans la liste ordonnée
     * @param symptoms
     *                  correspond à la map où se trouve l'ensemble des symptomes et le nombre de leur occurence
     * @param listeOrdonne
     *                   correspond à la liste ordonnée des symptomes
     * @throws IOException
     */
    public void write (Map<String, Integer> symptoms, List<String> listeOrdonne) throws IOException;

}
