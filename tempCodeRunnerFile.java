package odev;

import java.util.Scanner;
import java.util.ArrayList;


//musteri1.setKartNumarasi(musteri1.getKartNumarasi()); //kart numarası random üretildi
//musteri1.setIban(musteri1.getIban()); //iban random üretildi
//Kredi kredi1 = new Kredi(musteri1.setKrediID(sayiüret()),musteri1.getMusteriNumarasi(),musteri1.getKrediMiktari(),musteri1.yıllıkKazanc());

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
	Kisi personel1 = new BankaPersonel(sayiüret(),"ahmet","yılmaz","ahmetyılmaz@gmail.com",370285238);
	Musteri musteri1=new Musteri(sayiüret(),sayiüret(), "eyüphan", "kütahya", "eyuphannkutahya@gmail.com",554733284);
	musteriList.add(musteri1);
	int i,j;
while(true){
	
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
			  		System.out.println("İsminizi giriniz.");
	          String ad = menuScanner.nextLine();
	          System.out.println("Soyadınızı giriniz.");
	          String soyad = menuScanner.nextLine();
	          System.out.println("E-mail adresiniz giriniz.");
	          String email = menuScanner.nextLine();
	          System.out.println("Telefon numaranız giriniz.(5xxxxxxxxx)");
	          int telefon = menuScanner.nextInt();
	          Kisi musteri2 = new Musteri(sayiüret(),sayiüret(),ad,soyad,email,telefon);
	          musteriList.add(musteri2);
	         System.out.println( musteri2.toString());
	           break;
 case 2: 
	 System.out.println("Hesap eklemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
             int tcKimlikNo09 = menuScanner.nextInt();
            Scanner input = new Scanner(System.in);
            for(i=0;i<musteriList.size();i++){
              if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo09){

               System.out.println("Yeni açılan hesap türü : MaasHesap mı NormalHesap mı?");
                String hesapTuru = input.nextLine();
                if(hesapTuru.equals("MaasHesap")){
                  System.out.println("isminizi giriniz.");
                  String ad1 = menuScanner.nextLine();
                  System.out.println("Soyadınızı giriniz.");
                  String soyad1 = menuScanner.nextLine();
                  hesapEkle(tcKimlikNo09,sayiüret(),ad1,soyad1);
                  HesapList.add(new MaasHesap(sayiüret(),musteri1.setMusteriNumarasi(sayiüret()),ad1,soyad1));
                  
                }else if(hesapTuru.equals("NormalHesap")){
                  System.out.println("isminizi giriniz.");
                  String ad2 = menuScanner.nextLine();
                  System.out.println("Soyadınızı giriniz.");
                  String soyad2 = menuScanner.nextLine();
                  hesapEkle(tcKimlikNo09,sayiüret(),ad2,soyad2);
                  System.out.println("Hesap eklendi.");
                   HesapList.add(new NormalHesap(sayiüret(),musteri1.setMusteriNumarasi(sayiüret()),ad2,soyad2));
                 }
                System.out.println("Kayıtlı Müşteri Bulunamadı.");}
                else  System.out.println("Hatalı giriş yaptınız.");}
                  break;   

	      case 3: System.out.println("Hesap silmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
              int tcKimlikNo08 = menuScanner.nextInt();
              if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo08){
                  System.out.println("Silmek istediğiniz hesabın IBAN numarasını giriniz.");
                  int iban = menuScanner.nextInt();
                  for(int j1=0;j1<HesapList.size();j1++){
                    if(HesapList.get(j1).getIban()==iban){
                      HesapList.remove(j1);
                      System.out.println("Hesap silindi.");
                    }
                  }
                }
              
        case 4: System.out.println("Kredi çekmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                int tcKimlikNo07 = menuScanner.nextInt();
                if(musteriList.get(i).getTcKimlikNo()==tcKimlikNo07){
                    System.out.println("Kredi çekmek istediğiniz hesabın IBAN numarasını giriniz.");
                    int iban = menuScanner.nextInt();
                    for(int 2=0;2<HesapList.size();2++){
                      if(HesapList.get(2).getIban()==iban){
                        System.out.println("Kredi çekmek istediğiniz tutarı giriniz.");
                        int krediTutari = menuScanner.nextInt();
                       ((Object) HesapList.get(2))).Kredi(sayiüret(),(musteriList.get(i).getMusteriNumarasi(),krediTutari);
                      }
                    }	
                  }
                
          case 5: System.out.println("Kredi borcu ödemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                  int tcKimlikNo06 = menuScanner.nextInt();
                  for(int i1=0;i1<musteriList.size();i1++){
                    if(musteriList.get(i1).getTcKimlikNo()==tcKimlikNo06){
                      System.out.println("Kredi borcu ödemek istediğiniz hesabın IBAN numarasını giriniz.");
                      int iban = menuScanner.nextInt();
                      for(int j3=0;j3<HesapList.size();j3++){
                        if(HesapList.get(j3).getIban()==iban){
                          System.out.println("Kredi borcu ödemek istediğiniz tutarı giriniz.");
                          int krediTutari = menuScanner.nextInt();
                          HesapList.get(j3).krediBorcuOde(krediTutari);
                        }
                      }
                    }
                  }
            case 6: System.out.println("Kredi kartı eklemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                    int tcKimlikNo05 = menuScanner.nextInt();
                    for(int i4=0;i4<musteriList.size();i4++){
                      if(musteriList.get(i4).getTcKimlikNo()==tcKimlikNo05){
                        System.out.println("Kredi kartı eklemek istediğiniz hesabın IBAN numarasını giriniz.");
                        int iban = menuScanner.nextInt();
                        for(int j4=0;j4<HesapList.size();j4++){
                          if(HesapList.get(j4).getIban()==iban){
                            System.out.println("Kredi kartı eklemek istediğiniz tutarı giriniz.");
                            musteri.setLimit() = menuScanner.nextInt();
                            HesapList.get(j4).musteri1.krediKartiEkle(musteri1.getKartNumarasi(),musteri1.getLimit());  
                          }
                        }
                      }
                    }
              case 7: System.out.println("Kredi kartı borcu ödemek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                      int tcKimlikNo04= menuScanner.nextInt();
                      for(int i1=5;i1<musteriList.size();i1++){
                        if(musteriList.get(i1).getTcKimlikNo()==tcKimlikNo04){
                          System.out.println("Kredi kartı borcu ödemek istediğiniz hesabın IBAN numarasını giriniz.");
                          int iban = menuScanner.nextInt();
                          for(int j5=0;j5<HesapList.size();j5++){
                            if(HesapList.get(j5).getIban()==iban){
                              System.out.println("Kredi kartı borcu ödemek istediğiniz tutarı giriniz.");
                              int krediKartiTutari = menuScanner.nextInt();
                              HesapList.get(j5).krediKartiBorcuOde(krediKartiTutari);
                            }
                          }
                        }
                      }
                case 8: System.out.println("Hesap bilgilerini görmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                        int tcKimlikNo03 = menuScanner.nextInt();
                        for(int i6=0;i6<musteriList.size();i6++){
                          if(musteriList.get(i6).getTcKimlikNo()==tcKimlikNo03){
                            System.out.println("Hesap bilgilerini görmek istediğiniz hesabın IBAN numarasını giriniz.");
                            int iban = menuScanner.nextInt();
                            for(int j6=0;j6<HesapList.size();j6++){
                              if(HesapList.get(j6).getIban()==iban){
                                HesapList.get(j6).hesapBilgileriGoster();
                              }
                            }
                          }
                        }
                case 9:System.out.println("Yatırım hesabına para yatırmak istediğiniz müşterinin TC kimlik numarasını giriniz.");
                        int tcKimlikNo01= menuScanner.nextInt();
                        for(int i7=0;i7<musteriList.size();i7++){
                          if(musteriList.get(i7).getTcKimlikNo()==tcKimlikNo01){
                            System.out.println("Yatırım hesabına para yatırmak istediğiniz hesabın IBAN numarasını giriniz.");
                            int iban = menuScanner.nextInt();
                            for(int j7=0;j7<HesapList.size();j7++){
                              if(HesapList.get(j7).getIban()==iban){
                                System.out.println("Yatırım türünü giriniz.");
                                System.out.println("1- Euro");
                                System.out.println("2- Dolar");
                                System.out.println("3- Altın");
                                String yatirimTuru = menuScanner.next();                                                      
                                System.out.println("Yatırım hesabına yatırmak istediğiniz tutarı giriniz.");
                                int yatirimTutari = menuScanner.nextInt();
                                System.out.println("Güncel kur bilgisini giriniz.");
                                float kur = menuScanner.nextFloat();
                                HesapList.get(j7).paraEkle(yatirimTutari,yatirimTuru,kur);
                              }
                            }
                          }
                        }
                case 10:System.out.println("Yatırım hesabından para çekmek istediğiniz müşterinin TC kimlik numarasını giriniz.");
                        int tcKimlikNo0 = menuScanner.nextInt();
                        for(int i8=0;i8<musteriList.size();i8++){
                          if(musteriList.get(i8).getTcKimlikNo()==tcKimlikNo0){
                            System.out.println("Yatırım hesabından para çekmek istediğiniz hesabın IBAN numarasını giriniz.");
                            int iban = menuScanner.nextInt();
                            for(int j8=0;j8<HesapList.size();j8++){
                              if(HesapList.get(j8).getIban()==iban){
                                System.out.println("Yatırım türünü giriniz.");
                                System.out.println("1- Euro");
                                System.out.println("2- Dolar");
                                System.out.println("3- Altın");
                                String yatirimTuru = menuScanner.next();
                                System.out.println("Yatırım hesabından çekmek istediğiniz tutarı giriniz.");
                                int yatirimTutari = menuScanner.nextInt();
                                System.out.println("Güncel kur bilgisini giriniz.");
                                float kur = menuScanner.nextFloat();
                                HesapList.get(j8).yatirimHesabindanParaCek(yatirimTutari,yatirimTuru,kur);
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

private static void hesapEkle(int tcKimlikNo09, int sayiüret, String ad1, String soyad1) {
	// TODO Auto-generated method stub
	
}
}



//● PersonelID, tcKimlikNo, musteriNumarasi, kartNumarasi, iban gibi değerleri random 
//number generator kullanarak otomatik olarak türetiniz. Bunların aynı olmaması için 
//kontrolünü yapınız.hme
//● BankaHesap açılış tarihi 1 Ocak’tan sonra açılan tüm hesapların toplamBakiye’lerini 
//ekrana yazdırın.
//● KrediKarti limiti 5000 TL altında olanların guncelBorc bilgisini yazdırın.
//● KrediKarti limiti 10000 TL üstündeyse kredi teklifi yapsın.
//● musteriNumarasi kullanıcıdan alınan bir kişinin bütün hesap bilgilerini ekrana 
//yazdırınız.

