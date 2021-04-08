import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập số tiền của bạn: ");
        double money = scanner.nextDouble();
        int count = 0;
        double totalmoney = 0;
        ProgrammingBook list [] = new ProgrammingBook[10];
        list[0] = new ProgrammingBook("d1" ,"java",2500,3,"abc","java","code");
        list[1] = new ProgrammingBook("ư12" ,"python",2100,4,"abcq","English","code1");
        list[2] = new ProgrammingBook("d11","c++",5000,3,"abce","English","code2");
        list[3] = new ProgrammingBook("a15" ,"Toán",3000,1,"abdfc","English","code3");
        list[4] = new ProgrammingBook("f13" ,"javaScript",2000,3,"absvc","English","code4");
        list[5] = new ProgrammingBook("16g" ,"php",1000,6,"abbcg","ý","code5");
        list[6] = new ProgrammingBook("12s" ,"lý",20000,8,"abcc","English","code6");
        list[7] = new ProgrammingBook("17a","Hoá",21000,3,"abcn","chiness","code7");
        list[8] = new ProgrammingBook("a13" ,"java1",22000,8,"abnc","thường tín","code8");
        list[9] = new ProgrammingBook("f17" ,"java2",26000,9,"abac","English","code9");
        for ( int i = 0; i < list.length; i++ ){
            totalmoney += list[i].getAmount();
            if ( list[i].getLanguage().equalsIgnoreCase("java")){
                count++;
            }
            if (list[i].getPrice() < money){
                System.out.println(list[i].getName());
            }
        }
        System.out.println("tổng số tiền 10 đầu sách là: "+ totalmoney);
        System.out.println(" số cuốn sách được viết bằng ngôn ngữ java là :"+count);

    }
}
