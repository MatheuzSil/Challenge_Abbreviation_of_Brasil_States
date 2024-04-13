import javax.swing.text.LabelView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do estado: ");
            String state = sc.nextLine().toUpperCase();

            List <String> list = List.of(state.split(" "));
            String result = "";
            if (list.size() == 2 && state.length() == 11){
                result = "MT";
            } else if (list.size() == 2){
                result = list.get(0).substring(0,1).concat(list.get(1).substring(0,1));;
            } else if (list.size() == 3) {
                result = list.get(0).substring(0,1).concat(list.get(2).substring(0,1));
            } else if (list.size() == 4) {
                result = list.get(0).substring(0,1).concat(list.get(3).substring(0,1));;
            } else if (list.size() == 1 && state.equals("AMAPÁ") || state.equals("AMAPA")) {
                result ="AP";
            } else if (list.size() == 1 && state.equals("RORAIMA")) {
                result = "RR";
            } else if (list.size() == 1 && state.equals("PARAÍBA") || state.equals("PARAIBA")) {
                result = "PB";
            } else if (list.size() == 1 && state.equals("PARANÁ") || state.equals("PARANA")) {
                result = "PR";
            } else if (list.size() == 1) {
                result = list.get(0).substring(0,2);
            }
            System.out.println(result.toUpperCase());



            sc.close();


            }
}