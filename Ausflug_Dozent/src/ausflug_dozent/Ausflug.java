package ausflug_dozent;

public class Ausflug {
    private boolean wochentag;
    private boolean wetter;
    private boolean schulferien;
    private boolean tageszeit;
    private boolean kinder;

    public boolean getWochentag() {
        return this.wochentag;
    } 

    public void setWochentag(String antwort) {
        if (antwort.equalsIgnoreCase("y")) {
            this.wochentag = true;
        }
        else {
            this.wochentag = false;
        }
    }

    public boolean getWetter() {
        return this.wetter;
    }

    public void setWetter(String antwort) {
        if (antwort.equalsIgnoreCase("y")) {
            this.wetter = true;
        }
        else {
            this.wetter = false;
        }
    }
    
    public boolean getSchulferien() {
        return this.schulferien;
    }

    public void setSchulferien(String antwort) {
        if (antwort.equalsIgnoreCase("y")) {
            this.schulferien = true;
        }
        else {
            this.schulferien = false;
        }
    }

    public boolean getTageszeit() {
        return this.tageszeit;
    }

    public void setTageszeit(String antwort) {
        if (antwort.equalsIgnoreCase("y")) {
            this.tageszeit = true;
        }
        else {
            this.tageszeit = false;
        }
    }

    public boolean getKinder() {
        return this.kinder;
    }

    public void setKinder(String antwort) {
        if (antwort.equalsIgnoreCase("y")) {
            this.kinder = true;
        }
        else {
            this.kinder = false;
        }
    }

    public Ausflug() {
        this.wochentag = true;
        this.wetter = true;
        this.schulferien = true;
        this.tageszeit = true;
        this.kinder = true;
    }

    @Override
    public String toString() {
        String string = "";

        if (this.wochentag) {
            string += "Wochentag\n";
        }
        else {
            string += "Wochenende\n";
        }

        if (this.wetter) {
            string += "Schönes Wetter\n";
        }
        else {
            string += "Regenwetter\n";
        }

        if (this.schulferien) {
            string += "Schulferien\n";
        }
        else {
            string += "Schule\n";
        }
        
        if (this.tageszeit) {
            string += "Tagsüber";
        }
        else {
            string += "Abends";
        }

        if (this.kinder) {
            string += "Mit Kindern";
        }
        else {
            string += "Ohne Kinder";
        }
        return string;
    }
}
