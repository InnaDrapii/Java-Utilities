package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayUtilities {

    public static <ItemType> ItemType getRandomItemFrom(List<ItemType> items) {
        int randomIndex = new Random().nextInt(items.size());
        return items.get(randomIndex);
    }

}