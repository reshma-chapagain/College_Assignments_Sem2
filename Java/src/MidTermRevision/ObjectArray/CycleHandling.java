package MidTermRevision.ObjectArray;
import java.util.Date;

import static java.lang.System.out;

public class CycleHandling {





        public static void main(String args[]){
            Bicycle [] bicycles = new Bicycle[3];

            //creating object using new keyword
            Bicycle ramCycle= new Bicycle();//object declaration and initization
            Bicycle pukarCycle= new Bicycle();
            Bicycle abhishek = new Bicycle //paramert
                    ("test",
                            "Abhishek",
                            "ring10",
                            "Cube",
                            new Date());//object declaration

            bicycles[0]=ramCycle;
            bicycles[1]=pukarCycle;
            bicycles[2]=abhishek;

            //for Ram
            ramCycle.setCycleOwnwer("Ram");
            ramCycle.setCycleVendor("Giant");
            ramCycle.setManufacturateDate(new Date());

            //for pukar
            pukarCycle.setCycleOwnwer("Pukar");
            pukarCycle.setCycleVendor("Hero");
            pukarCycle.setManufacturateDate(new Date());


            //inforamation getting of Ram
            out.println("Cycle vendor::"+ramCycle.getCycleVendor());
            out.println("cycle product date::"+ramCycle.getManufacturateDate());

            //information getting of pukar
            out.println("Cycle vendor::"+pukarCycle.getCycleVendor());
            out.println("cycle product date::"+pukarCycle.getManufacturateDate());

            for(int i=0;i<bicycles.length;i++){
                System.out.println(bicycles[i].getManufacturateDate());
                System.out.println(bicycles[i].getCycleVendor());

            }
        }


    }
