public class CacheMain {
  public static void main(String [] args){
    CacheRotas c = new CacheRotas(10);
    c.insere("192.168.200.5",3);
    c.busca("192.168.200.5");
    c.remove("192.168.200.5");
    c.imprime();
  }
}
