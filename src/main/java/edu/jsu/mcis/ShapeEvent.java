package edu.jsu.mcis;

public class ShapeEvent {
    private boolean hexagonSelect;
    private boolean octagonSelect; 

    public ShapeEvent() {
        this(false, false);
    }
    public ShapeEvent(boolean hexagonSelect, boolean octagonSelect) {
        this.hexagonSelect = hexagonSelect;
        this.octagonSelect = octagonSelect;
    }
    public boolean isHexagonSelected() { return hexagonSelect; }
    public boolean isOctagonSelected() { return octagonSelect; }
}