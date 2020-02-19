package job;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class Jimin {

	public static void main(String[] args) {
		// 7문제 - 240분  SQL 3 + Java 4
		// 나     1)*2)
		// 경원  *2)3)
		// 원경  3)4)
		// 혜빈  4)5)
		// 의호  5)6)
		// 성재  6)1)
		// 영진  *7)
		// 미지  [7)]6)
		// 상만  6)5)
		// 지민  5)4)
		// 지수
		
		// 1번 
		/*
		int n ;
		n  = new  Scanner(System.in).nextInt();		
		// 조건) 10 <= n <= 2^31-1
		int result = 0 , len = 0, index = 0;
		String nStr = null;
		while( n >= 10  ) { 
			result = index = 0;
			nStr = n  +"";
			len = nStr.length();
			while( index < len) {
				System.out.print(nStr.charAt(index)+"+");
				result += nStr.charAt(index) - 48;
				index++;
			}
			System.out.println("=" + result);
			n = result;
		}
		*/
		/*
		// 3번
		// 문자열 주기 : 일정한 간격
		// abababab  2
		// abcabcabd 9
		//String s = "abababab";		
		String s = "abcabcabd";
		int result = s.length();
		// 조건1) s  는 소문자
		// 조건2) s  1<=   <=1,000,000		
		result = solution(s);
		System.out.println(result);
		*/

		
		// 문제 4
		// N , 친구 수 분석
		// 친구의 친구도 친구다. 
		// 3-1-2-4-5
		//int [][] relation = {{1,2},{4,2},{3,1},{4,5}};
		int [][] relation = {{6,7},{1,2},{4,2},{3,1},{4,5}};
		int [] result = solution(relation);
	}
    /* 
	private static int solution(String s) {
		int max = s.length()/2, min = 1;
		int endIndex = 1;
		boolean flag = false;
		while( max > endIndex ) {
		 String oldChar = s.substring(0, endIndex);
		 if(  s.replace(oldChar , "").length() == 0 ) {
			 flag = true;
			 break;
	     }
		 endIndex++;
		}		
		return flag? endIndex : s.length();
	}
	*/
	
	// SQL1
	
	
	private static int[] solution(int[][] relation) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		for (int i = 0; i < relation.length; i++) {
			hs.add(relation[i][0]);
			hs.add(relation[i][1]);
		}		 
		System.out.println(hs);

		//int [][] relation = {{6,7},{1,2},{4,2},{3,1},{4,5}};
		// 1- 2
		//    2-  4
		Iterator<Integer> ir = hs.iterator();	
		int cnt = 0;
		while (ir.hasNext()) {
			Integer no =  ir.next();  // 친구수 체크할 번호. 1
			System.out.printf("[%d]\n",no);
			cnt = 0;
			for (int i = 0; i < relation.length; i++) {
				//System.out.println(relation[i][0] + "/" + relation[i][1]);
				if (relation[i][0] == no) {
					//System.out.print(relation[i][1] + "/ " );  // 뒤
					int back = relation[i][1];
					cnt++;
					for (int j = 0; j < relation.length ; j++) {
						if( i==j ) continue;
						if (  relation[j][0] == back  ) {
							//System.out.print(relation[j][1] + "/ " );  // 뒤
							cnt++;
						} else if(  relation[j][1] == back  ){
							//System.out.print("*"+relation[j][0] + "/ " );  // 뒤
							cnt++;
						}
					}
				} else if (relation[i][1] == no) {
					System.out.print(relation[i][0] + "/ " );  // 앞					
					cnt++;
					int front =  relation[i][0];
					for (int j = 0; j < relation.length; j++) {
						if( i==j ) continue;
						if (  relation[j][0] == front  ) {
							//System.out.print(relation[i][1] + "/ " );  // 앞
							cnt++;
						} else if(  relation[j][1] == front  ){
							//System.out.print(relation[j][0] + "/ " );  // 뒤
							cnt++;
						}
					}
				}				
				
				
			}
			
			System.out.println(cnt);
		} // while
		
	   
		
		return null;
	}

}
/*
행
1 2
   [열]  행[열] 
   열 
4 1
[행]    열[행]
*/
