
	package google.foobar.challenges.challenge2;

	public class Solution {

		private static int strCompare(String s1, String s2) {
			String[] strArray1=s1.split("\\.");
			String[] strArray2=s2.split("\\."); 
			int minLenght = 0;
			 minLenght=(int) ((strArray1.length<strArray2.length)
				? strArray1.length
				: strArray2.length);
			
			 int result=0;
			 for(int i=0;i<minLenght;i++) {
				 result= Integer.parseInt(strArray1[i])-Integer.parseInt(strArray2[i]);
				 if( result!=0) {
					 return  result;
				 }
			 }
			 if(result==0) {
				 result = strArray1.length-strArray2.length;
			 }
			 
			return result;
		}
		
		public static String[] solution(String[] l) {
			
		for (int i=0;i<l.length;i++) {
			for(int j=0;j<l.length;j++) {
				if(strCompare(l[i],l[j])<0) {
					String aux= l[i];
					l[i]=l[j];
					l[j]=aux;
				}
			}
		}
			return l;
		    }
	}


