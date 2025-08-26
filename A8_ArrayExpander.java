public class A8_ArrayExpander {
    private int[] numbers;

    public A8_ArrayExpander() {
        this.numbers = null;
    }

    public void add(int value) {
        if (numbers == null)
        {
            numbers = new int[1];
            numbers[0] = value;
        }
        else
        {
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1] = value;
            numbers = temp;
        }
    }
    public void add(int index, int value) {
        if (numbers == null && index == 0) {
            numbers = new int[1];
            numbers[0] = value;
        } else {
            int[] temp= new int[numbers.length + 1];
            for (int i = 0; i < index; i++) {
                temp[i] = numbers[i];
            }
            temp[index] = value;
            for (int i = index; i < numbers.length; i++) {
                temp[i + 1] = numbers[i];
            }
            numbers = temp;
        }
    }
    public int set(int index, int value) {
        int old = numbers[index];
        numbers[index] = value;
        return old;
    }
    public int remove(int index) {
        int old = numbers[index];
        if (numbers.length == 1) {
            numbers = null;
        } else {
            int[] temp = new int[numbers.length - 1];
            for (int i = 0; i < index; i++) {
                temp[i] = numbers[i];
            }
            for (int i = index + 1; i < numbers.length; i++) {
                temp[i - 1] = numbers[i];
            }
            numbers = temp;
        }
        return old;
    }
    public int get(int index)
    {
        return numbers[index];
    }
    public int size() {
        if (numbers == null)
            return 0;
        else return numbers.length;
    }
    public void clear()
    {
        numbers = null;
    }
    public String toString()
    {
        String s = "[";
        if (numbers != null) {
            s += numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                s += ", " + numbers[i];
            }
        }
        return s + "]";
    }
}
