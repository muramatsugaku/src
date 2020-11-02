package question.q25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Q25 {
    //データの設定
    private static List<FreshFood> freshFoods = new ArrayList<>(100);
    private static List<Sale> sales = new ArrayList<>(100);
    private static Map<Integer,FreshFood> freshFoodMap = new HashMap<>(100);

    /**
     * 販売IDをKeyとしたMapを作成
     * @return Map Key 販売ID value 生鮮品インスタンス
     */
    public static Map<Integer,FreshFood> createMap() {
        Map<Integer,FreshFood> map = new HashMap<>();

        for (FreshFood e:freshFoods) {
            map.put(e.getId(),e);
        }
        return map;
    }

    /**
     *
     * @param saleDate
     * @param foodType
     */
    public static void displaySales(LocalDate saleDate,FoodType foodType) {
        List<Sale> displayList = new ArrayList<>();

        //指定された日の売上情報を抽出
        for (Sale s:sales) {
            if (saleDate.equals(s.getTimeOfSold().toLocalDate())) {//日付を比較する
                displayList.add(s);//指定日に該当していれば追加
            }
        }

        displayList.sort(Comparator.comparing(Sale::getTimeOfSold));//売上時刻順にソート

        //表示リストを対象に商品を紐づけて表示
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(saleDate) + "の販売");
        System.out.println("種類:" + foodType.getJapaneseName());
        for (Sale s:displayList) {
            if(freshFoodMap.containsKey(s.getId())) {//製品IDでマップを検索
                FreshFood food = freshFoodMap.get(s.getId());

                if (foodType.equals(food.getFoodType())) {
                    System.out.print(s.toStringTimeOfSold() + " ");
                    System.out.println(food);
                }
            }
        }
    }

    public static void main(String[] args) {

        //商品情報作成
        freshFoods.add(new Meet(101,"国産豚切り落とし",1.35,280,"2020-10-28",FoodType.MEET));
        freshFoods.add(new Meet(111,"国産若どり唐揚用(モモ肉)",1.26,300,"2020-10-29",FoodType.MEET));
        freshFoods.add(new Meet(121,"国内産黒毛和牛すきやき用",7.75,160,"2020-10-30",FoodType.MEET));
        freshFoods.add(new Meet(131,"国産豚ひき肉(解凍肉含む)",1.37,280,"2020-10-31",FoodType.MEET));
        freshFoods.add(new Meet(112,"阿波尾鶏正肉(モモ肉) ",2.38,250,"2020-11-01",FoodType.MEET));

        freshFoods.add(new Meet(201,"トロサーモン",7.9,160,"2020-10-28",FoodType.FISH));
        freshFoods.add(new Meet(202,"カンパチ",3.6,300,"2020-10-29",FoodType.FISH));
        freshFoods.add(new Meet(221,"アジ",1.66,330,"2020-10-30",FoodType.FISH));
        freshFoods.add(new Meet(245,"真ホッケ",2.14,350,"2020-10-31",FoodType.FISH));
        freshFoods.add(new Meet(262,"かつおたたき",8.02,300,"2020-11-01",FoodType.FISH));

        //販売情報作成
        sales.add(new Sale(262, LocalDateTime.of(2020,11,1,19,25,0)));
        sales.add(new Sale(101, LocalDateTime.of(2020,11,1,13,43,0)));
        sales.add(new Sale(201, LocalDateTime.of(2020,11,1,15,20,0)));
        sales.add(new Sale(111, LocalDateTime.of(2020,11,1,17,7,0)));
        sales.add(new Sale(245, LocalDateTime.of(2020,11,1,18,38,0)));


        sales.add(new Sale(121, LocalDateTime.of(2020,11,2,12,33,0)));
        sales.add(new Sale(202, LocalDateTime.of(2020,11,2,16,10,0)));
        sales.add(new Sale(221, LocalDateTime.of(2020,11,2,17,27,0)));
        sales.add(new Sale(121, LocalDateTime.of(2020,11,2,19,55,0)));
        sales.add(new Sale(131, LocalDateTime.of(2020,11,2,20,10,0)));


        //商品マップ作製
       freshFoodMap = createMap();

        //販売日を指定して表示
        displaySales(LocalDate.parse("2020-11-01"),FoodType.MEET);//2020-11-01 肉
        displaySales(LocalDate.parse("2020-11-01"),FoodType.FISH);//2020-11-01 魚

        displaySales(LocalDate.parse("2020-11-02"),FoodType.MEET);//2020-11-02 肉
        displaySales(LocalDate.parse("2020-11-02"),FoodType.FISH);//2020-11-02 魚

    }
}
