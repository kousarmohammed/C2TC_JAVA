package org.tns.oopsconcepts;

public class poly {
	
		void volume(int s) 
		{
			System.out.println("Volume of cube is"+s*s*s);
		}
		void Volume(int l,int b, int h)
		{
			System.out.println("Volume of cuboid is"+l*b*h);
		}
		void Volume(float r)
		{
			System.out.println("Volume of sphere is"+(4/3)*(3.14)*r*r*r);
		}
		// TODO Auto-generated method stub




	public static void main(String[] args) {
		poly v1 = new poly();
		v1.Volume(2,4,5);
	    v1.Volume(2);
	    v1.Volume(6);
		// TODO Auto-generated method stub

	}

}
