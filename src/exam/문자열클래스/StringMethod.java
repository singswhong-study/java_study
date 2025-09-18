package exam.문자열클래스;

public class StringMethod {
    public static void main(String[] args) {
        //String str = new String("abcdefg");
        String str = "abcdefg";
        String str2 = "abc";

        str.length();
        str.isBlank();              // 공백을 제외한 길이가 0인지.
        str.isEmpty();              // 길이가 0인지 여부. 공백이 있다면 false
        str.trim();                 // 앞뒤의 공백 제거
                                    // * str = str.메소드();  이런식이면 메모리주소가 바뀜
        str.charAt(3);              //
        str.indexOf("abc");         // 문자열의 위치 반환 (인자값이 하나 더 있으면 그거 이후로 찾음)
        str.lastIndexOf("abc"); // 문자열의 마지막 위치 (인자값이 하나 더 있으면 그거 이전의 마지막을 찾음) 포함되지 않으면 -1 리턴
        str.equalsIgnoreCase("abc"); // 대소문자 가리지않고 비교
        str.contains("abc");        // 포함되는지 true/false
        str.startsWith("abc");      // 해당문자열로 시작 여부 (인자값이 하나 더 있으면 그 위치에서 시작하는지 여부)
        str.endsWith("abc");        // 해당문자열로 끝남 여부
        str.matches("");      // 정규표현식 체크
        str.compareTo("abc");       // 문자가 같은부분이 있으면 차이나는 부분의 길이 리턴, 다르면 사전순 차이 길이 리턴(사전 순 기준으로 양수/음수 반환)
        str.compareToIgnoreCase(str2);
        str.toUpperCase();          // 대문자로 변환해서 반환
        str.toLowerCase();          // 소문자로 변환해서 반환
        str.concat("abc");      // 이어붙임. +로 해도됨. concat은 문자열만 가능. +"" 으로 붙이면 메모리 주소가 다름. concat은 같은 주소. 성능은 + "" 가 더 나음.
                                    // concat("") 은 실행시마다 메모리주소에 추가 추가 추가하고
                                    // + "" 는 StringBuilder sb 에 append();.toString(); 으로 연산됨. 단 한줄로 이어서 + 할때만. for 루프 같은데서는 다름. 그러므로 StringBuilder 를 사용해야됨.
        str.repeat(2);        // 주어진 정수만큼 반복. str.concat(" ").repeat(3).trim(); 하면 마지막 공백은 지워짐.
        str.substring(1); // 인자값 1개일때는 0 ~ 거기까지 제거한 결과,  두개일때는 시작,종료
        str.replace("a", "b"); // "a"문자를 다 "b"로 치환 replaceAll("정규식", "바꿀것"), replaceFirst(); // 정규표현식을 두번째 인자로 바꿈
        str.toCharArray();          // String을 char[] 문자배열로 반환.
        str.split("a");       // "a"를 기준으로 잘라서 char[] 문자배열로 반환

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("ab");
        System.out.println(sb.capacity());
        sb.append("cccccccccccccc");
        System.out.println(sb.capacity());
        sb.append("c");
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer(); // 기본 16 버퍼 크기로 생성

        System.out.println(sb2.capacity()); // 16

        sb2.append("1111111111111111111111111111111111111111"); // 40길이의 문자열을 append
        System.out.println(sb2.capacity()); // 40 (추가된 문자열 길이만큼 늘어남)

    }
}
