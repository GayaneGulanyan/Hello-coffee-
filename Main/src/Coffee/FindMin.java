package Coffee;

public class FindMin {



    public static float min(float a, float b, float c){
        if (a<b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        }
        else {return b;}
        }
    public static float min(float a, float b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static float min(float a, float b, float c, float d){
        float e = min(a, b);
        float f = min(c, d);
        return min(e, f);
    }

}

