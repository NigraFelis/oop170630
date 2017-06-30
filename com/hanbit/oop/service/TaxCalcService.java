package com.hanbit.oop.service;
public class TaxCalcService {
      private String name, result;
      private int salar;
      private double taxRatio;
      
      public void setName(String name){
            this.name = name;
      }
      public String getName(){
            return name;
      }
      public void setSalar(int salar){
            this.salar = salar;
      }
      public int getSalar(){
            return salar;
      }
      public void setTaxRatio(){
            if(salar<=1200){
                  taxRatio = 0.08;
            }
            else if(salar>1200&&salar<=4600){
                  taxRatio = 0.17;
            }
            else if(salar>4600&&salar<=8800){
                  taxRatio = 0.26;
            }
            else if(salar>8800){
                  taxRatio = 0.35;
            }
      }
      public double getTaxRatio(){
            return taxRatio;
      }
      
      public void setTaxCalc(){     
            result = String.valueOf(salar*taxRatio);
      }
      
      public String getTaxCalc(){
            return result;
      }     
}


/*package com.hanbit.oop.service;

import java.util.Scanner;

public class TaxCalcService {
	public String ExTaxCalc(String name, int salar){
		
		double tax = 0;
		if(salar<=1200){
			tax = 0.08;
		}
		else if(salar>1200&&salar<=4600){
			tax = 0.17;
		}
		else if(salar>4600&&salar<=8800){
			tax = 0.26;
		}
		else if(salar>8800){
			tax = 0.35;
		}
		int result = (int)(salar * tax);;
			
		String Tax = ("********************************\n"
						+"이름  |  연봉  |  세율  |  납부할 세금\n"
						+name+"/t"+salar+"/t"+(int)(tax*100)+"/t"+result+"\n"
						+"********************************\n");
		return Tax;
				
	}
}*/