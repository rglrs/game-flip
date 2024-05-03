package memorygame;

import java.util.*;

/**
 * @author nouma
 */
public class TileControl {
    //GLOBALS 

    int cat1, cat2;

    int cow1, cow2;

    int frog1, frog2;

    int dog1, dog2;

    int elephant1, elephant2;

    int sparrow1, sparrow2;

    int hen1, hen2;

    int dolphin1, dolphin2;

    public void shuffle_tiles() {
        int position = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            array.add(i);
        }
        Collections.shuffle(array);

        //assign each picture their locations
        cat1 = array.get(position);
        position++;
        cat2 = array.get(position);
        position++;
        cow1 = array.get(position);
        position++;
        cow2 = array.get(position);
        position++;
        frog1 = array.get(position);
        position++;
        frog2 = array.get(position);
        position++;
        dog1 = array.get(position);
        position++;
        dog2 = array.get(position);
        position++;
        elephant1 = array.get(position);
        position++;
        elephant2 = array.get(position);
        position++;
        sparrow1 = array.get(position);
        position++;
        sparrow2 = array.get(position);
        position++;
        hen1 = array.get(position);
        position++;
        hen2 = array.get(position);
        position++;
        dolphin1 = array.get(position);
        position++;
        dolphin2 = array.get(position);
        position++;

    }

    //The type returned is a code from 0-7 that theoretically corresponds to a picture
 
    public int get_type_of_tile(int ID) {
        int type = 100;

        if (ID == cat1 || ID == cat2) {
            type = 0;

        } else if (ID == cow1 || ID == cow2) {
            type = 1;

        } else if (ID == frog1 || ID == frog2) {
            type = 2;
        } else if (ID == dog1 || ID == dog2) {
            type = 3;

        } else if (ID == elephant1 || ID == elephant2) {
            type = 4;

        } else if (ID == sparrow1 || ID == sparrow2) {
            type = 5;

        } else if (ID == hen1 || ID == hen2) {
            type = 6;

        } else if (ID == dolphin1 || ID == dolphin2) {
            type = 7;

        }

        return type;
    }
}
