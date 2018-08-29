package dev;

public class GettingMiddleName {

	public static void main(String[] args) {
		String name="sipu";
		if(name.length()%2==0) {
			
			char firstName=name.charAt(name.length()/2);
			char secondName=name.charAt(name.length()/2-1);
			String nameFinl=Character.toString(firstName);
			String seconfFinl=Character.toString(secondName);
			System.out.println(seconfFinl+nameFinl);
		}else {
			char firstName=name.charAt(name.length()/2);
			String fknk=Character.toString(firstName);
			System.out.println(fknk);
		}

	}

}
