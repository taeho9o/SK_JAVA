import java.util.*;

public class Member {
	static String name;
	static String gender;
	static String jo;
	static int integerJo;
	
	public void memInfo(String memberInfo) {
		StringTokenizer st = new StringTokenizer(memberInfo);
		st = new StringTokenizer(memberInfo);
		while(st.hasMoreTokens()) {
			name = st.nextToken();
			gender = st.nextToken();
			jo = st.nextToken();
		}
		
		integerJo = Integer.parseInt(jo);
		this.name = name;
		this.gender = gender;
		this.integerJo = integerJo;
	}
	
	
	
	public int randJo() {
		Random rand = new Random();
		System.out.println(integerJo);
		int newJo = 0;
		while(newJo == integerJo) {
			//System.out.println(integerJo);
			System.out.println("µµ¶ù³ª!!!!");	
			newJo = rand.nextInt(5) + 1;
		}
		return newJo;
	}
	
}
