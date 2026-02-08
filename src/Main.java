import java.util.Scanner;

class Library{
   String[] availableBook=new String[10];
 int count=0;
   void addBook(String bookName){
       if (count<availableBook.length){
           availableBook[count]=bookName;
           count++;
           System.out.println("Book Add successFully:");
       }
       else {
           System.out.println("Library Full");
       }
   }
   void showAvailableBook(){
       System.out.println("Avaliable Book");
       for (int i=0;i<count;i++){
           if (availableBook[i]!=null){
               System.out.println("- "+availableBook[i]);
           }
       }
   }
   void issueBook(String bookName){
       for (int i=0;i<count;i++){
           if (availableBook[i]!=null && availableBook[i].equals(bookName))
           {
               System.out.println(bookName + " Book successFully");
               availableBook[i]=null;
               return;
           }
       }
       System.out.println("Book is not Available");
   }
    void returnBook(String bookName) {
        addBook(bookName);
        System.out.println(bookName + " returned successfully");
    }
}
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("C++");
        lib.addBook("Python");

        lib.showAvailableBook();

        lib.issueBook("Java");
        lib.showAvailableBook();

        lib.returnBook("Java");
        lib.showAvailableBook();
    }
}