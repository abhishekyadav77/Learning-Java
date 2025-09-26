package Java_Oops;
class library{
    String[] book;
    int noofbook;

    library(){
    this.noofbook= 0;
        this.book = new String[100];
    }
    void addbook(String book){
        this.book[noofbook] = book;
        noofbook++;
        System.out.println(book+ "has been added");
    }
    void showavailablebooks(){
        System.out.println("Available books are");
        for (String book : this.book){
            if (book == null){
                continue;
            }
                System.out.println("*" +book);
        }

    }
    void issuebook (String book ) {
        for (String b : this.book) {
            for (int i = 0; i < this.book.length; i++) {
                if (this.book[i].equals(book)) {
                    return;
                }

                if (b == book) {
                    System.out.println("The book has been issued");
                    this.book[i] = null;
                    return;
                }

            }
            System.out.println("This Book does not exist");
        }

    } 
}
public class cwh_61_ex_4_solution {
    public static void main(String[] args) {
        library cen = new library();
        cen.addbook("algorithms");
        cen.addbook("C++");
        System.out.println("Think and grow rich");
        cen.showavailablebooks();
        cen.issuebook("C++");
    }
}

