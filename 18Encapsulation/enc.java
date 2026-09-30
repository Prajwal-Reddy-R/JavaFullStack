class demo{
    private String name="apple";
    private int price=100;

   public String getname(){
    return name;
   }

   public int getprice(){
    return price;
   }

   public void setname(String name){
    this.name=name;
   }
   public void setprice(int price){
    this.price=price;
   }

}

public class enc{
    public static void main(String[] args) {
        demo d= new demo();
        d.setname("banana");
        d.setprice(200);

       System.out.println(d.getname());
        System.out.println(d.getprice());
    }
}