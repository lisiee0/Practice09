package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	List<Friend> fList= new ArrayList<Friend>();
    	
    	String Info, name, hp, school;
    	int i= 0;
    	
    	Scanner sc= new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요.");
    	
    	do {
    		Info= sc.nextLine();
    		name= Info.split(" ")[0];
    		hp= Info.split(" ")[1];
    		school= Info.split(" ")[2];
    		
    		Friend newfriend= new Friend(name, hp, school);
    		fList.add(newfriend);
    		
    		i++;
    	}
    	while (i<3);
    	
    	for(Friend f: fList) {
    		f.showInfo();
    	}
    	sc.close();
    }
}
