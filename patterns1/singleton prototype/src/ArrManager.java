

import java.util.Arrays;

public class ArrManager<T> implements Prototype<ArrManager> {
        private T[] data;

        public ArrManager(T[] data) {
                this.data = data;
        }

        public ArrManager() {
        }

        @Override
        public ArrManager copy() throws CloneNotSupportedException {
                return new ArrManager<>(data);
        }

        @Override
        public String toString() {
                return "ArrManager{" +
                        "data=" + Arrays.toString(data) +
                        '}';
        }
}
