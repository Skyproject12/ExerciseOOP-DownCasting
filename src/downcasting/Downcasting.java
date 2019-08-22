package downcasting;
    
class dataA {
   public void tampilA(){
       System.out.println("lonovo A eror");
   } 
}
class dataB extends dataA{
    public void tampilB(){
        System.out.println("lenovo B eror");
    }
}
public class Downcasting {

    public static void main(String[] args) {
        dataA data = new dataB();
        
        dataB b = (dataB) data;
        b.tampilB();
        
        ((dataB)data).tampilB();
    }
    
}
