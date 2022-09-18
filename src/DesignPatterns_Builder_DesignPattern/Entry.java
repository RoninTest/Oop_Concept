package DesignPatterns_Builder_DesignPattern;

//Birden Fazla Constructor kullanımı gerekli olan yazılımlarda nesne yratma işleminin hatasız ve sade olması.
//Getter Setter yerine sadece değer atamak istediğimiz değişkenlere değer atayan bir Constructor kullanmak gerekecektir.
//Böylece bir sınıftan birden fazla Constroctor grmek mümkün hale gelecektir.

class Book {

    private int id;
    private int pagenumber;
    private int edition;

    private String name;
    private String authorName;

    private double price;
    private double rate;

    private boolean defaultBookMarker;
    private boolean eBookVersion;


    public void setId(int id) {
        this.id=id;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber=pagenumber;
    }

    public void setEdition(int edition){
        this.edition=edition;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAutohorName(String authorName){
        this.authorName=authorName;
    }

    public void setPrice(double price) {

        this.price=price;
    }

    public void setDefaultBookMarker(boolean defaultBookMarker) {
        this.defaultBookMarker=defaultBookMarker;
    }

    public void seteBookVersion(boolean eBookVersion) {
        this.eBookVersion=eBookVersion;
    }
}

class BookBuilder{
    private int id;
    private int pagenumber;
    private int edition;

    private String name;
    private String authorName;

    private double price;
    private double rate;

    private boolean defaultBookMarker;
    private boolean eBookVersion;

  public static BookBuilder startBuild(int id,int pagenumber,String name){

      BookBuilder bookBuilder=new BookBuilder();

      bookBuilder.id=id;
      bookBuilder.pagenumber=pagenumber;
      bookBuilder.name=name;

      return bookBuilder;
  }

  public static BookBuilder buildBookWithEBookVersion(int id, int pagenumber,String name,boolean eBookVersion){
      BookBuilder bookBuilder=new BookBuilder();
      bookBuilder.id=id;
      bookBuilder.pagenumber=pagenumber;
      bookBuilder.name=name;
      bookBuilder.eBookVersion=eBookVersion;

      return bookBuilder;
  }

  public BookBuilder setDefaultBookMarker(boolean defaultBookMarker) //like Setter
  {
        this.defaultBookMarker=defaultBookMarker;
        return this;
  }
  public BookBuilder setBookVersion(boolean eBookVersion){
      this.eBookVersion=eBookVersion;
      return this;
  }

  public Book build(){
      Book book=new Book();

      book.setId(id);
      book.setPagenumber(pagenumber);
      book.setEdition(edition);

      book.setName(name);
      book.setAutohorName(authorName);

      book.setPagenumber(pagenumber);
      book.setPrice(price);

      book.setDefaultBookMarker(defaultBookMarker);
      book.seteBookVersion(eBookVersion);
      System.out.println("id : " +" "+ id + " pagenumber : " + pagenumber + " " + " name : " + name + " " + " eBookVersion = " + eBookVersion);

      return book;

  }


}

public class Entry {
    public static void main(String[] args) {

    //Default özelliklere sahip kitap;
        Book book1=BookBuilder.startBuild(1,432,"Mobidick").build();

        //Default özellikler + ebook özelliğne sahip kitap;
        Book book2=BookBuilder.buildBookWithEBookVersion(2,172,"Mobidick",true).build();

        //Default özellikler + book marker özelliğne sahip kitap
        Book book3=BookBuilder.startBuild(3,140,"Metamorphosis").build();

        //Kitap özelliklerini görüntüleme;
        System.out.println(book1.toString()+"\n");
        System.out.println(book2.toString()+"\n");
        System.out.println(book3.toString());

    }
}
