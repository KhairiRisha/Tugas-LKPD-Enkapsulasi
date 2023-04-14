public class Konversi{
  public double cm;
  private double hasilKm;
  private double hasilDm;
  private double hasilMm;

  public Konversi (double cm) {
    this.cm = cm;
  }
  public void cmKm(){
    hasilKm = cm / 100000.0;
  }
  public void cmDm(){
    hasilDm = cm / 10.0;
  }
  public void cmMm(){
    hasilMm = cm * 10.0;
  }

  public void tampilHasil(){
    System.out.println("Nilai Cm yang di masukan: " + this.cm+"Cm");
    System.out.println("Konversi Cm ke Km adalah: " + hasilKm+"Km");
    System.out.println("Konversi Cm ke Dm adalah: " + hasilDm+"Dm");
    System.out.println("Konversi Cm ke Mm adalah: " + hasilMm+"Mm");
    
  }
  
}