package question.q25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class FreshFood {
    static final double TAX = 0.1;
    private int id;
    private String name;
    private double unitPrice;
    private double weight;
    private LocalDate processed;
    private FoodType foodType;

    /**
     * 生鮮食品のコンストラクタ
     * @param id int
     * @param name String
     * @param unitPrice duble
     * @param weight double
     * @param processed String (ISO-8601)
     * @param foodType FoodType
     */
    public FreshFood(int id, String name, double unitPrice, double weight, String processed, FoodType foodType) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.weight = weight;
        this.processed = LocalDate.parse(processed);
        this.foodType = foodType;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getProcessed() {
        return processed;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public String toStringFoodType() {
        return foodType.getJapaneseName();
    }

    public String toStringProcessed() {
        return DateTimeFormatter.ofPattern("yyyy/MM/dd").format(processed);
    }

    abstract public double getPrice();

    public LocalDate getExpirationDate() {
        return processed.plusDays(5);
    }

    @Override
    /**
     * 販売ID 商品名 g単価（100gに変換表示 重量(g) 加工日 税込み価格
     */
    public String toString() {
        return String.format("販売ID:%d %s %.0f円(100g) %.1fg 加工:%s %.0f円(税込み)",
                id,name,unitPrice * 100,weight,toStringProcessed(),getPrice());
    }
}
