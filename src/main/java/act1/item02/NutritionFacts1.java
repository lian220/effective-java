package act1.item02;

import lombok.Builder;
import lombok.Singular;

import java.util.Arrays;
import java.util.List;

@Builder
public class NutritionFacts1 {

    @Builder.Default private int servingSize = 10;
    private int sodium;
    private int carbohydrate;
    private int servings;
    @Singular private List<String> names;

    public static void main(String[] args) {
        NutritionFacts1 nutritionFacts = NutritionFacts1.builder()
                .servings(10)
                .carbohydrate(100)
                .name("keesun")
                .name(String.valueOf(Arrays.asList("test","test")))
                .clearNames()
                .build();
    }
}
