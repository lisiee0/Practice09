package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	List<Goods> gList= new ArrayList<Goods>();
    	String info, name;
    	int price, count, sum= 0;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("상품을 입력해주세요 (종료 q)");
		
		while(true) {
			info= sc.nextLine();
			
			if(info.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("==================================");
				break;
			}
			else {
				name= info.split(",")[0];
				price= Integer.parseInt(info.split(",")[1]);
				count= Integer.parseInt(info.split(",")[2]);
			}
			
			Goods newgoods= new Goods(name, price, count);
			gList.add(newgoods);
			
			sum+= count;
		}
		
		for(Goods g: gList) {
			g.stats();
		}
		
		System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
		sc.close();	
    }
}
