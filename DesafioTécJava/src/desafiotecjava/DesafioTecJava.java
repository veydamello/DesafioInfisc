/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiotecjava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author Veyda Rafaela Miranda de Mello
 */
public class DesafioTecJava {
    public static void reader(String archiv)throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(archiv));
        String line = "";
        while(true){
            if(line!=null){
                System.out.println(line);
            }else
                break;
            line=buffRead.readLine();
        }
        buffRead.close();
    }
       public static int readerEmployeers(String archiv)throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(archiv));
        int count=0;
        String line = "";
        while(line!=null){
             line=buffRead.readLine();
            if(line!=null){
                if(line.charAt(0)=='0'){
                    count++;
                }
            }else
                break;
        }
         buffRead.close();
        return count;
    }
        public static int readerClient(String archiv)throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(archiv));
        int count=0;
        String line = "";
        while(line!=null){
             line=buffRead.readLine();
            if(line!=null){
                if(line.charAt(0)=='1'){
                    count++;
                }
            }else
                break;
        }
         buffRead.close();
        return count;
    }
         public static int readerSales(String archiv)throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(archiv));
        int count=0;
        String line = "";
        while(line!=null){
             line=buffRead.readLine();
            if(line!=null){
                if(line.charAt(0)=='2'){
                    count++;
                }
            }else
                break;
        }
         buffRead.close();
        return count;
    }
        public static float sumSales(String archiv)throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(archiv));
        float total=0;
        int [] a = new int[readerSales(archiv)];
        String line = "";
            while(line!=null){
                line=buffRead.readLine();
                if(line!=null){
                    //System.out.println(line);
                    String[] textoSeparado = line.split("\\|");
                    if(textoSeparado.length>4){
                        textoSeparado[4] = textoSeparado[4].replace(',','.');
                        //System.out.println(textoSeparado[4]);
                        total+=Float.parseFloat(textoSeparado[4]);
                    }
                    //System.out.println(Arrays.toString(textoSeparado));
                }
                
            }
        buffRead.close();
        //System.out.println(total);
        return total;
        }
        
    public static void main(String[] args)throws IOException{
        String archiv = "C:/Users/Dell/Downloads/dados.txt";
        System.out.println("A quantidade total de funcionários é :"+readerEmployeers(archiv));
        System.out.println("A quantidade total de clientes é: "+readerClient(archiv));
        System.out.println("A quantidade total de vendas é: "+readerSales(archiv));
        System.out.println("A soma de todas as vendas é: "+sumSales(archiv));

    }
}