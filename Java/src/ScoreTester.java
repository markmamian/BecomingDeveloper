package ObjectAndMethod3;

public class ScoreTester {
	public static void main(String[] args){
		//giveScore(Score.EXCELLENT);//����switch����ö��ֵ        ��2-17
		for(Score s:Score. values()){  //��ǿforѭ����Ҫ��jdk5���ϰ汾   ѭ���������ö��ֵ
			System.out.println(s);
		}
		Score s= Score.valueOf("EXCELLENT");   //���ַ����õ�ö������
		System.out.println(s.toString());      //���s���ַ�������
		System.out.println("ordinal of EXCELLENT is "+s.ordinal()); //���s��λ������
	}
	/*  ��2-17
	public static void giveScore(Score s){   //�β�
		
		switch(s){      
		case EXCELLENT:
			System.out.println("Excellent");
			break;
		
		case QUALIFIED:
			System.out.println("Qualified");
			break;
		case FAILED:
			System.out.println("Failed");
			break;
			
	}*/
		
		
		
	}
	
//}