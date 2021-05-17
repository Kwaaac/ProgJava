package fr.umlv.cooperative.exo1;

class A {
  int x = 1;

  public int getX() {
    return x;
  }
  
  static void printX(A a) {
    System.out.println("in A.printX");
    System.out.println("x " + a.x);
    System.out.println("getX() " + a.getX());
  }
  
  int m(A a) { return 1; }
}

class B extends A {
  int x = 2;

  public int getX() {
    return x;
  }


  static void printX(B b) {
    System.out.println("in B.printX");
    System.out.println("x " + b.x);
    System.out.println("getX() " + b.getX());
  }

  int m(B b) { return 2; }
}

public class Overridings {
  public static void main(String[] args) {
    /*
    x:1, getX: 1
     */
    //A.printX(new A());     // 1
    /*
     * x: 2; getX: 2
     */
    //B.printX(new B());   // 2
    /*

    x: 1, getX: 2
     */
    //A.printX(new B());   // 3

    // 1
    A a = new B();
    System.out.println(a.m(a));              // 4

    /*
    * Quand on fait un appel à a.x, il va s'agir du x qui se trouve dans la classe dans laquelle il est appeller
    * donc 1, lorsqu'on fait appel à getX(), il va s'agir du x qui se trouve dans la classe de l'objet
    * */
  }
}