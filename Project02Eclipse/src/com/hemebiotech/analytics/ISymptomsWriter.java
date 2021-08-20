package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ISymptomsWriter {
    /**
     *  Sauvegarde les paramètres map et l'ordre défini dans la liste ordonnée
     * @param symptoms
     * @param listeOrdonne
     * @throws IOException
     */
    public void write (Map<String, Integer> symptoms, List<String> listeOrdonne) throws IOException;

}
