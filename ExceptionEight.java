package com.cg;

public class ExceptionEight {
  
	public static void main(String[] args) {
		try {
			String s="Rachana";
			System.out.println(s.charAt(6));
			try { 
				String r="Seelam";
				System.out.println(r.contains("h"));
			}
			catch(Exception e){
				System.out.println(e.getMessage());	
			}
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}