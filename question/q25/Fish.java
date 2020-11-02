package question.q25;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Fish extends FreshFood{
    public Fish(int id, String name, double unitPrice, double weight, String processed, FoodType foodType) {
        super(id, name, unitPrice, weight, processed, foodType);
    }

    @Override
    public double getPrice() {
        long daysElapsed = ChronoUnit.DAYS.between(getProcessed(), LocalDate.now());
        double price = 0, discount = 0;
        if (daysElapsed == 3) {
            discount = 0.3;
        } else if (daysElapsed == 4){
            discount = 0.4;
        } else if (daysElapsed == 5){
            discount = 0.5;
        } else if(daysElapsed > 5) {
            discount = 1;
        }
        return getWeight() * getUnitPrice()  * (1 - discount) * (1 + TAX);
    }
}
