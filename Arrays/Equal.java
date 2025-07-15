package Arrays;
import java.util.Arrays;

public class Equal {
    public static void main(String[] args) {
    int [] a={1,2,3,4};
    int [] b={1,2,3,4};
    int [] frequency=new int[10];
    System.out.println(Equal_arrays(a,b,frequency));
    }
    static String Equal_arrays(int [] a,int[] b,int[] frequency){
            for(int i=0;i<a.length;i++){
                frequency[a[i]]+=1;
            }
                        System.out.println(Arrays.toString(frequency));

             for(int i=0;i<b.length;i++){
                frequency[b[i]]-=1;
            }
            System.out.println(Arrays.toString(frequency));
             for(int i=0;i<frequency.length;i++){
                  if(frequency[i]==1) return "Different values";
            }

            return "Same elements";
        }
    }

