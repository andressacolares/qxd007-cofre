public class item {
    
    private int volume;
    private String descrição;

    public int getvolume(){
        return volume;
    }
    public  int getdescrição() {
        return descrição;
    }
    public item (String descrição, int volume){
        this.volume = volume;
        this.descrição = descrição;
    }

    @Override
    public String toString (){
        return "Item{" +
        "volume=" + volume +
        ", descrição" + descrição + \'+
        '}';
    }
}
