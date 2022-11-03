package org.tns.oopsconcepts;
 class Root {
	 void Dispaly1()
	 {
		 System.out.println("I am the parent 1");
	 }

}
 class node extends Root
 {
	 void Display2()
	 {
		 System.out.println("I am the parent 2");
	 }
 }
 class Leaf extends node
 {
	 void Display3()
	 {
		 System.out.println("I am the child");
	 }
 }
