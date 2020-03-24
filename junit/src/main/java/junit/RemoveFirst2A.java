package junit;

public class RemoveFirst2A {
      public  String deleteA(String string)
      {
    	  String result=string;
    	  int stringLength=string.length();
    	 // char[] a=string.toCharArray();
    	  if(string.charAt(0)=='A' &&string.charAt(1)!='A' )
    	  {
    		  result=string.substring(1, stringLength);
    	  }
    	  
    	  else if(string.charAt(0)=='A'&& string.charAt(1)=='A')
    	  {
    		  result=string.substring(2, stringLength);
    	  }
    	  else if(string.charAt(0)!='A' &&string.charAt(1)=='A')
          {
	           result=string.charAt(0)+string.substring(2, stringLength);
           }


    	  
    		  
    	  
    	  return result;
      }
}
