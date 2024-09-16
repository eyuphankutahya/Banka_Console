
import java.util.Scanner;
import java.util.ArrayList;package bank;

public class Main {
	static ArrayList<Musteri> musteriList = new ArrayList<>();
	static ArrayList<BankaHesap>HesapList;
	static ArrayList <KrediKarti> krediKartiListesi = new ArrayList<KrediKarti>();
	public static int sayiüret(){
	  long min = 10000000000L; // En küçük 11 haneli sayı
	  long max = 99999999999L; // En büyük 11 haneli sayı
	  long randomNum = min + (long)(Math.random() * (max - min + 1)); // Random sayı üretme
	  System.out.println(randomNum); // Oluşturulan random sayıyı yazdırma
	  return (int) randomNum;  }
	  
	  public int kontrol(int a,int b){
	    while(a==b){//aynıysa tekrar üret
	        b=sayiüret();}
	    return b;}

public static void main(String []args){
  System.out.println("Bankamıza hoşgeldiniz.");
  

  //Her yeni müşteri için vadesiz ve düz hesap açılsın.

//● PersonelID, tcKimlikNo, musteriNumarasi, kartNumarasi, iban gibi değerleri random
//number generator kullanarak otomatik olarak türetiniz. Bunların aynı olmaması için
//menü oluşturuldu
	Kisi personel1 = new BankaPersonel(sayiüret(),"ahmet","yılmaz","ahmetyılmaz@gmail.com",370285238);
	Musteri musteri=new Musteri(sayiüret, "eyüphan", "kütahya", "eyuphannkutahya@gmail.com", 5554733284);
	musteriList.add(musteri);

while(true){
	int i,j;
   //BankaHesap vadesiz=new VadesizHesap();
  
// System.out.println("Yeni açılan hesap türü : MaasHesap mı NormalHesap mı?");
// Scanner input = new Scanner(System.in);
// String hesapTuru = input.nextLine();
// if(hesapTuru.equals("MaasHesap")){
//   MaasHesap maasHesap1 = new BankaHesap(musteri1.setIban(),musteri1.getToplamBakiye(),musteri1.getHesapBilgisi());
//   musteri.setHesapBilgisi(maasHesap1);
// }
// else if(hesapTuru.equals("NormalHesap")){
//   NormalHesap normalHesap1 = new NormalHesap(musteri1.setIban(),musteri1.getToplamBakiye(),musteri1.getHesapBilgisi());
//   musteri.setHesapBilgisi(normalHesap1);
// }
// else{
//   System.out.println("Hatalı giriş yaptınız.");
// }



	 Scanner menuScanner = new Scanner(System.in);
	 System.out.println("Hoşgeldiniz. Lütfen yapmak istediğiniz işlemi seçiniz.");
	 System.out.println("1- Yeni hesap açmak için 1'e basınız.");
	 System.out.println("2- Hesap eklemek için 2'ye basınız.");
	 System.out.println("3- Hesap silmek için 3'e basınız.");
	 System.out.println("4- Kredi çekmek için 4'e basınız.");
	 System.out.println("5- kredi borcu için 5'e basınız.");
	 System.out.println("6- kredi kartı eklemek 6'ya basınız.");
	 System.out.println("7- kredi kartı borc ödeme 7'ye basınız.");
	 System.out.println("8- Hesap bilgilerini görmek için 8'e basınız.");
	 System.out.println("9- Yatırım hesabına para eklemek için 9'a basınız.");
	 System.out.println("10- Yatırım hesabından para çekmek için 10'a basınız.");
	 System.out.println("11- Çıkış yapmak için 11'e basınız.");
	 int menu = menuScanner.nextInt();
	 
	 switch(menu){
	  case 1: 
		  for(i=0;i<musteriList.size();i++){
		  		System.out.println("İsminizi giriniz.");
	          String ad = menuScanner.nextLine();
	          System.out.println("Soyadınızı giriniz.");
	          String soyad = menuScanner.nextLine();
	          System.out.println("E-mail adresiniz giriniz.");
	          String email = menuScanner.nextLine();
	          System.out.println("Telefon numaranız giriniz.(5xxxxxxxxx)");
	          int telefon = menuScanner.nextInt();
	     
	          Kisi musteri(i) = new Musteri(sayiüret(),sayiüret(),ad,soyad,email,telefon);
	          musteriList.add((Musteri) musteri(i));
	          musteri(i).toString();
	          }
	          default : System.out.println("hata");
	 }

// musteri1.setKartNumarasi(musteri1.getKartNumarasi()); //kart numarası random üretildi
// musteri1.setIban(musteri1.getIban()); //iban random üretildi
// Kredi kredi1 = new Kredi(musteri1.setKrediID(sayiüret()),musteri1.getMusteriNumarasi(),musteri1.getKrediMiktari(),musteri1.yıllıkKazanc());


 case 2: System.out.println("Hesap eklemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
            int tcKimlikNo09 = menuScanner.nextInt();
            for(int i=0;i<musteriList.size();i++){
              if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo09){
                System.out.println("Yeni açılan hesap türü : MaasHesap mı NormalHesap mı?");
                Scanner input = new Scanner(System.in);
                String hesapTuru = input.nextLine();
                if(hesapTuru.equals("MaasHesap")){
                  System.out.println("Aylık gelirinizi giriniz.");
                  int aylıkGelir = input.nextInt();
                  // if(hesapTuru.equals("Vadeli hesap")) {
                  //   System.out.println("Vadeli Maas Hesabiniz olusturulmustur!");
                  //   vadeli.setVadeliBakiye(maasgelir);
                  //   this.iban=randomiban();
                  // }
                  // if(hesapTuru.equals("Vadesiz hesap")) {
                  //   System.out.println("Vadesiz Maas Hesabiniz olusturulmustur!");
                  //   vadesiz.setVadesizBakiye(maasgelir);
                  //   this.iban=randomiban();
                  // }
                  MaasHesap maasHesap1 = new BankaHesap(musteri1.setIban(),((BankaHesap) musteri1).getToplamBakiye(),musteri1.getHesapBilgisi());
                  musteri1.setHesapBilgisi(maasHesap1);
                  HesapList.add(maasHesap1);   
                  ((Musteri) musteri1).hesapEkle(musteri1.getTcKimlikNo(),((Musteri) musteri1).getMusteriNumarasi(),musteri1.getAd(),musteri1.getSoyad());
                  ((KrediKarti) musteri1).setKartNumarasi(((KrediKarti) musteri1).getKartNumarasi()); //kart numarası random üretildi        
                }
                else if(hesapTuru.equals("NormalHesap")){
                  this.hesapBilgisi="Normal Hesap";
			// System.out.println("Rutin para akisini giriniz: ");
			// int gelir=scan.nextInt();
			// if(hesapTuru.equals("Vadeli hesap")) {
			// 	System.out.println("Vadeli Normal Hesabiniz olusturulmustur!");
			// 	vadeli.setVadeliBakiye(gelir);
			// 	this.iban=randomiban();
			// }
			// if(hesapTuru.equals("Vadesiz hesap")) {
			// 	System.out.println("Vadesiz Normal Hesabiniz olusturulmustur!");
			// 	vadesiz.setVadesizBakiye(gelir);
			// 	this.iban=randomiban();
			// }

                  NormalHesap normalHesap1 = new NormalHesap(musteri1.setIban(),musteri1.getToplamBakiye(),musteri1.getHesapBilgisi());
                  musteri1.setHesapBilgisi(normalHesap1);
                  HesapList.add(normalHesap1);
                  ((Musteri) musteri1).hesapEkle(musteri1.getTcKimlikNo(),((Musteri) musteri1).getMusteriNumarasi(),musteri1.getAd(),musteri1.getSoyad());
                  ((KrediKarti) musteri1).setKartNumarasi(((KrediKarti) musteri1).getKartNumarasi()); //kart numarası random üretildi
                }
                else{
                  System.out.println("Hatalı giriş yaptınız.");
                }
              }
            }
      case 3: System.out.println("Hesap silmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
              int tcKimlikNo08 = menuScanner.nextInt();
              for(int i=0;i<musteriList.size();i++){
                if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo08){
                  System.out.println("Silmek istediğiniz hesabın IBAN numarasını giriniz.");
                  int iban = menuScanner.nextInt();
                  for(int j=0;j<HesapList.size();j++){
                    if(HesapList.get(j).getIban()==iban){
                      HesapList.remove(j);
                    }
                  }
                }
              }
        case 4: System.out.println("Kredi çekmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                int tcKimlikNo07 = menuScanner.nextInt();
                for(int i=0;i<musteriList.size();i++){
                  if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo07){
                    System.out.println("Kredi çekmek istediğiniz hesabın IBAN numarasını giriniz.");
                    int iban = menuScanner.nextInt();
                    for(int j=0;j<HesapList.size();j++){
                      if(HesapList.get(j).getIban()==iban){
                        System.out.println("Kredi çekmek istediğiniz tutarı giriniz.");
                        int krediTutari = menuScanner.nextInt();
                       ((Object) HesapList.get(j))).Kredi(sayiüret(),(musteriList.get(i).getMusteriNumarasi(),krediTutari);
                      }
                    }	
                  }
                }
          case 5: System.out.println("Kredi borcu ödemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                  int tcKimlikNo06 = menuScanner.nextInt();
                  for(int i=0;i<musteriList.size();i++){
                    if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo06){
                      System.out.println("Kredi borcu ödemek istediğiniz hesabın IBAN numarasını giriniz.");
                      int iban = menuScanner.nextInt();
                      for(int j=0;j<HesapList.size();j++){
                        if(HesapList.get(j).getIban()==iban){
                          System.out.println("Kredi borcu ödemek istediğiniz tutarı giriniz.");
                          int krediTutari = menuScanner.nextInt();
                          HesapList.get(j).krediBorcuOde(krediTutari);
                        }
                      }
                    }
                  }
            case 6: System.out.println("Kredi kartı eklemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                    int tcKimlikNo05 = menuScanner.nextInt();
                    for(int i=0;i<musteriList.size();i++){
                      if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo05){
                        System.out.println("Kredi kartı eklemek istediğiniz hesabın IBAN numarasını giriniz.");
                        int iban = menuScanner.nextInt();
                        for(int j=0;j<HesapList.size();j++){
                          if(HesapList.get(j).getIban()==iban){
                            System.out.println("Kredi kartı eklemek istediğiniz tutarı giriniz.");
                            musteri.setLimit() = menuScanner.nextInt();
                            HesapList.get(j).musteri1.krediKartiEkle(musteri1.getKartNumarasi(),musteri1.getLimit());  
                          }
                        }
                      }
                    }
              case 7: System.out.println("Kredi kartı borcu ödemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                      int tcKimlikNo04= menuScanner.nextInt();
                      for(int i=0;i<musteriList.size();i++){
                        if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo04){
                          System.out.println("Kredi kartı borcu ödemek istediğiniz hesabın IBAN numarasını giriniz.");
                          int iban = menuScanner.nextInt();
                          for(int j=0;j<HesapList.size();j++){
                            if(HesapList.get(j).getIban()==iban){
                              System.out.println("Kredi kartı borcu ödemek istediğiniz tutarı giriniz.");
                              int krediKartiTutari = menuScanner.nextInt();
                              HesapList.get(j).krediKartiBorcuOde(krediKartiTutari);
                            }
                          }
                        }
                      }
                case 8: System.out.println("Hesap bilgilerini görmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                        int tcKimlikNo03 = menuScanner.nextInt();
                        for(int i=0;i<musteriList.size();i++){
                          if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo03){
                            System.out.println("Hesap bilgilerini görmek istediğiniz hesabın IBAN numarasını giriniz.");
                            int iban = menuScanner.nextInt();
                            for(int j=0;j<HesapList.size();j++){
                              if(HesapList.get(j).getIban()==iban){
                                HesapList.get(j).hesapBilgileriGoster();
                              }
                            }
                          }
                        }
                case 9:System.out.println("Yatırım hesabına para yatırmak istediğiniz müşterinin TC kimlik numarasını giriniz.");
                        int tcKimlikNo01= menuScanner.nextInt();
                        for(int i=0;i<musteriList.size();i++){
                          if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo01){
                            System.out.println("Yatırım hesabına para yatırmak istediğiniz hesabın IBAN numarasını giriniz.");
                            int iban = menuScanner.nextInt();
                            for(int j=0;j<HesapList.size();j++){
                              if(HesapList.get(j).getIban()==iban){
                                System.out.println("Yatırım türünü giriniz.");
                                System.out.println("1- Euro");
                                System.out.println("2- Dolar");
                                System.out.println("3- Altın");
                                String yatirimTuru = menuScanner.next();                                                      
                                System.out.println("Yatırım hesabına yatırmak istediğiniz tutarı giriniz.");
                                int yatirimTutari = menuScanner.nextInt();
                                System.out.println("Güncel kur bilgisini giriniz.");
                                float kur = menuScanner.nextFloat();
                                HesapList.get(j).paraEkle(yatirimTutari,yatirimTuru,kur);
                              }
                            }
                          }
                        }
                case 10:System.out.println("Yatırım hesabından para çekmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                        int tcKimlikNo0 = menuScanner.nextInt();
                        for(int i=0;i<musteriList.size();i++){
                          if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo0){
                            System.out.println("Yatırım hesabından para çekmek istediğiniz hesabın IBAN numarasını giriniz.");
                            int iban = menuScanner.nextInt();
                            for(int j=0;j<HesapList.size();j++){
                              if(HesapList.get(j).getIban()==iban){
                                System.out.println("Yatırım türünü giriniz.");
                                System.out.println("1- Euro");
                                System.out.println("2- Dolar");
                                System.out.println("3- Altın");
                                String yatirimTuru = menuScanner.next();
                                System.out.println("Yatırım hesabından çekmek istediğiniz tutarı giriniz.");
                                int yatirimTutari = menuScanner.nextInt();
                                System.out.println("Güncel kur bilgisini giriniz.");
                                float kur = menuScanner.nextFloat();
                                HesapList.get(j).yatirimHesabindanParaCek(yatirimTutari,yatirimTuru,kur);
                              }
                            }
                          }
                        }

                        //para çekme ve yatırma işlemleri
                 case 11: System.out.println("Cikis yapiliyor...");
                          System.out.println("İyi günler dileriz.");  
                          System.exit(0);
                          break;
                  default: System.out.println("Yanlış bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                          break;
            }
        }
    }
