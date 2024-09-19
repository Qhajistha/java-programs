public class testGarbage
{
    public void finalize(){
        System.out.println("Obj is garbage collected");
    }
    public static void main(String[]args){
        testGarbage s1=new testGarbage();
        s1=null;
        System.gc();
    }
    
}
