
package bus3;


public class Bus3 {
//Menambahkan variabel dan tipe data
public double penumpang;
  public double maxPenumpang;
  public double counter;
  public double penumpangbaru;
  //menggunakan parameter untuk mengubah nilai maxPenumpang
  public Bus3(double maxPenumpang){
    this.maxPenumpang = maxPenumpang;
}
  //Methhod mutator
  public void addpenumpang(double penumpang){
      //Menambahkan variabel temp yang berisi dari variabel penumpang awal ditambah variabel penumpang yang baru
      double temp;
      temp = this.penumpang+penumpang;
      //Jika temp kurang dari maxPenumpang maka program akan bertuliskan "Penumpang melebihi kuota"
      if (temp>maxPenumpang){
          System.out.println("Penumpang melebihi kuota");
      }
      //Jika tidak maka akan menampilkan penumpang
      else{
          this.penumpang=temp;
      }
  }
      //Method mutator
  public void getPenumpang(int password){
      //jika user menuliskan password sama dengan 24 maka program akan menuliskan "Password benar"
      if(password==24){
          System.out.println("Password benar");
      }
      //Jika tidak maka program bertuliskan password salah
      else{
          System.out.println("Password salah");
      }
  }
     //Method yang berfungsi untuk menggoutputkan variabel penumpang dan max penumpang
  public void cetakPenumpang(){
      System.out.println("Penumpang sekarang adalah : "+penumpang);
      System.out.println("Maksimum penumpang yang seharusnya adalah : "+maxPenumpang);
  }
   
    
}
