package garage;

public class Onderhoud {
    public int start;
    public int end;
    public String nummerplaat;

    public Onderhoud (String nummerplaat, int start, int end) {
        this.nummerplaat = nummerplaat;
        this.start = start;
        this.end = end;
    }

    public String getNummerPlaat() {
        return this.nummerplaat;
    }
    
    public int getStart() {
        return this.start;
    }

    public String toString() {
        return "" + nummerplaat + ": start: " + start + " end: " + end;
    }

}
