package net.zerocoding.tutorials.java.stringprocessing.concatenation.examples;

public class StringBuilderExample {
	public static void main(String[] args) {
		String tmpStr = "";
		StringBuilder sb = new StringBuilder();
		
		sb.append("hello");
		sb.append(" wolrd!!");
		sb.append(" We are JAVA expert");
		tmpStr = sb.toString();
		
		System.out.println(tmpStr);
	}
}
