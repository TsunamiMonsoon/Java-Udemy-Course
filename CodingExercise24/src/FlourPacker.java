public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int sum = bigCount * 5 + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0 || sum < 0) {
            return false;
        }
        return (sum >= goal) && (smallCount >= goal % 5);
    }
}
