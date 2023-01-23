package act1.item02;

public class NutritionFacts {

    private int servingSize;
    private int servings;
    private int calories;
    private int sodium;
    private int carbohydrate;


    //생성자가 많을때는 파라미터가 뭔지 읽기 어렵다
    public NutritionFacts(int servingSize, int servings, int calories, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFacts(int servingSize, int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public  static void main(String[] arg) {
        NutritionFacts nutritionFacts = new NutritionFacts(1, 6, 10, 20, 10);


//        멀티쓰레드 환경에서는 안정성이 떨어진다.
//        최종적인 인스턴스를 만들기까지 여러번의 호출을 거쳐야 하기 때문에 자바빈이 중간에 사용되는 경우 안정적이지 않은 상태로 사용될
//        여지가 있다. 불변클래스로 만들지 못한다는 단점이 있다.
//        freezing
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setCalories(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);

//        빌더 패턴은 만들려는 객체를 바로 만들지 않고 클라이언트는 빌더(생성자 또는 static 팩토리)에 필수적인 매개변수를 주면서 호출해
//        Builder 객체를 얻은 다음 빌더 객체가 제공하는 세터와 비슷한 메소드를 사용해서 부가적인 필드를 채워넣고 최종적으로 build라는
//        메소드를 호출해서 만들려는 객체를 생성한다.

    }

    public NutritionFacts() {

    }



    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }


}
