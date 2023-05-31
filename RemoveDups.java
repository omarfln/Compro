public class RemoveDups {
    public  static String [] removeDup(String [] strArr){
        /**
         * @return array without duplicates.
         * @param strArr string array.
         */
        //sTmp to add unique strings to a tmp string and split them by , to form a list after that with the correct size
        String sTmp = "";
        boolean found = false;
        for (int i =0; i<strArr.length;i++){
              for (int j=i+1;j<strArr.length;j++){
                  if (strArr[i] == strArr[j]){
                      found = true;
                  }
              }
              if (!found){
                  if (sTmp.length()==0){
                        sTmp = strArr[i];
                  }
                  else{
                      sTmp = sTmp + "," + strArr[i];
                  }
              }
              found = false;

        }
        //Build the list by splitting tmp string
        String [] strUniq = sTmp.split(",");
        return strUniq;

    }
    public static void main(String [] args){
        String [] stRet = removeDup(new String[]{"horse", "dog", "cat", "horse", "dog"});
        for (int i =stRet.length-1;i>=0;i--){
            System.out.print(stRet[i] + " ");
        }
    }
}
