import java.util.*;


import java.io.*;
public class StringFormatting {
    public static void main(String[]args) throws Exception {
        //createReferences();
        mapChromosome();

       
    }
    static void mapChromosome() throws Exception{
        Scanner in = new Scanner(new FileReader("/Applications/Workspace/Current/src/TEXT"));
        Scanner fileIn = new Scanner(new FileReader("/Users/yuxiangzhang/Desktop/Research paper/LNCAP/LNCAP/LNCAP_peaks.narrowPeak"));
        PrintWriter out = new PrintWriter("/Users/yuxiangzhang/Desktop/Research paper/LNCAP/chromosomes.txt");
        ArrayList<ArrayList<String>>list = new ArrayList<>();
        while(in.hasNext()){
            ArrayList<String>line = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(in.nextLine());
            for (int i = 0; i < st.countTokens(); i ++) {
                line.add(st.nextToken());
            }
            list.add(line);
            out.println();
        }

        while (fileIn.hasNext()){
            StringTokenizer st = new StringTokenizer(fileIn.nextLine());
            String query = st.nextToken();
            System.out.println(query);
            for (int i = 0; i < list.size(); i ++){
                System.out.println(list.get(i).contains(query));
                if(list.get(i).contains(query)){
                    int index = list.get(i).indexOf("Chromosome");
                    out.println(list.get(i).get(index -1));
                    break;
                }
            }

            out.flush();
        }


        out.close();
    }
    static void createReferences() throws Exception {
        Scanner in = new Scanner(new FileReader("/Users/yuxiangzhang/Desktop/Research paper/LNCAP/LNCAP/LNCAP_peaks.narrowPeak"));
        PrintWriter out = new PrintWriter("/Users/yuxiangzhang/Desktop/Research paper/LNCAP/Batch.txt");
        while(in.hasNext()){
            StringTokenizer st = new StringTokenizer(in.nextLine());
            out.println(st.nextToken());
        }
        out.close();
    }
}
