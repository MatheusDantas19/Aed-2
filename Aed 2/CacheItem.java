public class CacheItem {
  private String  destino;
  private int  interfaceSaida;
  
  public CacheItem(String destino, int interfaceSaida) {
    this.destino = destino;
    this.interfaceSaida = interfaceSaida;
  }
  
  public String getDestino() { return destino; }
  public void   setDestino(String destino) { this.destino = destino; }

  public int getInterfaceSaida() { return interfaceSaida; }
  public void   setInterfaceSaida(int interfaceSaida) { this.interfaceSaida = interfaceSaida; }

}
