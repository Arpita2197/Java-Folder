class B1 { }
class C1 { }

 interface D1 { }
 interface E1 { }
 interface F1 { }

  // OK 
 // class A1 extends B1 { }

   // NOT OK
 // class A1 extends B1 , C1 { }

 // NOT OK
 // class A1 extends  D1 { }

 // NOT OK
//class A1 extends D1,E1{ }

// NOT OK
 //class A1 implements B1 { }

  // NOT OK
 // class A1 implements B1,C1 { }

 // OK
// class A1 implements D1 { }

 // OK 
 class A1 implements D1, E1 { }