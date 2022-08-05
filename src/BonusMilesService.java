public class BonusMilesService {
 public int calculate(int price){
     int miles;
     if(price>0){
         miles=price/20;
         return miles;
     }
     else {return 0;}
 }
}
