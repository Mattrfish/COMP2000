public class Book {
private String Author;
private String Title;
private String Year;

public String getAuthor(){
    return Author;
}
public void setAuthor(String au){
    Author = au;
}
public String getTitle(){
    return Title;
}
public void setTitle(String ti){
    Title = ti;
}

public String getYear(){
        return Year;
}
public void setYear(String yr){
        Year = yr;
}

public static void details(){
    Book book1 = new Book();

    book1.setAuthor("Roald Dahl");
    book1.setTitle("Fantastic Mr Fox");
    book1.setYear("2010");

    String b= book1.getAuthor();
    String c= book1.getTitle();
    String d= book1.getYear();

    System.out.println((b) + "\n" + (c) + "\n"+ (d));
}


}
