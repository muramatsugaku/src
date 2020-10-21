package ex2.enumSample;

class EnumSample {
    static void viewColor(Color c) {
        switch (c) {
            case RED:
                System.out.println("赤");
                break;
            case BLUE:
                System.out.println("青");
                break;
            case YELLOW:
                System.out.println("黄");
        }
    }

    public static void main(String[] args) {
        EnumSample.viewColor(Color.RED);//赤

        for (Color c:Color.values()){
            System.out.println(c.ordinal() + ":" + c + ":" + c.getJpName());
        }
    }
}
