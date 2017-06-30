package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.domain.MemberBean;

public class GradeService {
   //field
	GradeBean g;
	public GradeService(){
		g = new GradeBean();
	}
	
   public int getTotal(GradeBean g) {
      return g.getKor()+g.getEng()+g.getMath();
   }

   public int getAvg(int total) {
	    return (total/3);
/*	   return (g.getKor()+g.getEng()+g.getMath());*/
   }
   
   public String getGrade(int avg) {
      //method area
	  String grade = "";
	      switch (avg/10) {
	      case 9 :
	      case 10 :
	         grade = "A";
	      case 8 :
	         grade = "B";
	      case 7 :
	         grade = "C";
	      case 6 :
	         grade = "D";
	      case 5 :
	         grade = "E";
	      }
	      return grade;
   }
   
   public String getGrade() {
      return grade;
   }
  
  

}