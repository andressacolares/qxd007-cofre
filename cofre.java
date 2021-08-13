public class cofre {
  private int volume;
  private int VolumeMaximo;
  private int VolumeRestante;
  private boolean Broken;
  private String Itens;
  private double Valor;

    public int getvolume (){
        return volume;
    }
    public int getVolumeMaximo (){
        return (VolumeMaximo - VolumeMax);
    }
    public int getVolumeRestante (){
        return VolumeRestante;
    }
    public String getItens (){
        return Itens;
    }
    public Cofre (int VolumeMax){
        this.VolumeMax=VolumeMaximo;

}
    public boolean add (Item item ){
        if ((item.volume<= VolumeRestante) && estado){
            VolumeRestante+=item.volume;
        } else if (item == null ){
            item = item.descrição;
            return true;
        } {
            return false;
        }

    public boolean add (Moeda Moeda){
        if ((moeda.volume <= VolumeRestante) && estado){
            VolumeRestante += moeda.volume;
            return true;
        }{
            return false;
        }   
    }
    public String itenscofre (){
        if ((itens != 0.00) && itens !=estado){
            return itens;
        } else if (estado == 0.00) {
            return null;
            System.out.println("Vazio");
        } {
            return null;
        }
    }
    public double ObMoedas (){
        if (!estado){
            return Valor;
        }
        return -1;
    }
    public boolean Broken(){
        if (estado){
            estado = false;
            return true;
        } { return false;
        }
    }
    public boolean inteiro () {
        return estado;
    }

    } 