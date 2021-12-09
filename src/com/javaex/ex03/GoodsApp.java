package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	List<Goods> gList= new ArrayList<Goods>();
    	String Info, name;
    	int price, count, sum= 0;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("상품을 입력해주세요 (종료 q)");
		
    	try {	
			do {
				Info= sc.nextLine();
				
				if(Info.equals("q")) {
					System.out.println("[입력완료]");
					System.out.println("==================================");
					break;
				}
				name= Info.split(",")[0];
				price= Integer.parseInt(Info.split(",")[1]);
				count= Integer.parseInt(Info.split(",")[2]);
				
				Goods newgoods= new Goods(name, price, count);
				gList.add(newgoods);
				sum+= count;
	    	}
			while (Info!="q");

			for(Goods g: gList) {
				g.stats();
			}
			System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
			sc.close();
    	}		
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("유효하지 않은 명령어입니다.");
			}  
    }
}
