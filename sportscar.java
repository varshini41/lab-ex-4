package inter;

/**
 *
 * @author ashwi
 */
public class Inter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      rectangle obj=new rectangle() 
      {
          @Override
          public void print() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
      obj.display();
      sportscar obj1=new sportscar() {
          @Override
          public void print() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      }; 
      obj.display(); 
      manager obj2=new manager();
      obj2.display();  
    }
    
}
      interface printable
      { 
          abstract void print();
      }
      abstract class rectangle implements printable
              { 
          public void display()
              { 
                  int area;
                  int l=10;
                  int b=20;
                  area=l*b;
                  System.out.println("Length="+l); 
                  System.out.println("breadth="+l);
                  System.out.println("Area="+area);
              }
      } 
 abstract class sportscar implements printable 
 { 
     public void display(char cooper) 
     {
         char bn=cooper;
         int mod=2022;
         int pri=500000;
         System.out.println("brand="+bn); 
         System.out.println("model="+mod);
         System.out.println("price="+pri);
         
     }
 abstract class manager implements printable
 {
     public void display(char ABC)
     {
         char n=ABC;
         int age=24;
         int empid=2343;
         double s=20000;
         System.out.println("name="+n); 
         System.out.println("employee id="+empid);
         System.out.println("employee age="+age);
         System.out.println("salary="+s);
         
     }
 }
 }

    

