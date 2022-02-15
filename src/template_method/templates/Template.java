package template_method.templates;

public abstract class Template {
    public final void methods() {//реализует методы
        enterFileName();
        chooseRewriteOrAdd();
        addDataTime();
        writeFile();
    }

    protected abstract void enterFileName();
    protected abstract void chooseRewriteOrAdd();
    protected abstract void addDataTime();
    protected abstract void writeFile();
}
