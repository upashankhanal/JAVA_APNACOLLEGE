// there i am going to find out how to pass an argument in an array
public class Arug {
    
public static void update(int numb[]){
 for(int i=0; i<numb.length; i++){
    numb[i]=numb[i]+1;
    
 }
}

    public static void main(String args[]){
        int numb[]={1,2,3,4,5};

        update(numb);
        for(int i=0; i<numb.length; i++){
            System.out.print(numb[i]);
        }
    }
}
