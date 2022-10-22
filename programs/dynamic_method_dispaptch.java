class Bike{
  void run(){
    System.out.println("Bike Running");
  }
}
class SportsBike extends Bike{
  void run(){
    System.out.println("SportsBike Running");
  }
}
class dynamic_method_dispatch{
  public static void main(String args[]){
    Bike b = new SportsBike();
    b.run();
  }
}
