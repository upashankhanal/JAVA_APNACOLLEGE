// Searching element in an array using linear method

public class linear {
    
public static int linearSearch(int numb[], int key){
    for(int i=0; i<numb.length; i++){
        if(numb[i]==key){
            key=numb[i];
        }
    }
    return key;

}
    public static void main(String args[]){
    int numb[]= {1,2,3,4,5};
    int key=3;
linearSearch(numb, key);
System.out.println("the key number is: " + key);

    }
}
