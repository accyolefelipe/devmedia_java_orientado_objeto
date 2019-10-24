package aula9;

public enum TrueOrFalse {
    FALSE(0,"FALSE"), TRUE(1, "TRUE");

    private int index;
    private String desc;

    private TrueOrFalse(int index, String desc){
        this.index = index;
        this.desc = desc;
    }

    public int getIndex(){
        return index;
    }
    public String getDesc(){
        return desc;
    }

}
