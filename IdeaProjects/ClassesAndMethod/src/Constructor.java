public class Constructor {

    String name;
    int id ;
    Constructor(int id , String name){
        this.id = id;
        this.name = name ;

    }
    public static void main(String[] args) {
        //Constructor sc = new Constructor();
       Constructor sc =  new Constructor(01 , "Varun");
        Constructor cs = new Constructor(02 , "Priyanjali");
        System.out.println("id : "+sc.id+" Name : "+sc.name);
        System.out.println("id : "+cs.id+" Name : "+cs.name);
    }
}
