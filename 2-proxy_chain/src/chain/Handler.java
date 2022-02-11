package chain;

public interface Handler {
        boolean test(String text);

        default Handler andThen(Handler second) {
            return text -> {
                if (test(text)) {//вызов 1 обработчика, проверяет метод тест
                    return second.test(text);
                }
                return false;
            };
        }
    }
