import java.io.*;

public class Main {
    public static void main(String[] args) {

   String file="src\\students.csv";
   BufferedReader reader=null;
   String line="";//be used to read each line of the text

        try{
            reader =new BufferedReader(new FileReader(file));
            while((line=reader.readLine()) != null){

                String[] row  = line.split(",");
                for(String index:row){
                    System.out.printf("%-10s",index);
                }
                System.out.println();

            }

    }catch(Exception e){
            e.printStackTrace();

        }finally{

        }
}
}