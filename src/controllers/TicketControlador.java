package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.TicketsSoporte;

public class TicketControlador {
  public Map<String, Integer> filtrarYOrdernarTickets(List<TicketsSoporte> tickets,
      int prioridadMinima) {
    Map<String, Integer> personas = new HashMap<>();

    for (TicketsSoporte listas : tickets) {
      if (listas.getPrioridad() >= prioridadMinima) {
        personas.put(listas.getTecnico(), listas.getPrioridad());
      }
    }
    return personas;
  }

  public void agruparCodigoPorPrioridad(List<TicketsSoporte> tickets) {
    Map<String, Set<Integer>> nose = new HashMap();
    nose.put("Alto", new TreeSet<>());
    nose.put("Media", new TreeSet<>());
    nose.put("Bajo", new TreeSet<>());

    for (TicketsSoporte listas : tickets) {
      String categoria;
      if (listas.getPrioridad() >= 4) {
        categoria = "Alta";
        System.out.println(" - " + listas.getPrioridad() + " es de prioridad" + categoria);

      } else if (listas.getPrioridad() == 2 || listas.getPrioridad() == 3) {
        categoria = "Media";
        System.out.println(" - " + listas.getPrioridad() + " es de prioridad" + categoria);

      } else if (listas.getPrioridad() == 1) {
        categoria = "Baja";
        System.out.println(" - " + listas.getPrioridad() + " es de prioridad" + categoria);

      }
    }
  }
}
