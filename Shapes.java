/*Create a Shape Interface with the methods "calculateArea" and "display". 
Create a Rectangle, Circle, and Triangle class to implement that interface.
*/

class Shapes
{
   public static void main(String[] args)
   {
      //create objects for each class
      Rectangle myRec = new Rectangle();
      Circle myCirc = new Circle();
      Triangle myTri = new Triangle();
      
      //call display and area methods for Rectangle
      myRec.display();
      myRec.calculatedArea();
      
      //call display and area methods for Circle
      myCirc.display();
      myCirc.calculatedArea();
      
      //call display and area methods for Triangle
      myTri.display();
      myTri.calculatedArea();
   }
   
}