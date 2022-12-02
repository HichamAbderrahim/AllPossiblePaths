package allpossiblepaths;
import static java.lang.System.out;
public class AllPossiblePaths {

    public static void main(String[] args) {
        int[] list = {1,7,5};
        printAllPaths(list, "");
       
    }
    
    public static void printAllPaths(int[] list, String res){
        if(list.length == 0){
            out.println(res);
        }else {
//            int[] subList = new int[list.length - 1];
//            for(int i = 1; i < list.length; i++){
//                subList[i-1] = list[i];
//            }
//            printAllPaths(subList);
            for(int i = 0; i < list.length; i++){
                int[] subList = new int[list.length - 1];
                int k = 0,j = 0;
                while(j < subList.length){
                    if(k == i){
                        k++;
//                        out.println("Num: " + list[i]);
                        continue;
                    }
                    subList[j] = list[k];
                    k++;
                    j++;
                }
                printAllPaths(subList, res + list[i]);
//                out.print("Sub list: ");
//                if(subList.length == 0){
//                    out.print("null");
//                }else{
//                    for(int u = 0; u < subList.length; u++){
//                        out.print(subList[u]);
//                    }
//                }
//                out.println();
                
            }
            
            
            
            
        }
    }
    
}
