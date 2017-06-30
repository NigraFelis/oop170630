package com.hanbit.oop.controller;
import java.util.Scanner;
import com.hanbit.oop.service.BMIService;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.LeapYearService;
/*import com.hanbit.oop.service.RankingService;*/
import com.hanbit.oop.service.SecondCalcService;
import com.hanbit.oop.service.TaxCalcService;
public class Controller {
      public static void main(String[] args) {
            
            Scanner s = new Scanner(System.in);
            CalcService s2 = new CalcService();
            LeapYearService s3 = new LeapYearService();
            TaxCalcService s4 = new TaxCalcService();
            /*RankingService s5 = new RankingService();*/
            SecondCalcService s6 = new SecondCalcService();
            GradeService g = new GradeService();
            BMIService bmi = new BMIService();
            
            while(true){
                  System.out.print("insert number\n");
                  String menu = s.next();
            
                  switch(menu){
                        case "0":
                              System.out.print("end");
                        return;
                  
                        case "1":
                              System.out.print("weight : ");
                              double weight = s.nextDouble();
                              bmi.setWeight(weight);
                              System.out.print("height : ");
                              double height = s.nextDouble();
                              bmi.setHeight(height);
                              bmi.setBMI();
                              bmi.setResult();
                              System.out.println("result is " + bmi.getResult());
                              break;
                  
                        case "2":
                              System.out.print("Insert year\n");
                              int year = s.nextInt();
                              s3.setYear(year);
                              s3.setLeapYear();
                              System.out.println(s3.getLeapYear());
                              break;
                        
                        case "3":
                              System.out.println("이름 입력");
                              String name = s.next();
                              s4.setName(name);
                              System.out.println("연봉 입력");
                              int salar = s.nextInt();
                              s4.setSalar(salar);
                              s4.setTaxRatio();
                              s4.setTaxCalc();
                              System.out.print("************************************************"+"\n"
                                                      +"이름"+"\t"+"연봉"+"\t"+"세율"+"\t"+"납부할 세금"+"\n"
                                                      +name +"\t"+salar+"\t"+s4.getTaxRatio()+"\t"+s4.getTaxCalc()+"\n"
                                                      +"************************************************"+"\n");
                              
                              break;
                        
                        /*case "4":
                              System.out.println("이름과 점수를 입력하세요");
                              
                              int numArr[] = new int[3];
                              String nameArr[] = new String[3];
                              
                              for(int i=0; i<3; i++){
                                    System.out.println("Insert Name");
                                    nameArr[i] = s.next();
                                    s5.setName(nameArr[i]);
                                    System.out.println("Insert Num");
                                    numArr[i] = s.nextInt();
                                    s5.setArr(numArr[i]);
                              }
                              
                              int threeNum[] = s5.ExRanking(a, b, c);
                              System.out.print("first:"+ "\t" +name[0]+"\t" + num[0] + "\n" +"second:"+ "\t" +name[1]+"\t" +num[1] + "\n" + "third:" + "\t" +name[2]+"\t" + num[2] );
                              
                              break;*/
                        
                        case "5":
                              System.out.println("초를 시간과 분으로 바꾸어 주는 프로그램입니다.\n초를입력해주세요.");
                              int second = s.nextInt();
                              s6.setSecond(second);
                              s6.setSecondCalc();
                              System.out.println(s6.getSecondCalc());
                        
                              
                              break;
                        case "6":
                              System.out.println("insert num1");
                              String a = s.next();
                              System.out.println("insert num2");
                              String b = s.next();
                              String sumResult = s2.calcPlus(a, b);
                              System.out.println(sumResult);
                              break;
                        case "7":
                              System.out.print("enter name");
                              String name2 = s.next();
                              g.setName(name2);
                              System.out.print("enter major");
                              String major = s.next();
                              g.setMajor(major);
                        
                              System.out.print("kor");
                              int kor = s.nextInt();
                              g.setKor(kor);
                              System.out.print("eng");
                              int eng = s.nextInt();
                              g.setEng(eng);
                              System.out.print("math");
                              int math = s.nextInt();
                              g.setMath(math);
                              g.setTotal();
                              g.setAvg();
                              g.setGrade();
/*                            System.out.println(g.getName()+","+g.getMajor()+","+g.getGrade());*/
                              System.out.println(g.toString());
                              break;
                        
                  }
            }
      }
}
