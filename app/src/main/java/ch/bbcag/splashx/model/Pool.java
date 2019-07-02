package ch.bbcag.splashx.model;

abstract public class Pool {

    private int temperature;
    private String name;

    public Pool(int temperature, String name) {
        this.temperature = temperature;
        this.name = name;
    }

    public String showPool() {
        return name + "     " + temperature + "°C\n";
    }

    abstract public void addEmoji();
}
