package Generic;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Float> floatNumberData = new NumberData<>(1.0f);
        NumberData<Integer> shortNumberData = new NumberData<>(100);
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}