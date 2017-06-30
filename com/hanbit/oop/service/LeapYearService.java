package com.hanbit.oop.service;
public class LeapYearService {
      private int year;
      private String result;
      
      public void setYear(int year){
            this.year = year;
      }
      public int getYear(){
            return year;
      }
      
      public void setLeapYear() {
            if(year%4==0){
                  if(year%100==0){
                        result = "nomal year";  
                        if(year%400==0){
                        result = "leap year";
                        }
                  }                 
            }
            else {
                  result = "nomal year";
            }     
      }
      public String getLeapYear(){
            return result;
      }
}

/*package com.hanbit.oop.service;

public class LeapYearService {
	public String ExLeapYear(int y) {
		
		String result = "";
		
			if(y%4==0){
				if(y%100==0){
					result = "nomal year";	
					if(y%400==0){
					result = "leap year";
					}
				}			
			}
			else {
				result = "nomal year";
			}
		return result;	
	}
}*/