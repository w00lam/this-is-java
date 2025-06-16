package ch13.quiz.Q4;

public class Util {
    public static <K, V> V getValue(Pair<K, V> pair, String key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
