package com.hanbit.oop.service;

public class GradeService {
   //field
   private int kor,eng,math,total,avg;
   private String grade, name, major;

   public void setKor(int kor) {
      this.kor = kor;
   }
   public int getKor() {
      return kor;
   }
   
   public void setEng(int eng) {
      this.eng = eng;
   }
   public int getEng() {
      return eng;
   }
   
   public void setMath(int math) {
      this.math = math;
   }
   public int getMath() {
      return math;
   }
   
   public void setTotal() {
      this.total=kor+eng+math;
   }
   public int getTotal() {
      return total;
   }

   public void setAvg() {
      this.avg = total/3;
   }
   public int getAvg() {
      return avg;
   }
   
   public void setGrade() {
      //method area
	   setGrade();
	   setAvg();
	   
      switch (avg/10) {
      case 9 :
      case 10 :
         this.grade = "A";
      case 8 :
         this.grade = "B";
      case 7 :
         this.grade = "C";
      case 6 :
         this.grade = "D";
      case 5 :
         this.grade = "E";
      }
   }
   public String getGrade() {
      return grade;
   }
   public void setName(String name){
	   this.name=name;
   }
   public String getName(){
	   return name;
   }
   public void setMajor(String major){
	   this.major=major;
   }
   public String getMajor(){
	   return major;
   }
   public String toString(){
	   return "===========================\n"
	   		+ "이름	 	전공				성적\n"
	   		+ "===========================\n"
	   		+ name+"\t"+major+"\t"+grade+"\n";
   }

}