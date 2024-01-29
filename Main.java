
import java.util.HashMap;
import java.util.Map;

import java.lang.Character;


class Main{
   public static void main(String[] args){
      Map<Character,Integer> fileMap = getFileMap();

      isValidSquare(fileMap, "b", 3);
      isRookMoveValid(fileMap, isValidSquare(fileMap, "b", 3), null, null, "e", 5, "f", 7);
      

   }
   // this is going to be a test
   public static Map<Character, Integer> getFileMap(){
      Map<Character,Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        return map;

   }
   public static boolean isValidSquare(Map<Character, Integer>fileMap,String row, int col){
      int new_row = fileMap.get(Character.toLowerCase(row.charAt(0)));
      if(new_row >= 0 && new_row< 8 && col >= 0 && col < 8){
         return true;
      }
      else{
         return false;
      }
   }


   public static boolean isRookMoveValid(Map<Character, Integer>fileMap, boolean isValidSquare,String piece, String color, String newPosX, int newPosY, String currPosX, int currPosY){
      int curr_PosX = fileMap.get(Character.toLowerCase(currPosX.charAt(0)));
      int new_PosX = fileMap.get(Character.toLowerCase(newPosX.charAt(0)));
      if(isValidSquare){
         if(curr_PosX == new_PosX || currPosY == newPosY){
            System.out.println(" Rook CAN move to " + newPosX + "," + newPosY);
            return true;
         }
         else{
            System.out.println("Rook CANNOT move to " + newPosX + "," + newPosY);
            return false;
         }
      }
      System.out.println("Rook CANNOT move to " + newPosX + "," + newPosY);
      return false;
   }
}