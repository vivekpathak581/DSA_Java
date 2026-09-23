package basics_java.control_flow;
public class Table_Twenty {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 20; j++) {
                int table=i*j;
                System.out.print(j+" * "+i+" = "+table+"    ");
                //System.out.print(table+"   ");
                //System.out.print(" ");
            }
            System.out.println();
        }
    }
}
