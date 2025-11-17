public class Map {

    private String[] keys = new String[10];
    private String[] values = new String[10];
    private int size = 0;

    public String get(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    public void put(String key, String item) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                values[i] = item;
                return;
            }
        }
        keys[size] = key;
        values[size] = item;
        size++;
    }
}
