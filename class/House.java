public class House{
    String bedRoom;
    String bathRoom;
    String Kitchen;
    House(){
        bedRoom = "White";
        bathRoom="Green";
        Kitchen="Blue";
    }
    House(String bedRoom, String bathRoom, String Kitchen){
        this.bedRoom = bedRoom;
        this.bathRoom=bathRoom;
        this.Kitchen= Kitchen;
    }
    String sleep(){
        return "sleeping";
    }
    void bath(){
        System.out.println("Bathing");
    }
    void cook(){
        System.out.println("cooking");
    }
    public static void main(String[] args){
        House home1 = new House();
        System.out.println("House1: " + home1.Kitchen);
        System.out.println("House1: " +home1.sleep());

        House home2 = new House("Green", "Yellow","Pink");
        System.out.println("House2: " + home2.Kitchen);
        System.out.println("House2: " +home2.sleep());
        
    }
}