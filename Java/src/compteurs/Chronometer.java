package compteurs;

public class Chronometer extends CompteurCycle {
    private CompteurCycle hour = new CompteurCycle(0, 60, 0);
    private CompteurCycle minute = new CompteurCycle(0, 60, 0);
    private CompteurCycle second = new CompteurCycle(0, 60, 0);

    public Chronometer(int valeur, int max, int min){
        super(valeur,max, min);
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void incrementer() {
        second.incrementer();
        if (second.getVal() == 0) {
            minute.incrementer();
            if (minute.getVal() == 0) {
                hour.incrementer();
            }
        }

    }

    public void decrementer() {
        second.decrementer();
        if (second.getVal() == 59) {
            minute.decrementer();
            if (minute.getVal() == 59) {
                hour.decrementer();
            }
        }

    }
    public CompteurCycle getHour() {
        return hour;
    }

    public CompteurCycle getMinute() {
        return minute;
    }

    public CompteurCycle getSecond() {
        return second;
    }

    public String toString() {
        return hour.toString() + " : " + minute.toString() + " : " + second.toString();
    }

}
