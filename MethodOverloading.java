package PolyMorphism;

class Diagram
{
	 static int add(int x,int y,int d)
	 {
		 return x+y;
	 }
	 
	 static int add(int x,int y,int z,int u)//method signature
	 {
		 return x+y+z+u;
	 }
	 
	 static float add(float x,int y,int z)
	 {
		 return x+y+z;
	 }
	 
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		
		System.out.println(Diagram.add(23,45,67));
		System.out.println(Diagram.add(56.56f, 90,88));
        
	}

}
