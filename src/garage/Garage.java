package garage;

import java.util.*;
import java.util.stream.Collectors;

public class Garage {


    public static void main(String[] args) {
        List <Onderhoud> onderhoudList = new ArrayList<>();
        String bmw = "bmw";
        String audi = "audi";
        String fiat = "fiat";

        onderhoudList.add(new Onderhoud(bmw, 0, 1));
        onderhoudList.add(new Onderhoud(audi, 0, 2));
        onderhoudList.add(new Onderhoud(bmw, 2, 4));
        onderhoudList.add(new Onderhoud(audi, 4, 5));
        onderhoudList.add(new Onderhoud(fiat, 0, 3));
        onderhoudList.add(new Onderhoud(fiat, 4, 7));
        onderhoudList.add(new Onderhoud(fiat, 9, 12));
        
        System.out.println("Original list");
        System.out.println(onderhoudList);

        List<Onderhoud> sortedList = sortOnderhoud(onderhoudList);
        System.out.println("List after sorting");
        System.out.println(sortedList);

        List<Onderhoud> adjList = joinAdjacent(onderhoudList);
        System.out.println("List after joining adjacent onderhoud");
        System.out.println(adjList);
        

    }

    public static List<Onderhoud> sortOnderhoud(List <Onderhoud> onderhoudList) {
        return onderhoudList.stream()
                            .sorted(
                                Comparator.comparing(Onderhoud::getNummerPlaat).thenComparing(Onderhoud::getStart))
                            .collect(Collectors.toList());

    }

    public static List<Onderhoud> joinAdjacent(List<Onderhoud> onderhoudList) {
        List <Onderhoud> sortedList = sortOnderhoud(onderhoudList);
        List <Onderhoud> adjList = new ArrayList<>();
        sortedList.forEach(onderhoud -> {
            if (adjList.size() > 0) {
                Onderhoud prevOnderhoud = adjList.get(adjList.size() - 1);
                if (prevOnderhoud.getNummerPlaat() == onderhoud.getNummerPlaat() && prevOnderhoud.end == onderhoud.start - 1) {
                    prevOnderhoud.end = onderhoud.end;
                } else {
                    adjList.add(onderhoud);
                }
            } else {
                adjList.add(onderhoud);
            }
        });
        return adjList;
    }




}