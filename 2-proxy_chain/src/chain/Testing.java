package chain;

public class Testing implements Handler{

    private String text;

    public Testing(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
        public boolean test(String text) {
            if (!(getText() == null));
            return true;
        }


    String invoke(String text) throws TextValidExeption{
        if (text.equals("0")) {
            throw new TextValidExeption("text is vot valid");
            } else return text;
        }
    }
