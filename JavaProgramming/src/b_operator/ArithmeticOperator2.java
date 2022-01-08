package b_operator;

public class ArithmeticOperator2 {

	public static void main(String[] args) {
		
        /*
		 * 산술 연산자
		 * - 사칙 연산자 : +, -, *, /, %(나머지)
		 * - 복합 연산자 : +=, -=, *=, /=, %=
		 * - 증감 연산자 : ++, --
		 */
		
		int result = 10 + 30 - 30 * 40 / 50 % 60;
		
//		나머지 연산
		result = 10 / 3; //몫
		System.out.println(result);
		result = 10 % 3; //나머지
		System.out.println(result);
		
//		문제1) 5개의 산술 연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
        System.out.println("--------------");
        result = 1 + 1;
        System.out.println(result);
        result = 1 - 3;
        System.out.println(result);
        result = 1 * 6;
        System.out.println(result);
        result = 6 / 3;
        System.out.println(result);
        result = 1 % 3;
        System.out.println(result);
                
        //복합연산자
        System.out.println("--------------");
        result = result + 3;
        System.out.println(result);
        result += 3;
        System.out.println(result);
        result -= 5;
        System.out.println(result);
        
//      문제2) 아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
        System.out.println("-------------");
//      result = result + 10;
        result += 10;
        System.out.println(result);
//      result = result % 5;
        result %= 5;
        System.out.println(result);
//      result = result - 2;
        result -= 2;
        System.out.println(result);
        
        /*
         * 증감 연산자
         * 증가 연산자(++) : 변수의 값을 1 증가시킨다.
         * 감소 연산자(--) : 변수의 값을 1 감소시킨다.
         */	
        System.out.println("--------------");        
        int i = 0;
        
        ++i; // 전위형 : 변수의 값을 읽어오기 전에 1 증가된다. 값이 0일 때 읽은 값이 1
        i++; // 후위형 : 변수의 값을 읽어온 후에 1 증가 된다. 값이 0일 때 읽은 값이 0
        --i;
        i--;
        
        i = 0;
        System.out.println("++i = " + ++i);
        i = 0;
        System.out.println("i++ = " + i++);
        System.out.println(i);
//      문자에 들어가 있을 경우 차이가 있을 수 있다.
        
//      피연산자의 타입이 서로 같아야만 연산이 가능하다.()
        System.out.println("--------------");
        int _int = 10;
        double _double = 3.14;
        double result2 = /*(double)*/_int + _double;
        // 표현범위가 더 큰 타입으로 형변환된다. (형변환 된 것이 생략되어 있는 것)
        //
        
        int result3 =_int + (int)_double;
        
        System.out.println(result2);
        System.out.println(result3);
        
        System.out.println("--------------");
        byte _byte = 5;
        short _short =10;
        _int = _byte + _short;
        // int 보다 작은 타입은 int로 형변환 된다.(최소 4byte가 되어야 연산이 되기 때문)
        System.out.println(_int);
        
        char _char = 'a';
        char _char2 = 'b';
        _int = _char + _char2;
        System.out.println(_int);
        // 2byte라서 int로 형변환 된다. (최소 4byte가 되어야 연산이 되기 때문)
        
        // 오버플로우, 언더플로우
        // 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
        byte b = 127;
        b++; // 큰 값을 벗어나는 것을 언더플로우
        System.out.println(b);
        b--; // 작은 값을 벗어나는 것을 언더플로우
        System.out.println(b);
//        범위를 고려해서 연산을 해야한다.
        
//        문제3) 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
//        1. 123456 + 654321
//        2. 1번의 결과값 * 123456
//        3. 2번의 결과괎 / 123456
//        4. 3번의 결과값 - 654321
//        5. 4번의 결과값 % 123456
        
        System.out.println("--------------");
        
        long _long = 123456 + 654321;
        System.out.println(_long);
        
        _long *= 123456;
        System.out.println(_long);
        
        _long /= 123456;
        System.out.println(_long);
        
        _long -= 654321;
        System.out.println(_long);
        
        _long %= 123456;
        System.out.println(_long);
        
        
//        문제4) 3개의 int타입 변수를 선언 및 초기화 후 함계와 평균을 구해주세요.
        
        System.out.println("--------------");
        
        int qwe = 3;
        int asd = 8;
        int zxc = 53;
        
        int add = qwe + asd + zxc;
        System.out.println("합계" + add);
        
        double avg = add / 3.0;
        avg = Math.round(avg * 1000) / 1000.0; //반올림 : 원하는 소수점 자리 표시
        System.out.println("평균" + avg);
        
        System.out.println("합계 : " + add + ", " + "평균 : " + avg);
        
//        랜덤
//        Math.random() : 0.0 ~ 1.0미만
        
        System.out.println("--------------");
        int random = (int)(Math.random()*100)+1;
        //1~100까지의 랜덤 숫자, 소수점 필요없으니 int로 형변환을 시켜준다.(자주사용)
        
        System.out.println(random);
                
        
        
        
        		
        
        
	
		
		
		
		
		
		
		
	}

}
