public class ProgrammingBook {
    private String bookCode;
    private String name;
    private double price;
    private int number;
    private String author;
    private String language;
    private String framwork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String bookCode, String name, int price, int number, String author, String language, String framwork) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.number = number;
        this.author = author;
        this.language = language;
        this.framwork = framwork;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramwork() {
        return framwork;
    }

    public void setFramwork(String framwork) {
        this.framwork = framwork;
    }
    public double getAmount (){
        return this.number * this.price;

    }

}
