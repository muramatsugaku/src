package question.q25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Sale {
    private int id;
    private LocalDateTime timeOfSold;

    public Sale(int id, LocalDateTime timeOfSold) {
        this.id = id;
        this.timeOfSold = timeOfSold;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTimeOfSold() {
        return timeOfSold;
    }

    public String toStringTimeOfSold() {
        return DateTimeFormatter.ofPattern("HH:mm:ss").format(timeOfSold);
    }

    @Override
    public String toString() {
        return String.format("販売時刻:%s 販売ID:%s",toStringTimeOfSold(),id);
    }
}
