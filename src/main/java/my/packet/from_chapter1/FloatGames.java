package my.packet.from_chapter1;

public class FloatGames {
    public static void main(String[] args) {
        float value1 = 102; // casting from int to float -- no problems
        float value2 = (int)102.0;
        // float value3 = 1f * 0.0; // when multiplying float to double result will be in double.
        // casting from double to float requires explicit cast
        float value4 = 1f * (short)0.0; // 1f is float and 0 is short, the result is given in float type
        // because when making any operation with two values the result will be in greater format
        // float value5 = 1f * (boolean)0; cannot cast int to boolean
    }
}
