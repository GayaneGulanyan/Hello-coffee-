package Coffee;

public class FindMin {



    public static float findMinFrom3Args(float a, float b, float c){
        if (a<b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        }
        else {return b;}
        }
    public static float findMinFrom2Args(float a, float b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static float findMinFrom4Args(float a, float b, float c, float d){
        float e = findMinFrom2Args(a, b);
        float f = findMinFrom2Args(c, d);
        return findMinFrom2Args(e, f);
    }

}

