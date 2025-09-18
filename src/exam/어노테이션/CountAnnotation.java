package exam.어노테이션;

import org.w3c.dom.ls.LSOutput;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//jvm 실행 시
public @interface CountAnnotation {

    //클래스나 메소드 위에 붙여서 사용
    //@ 로 시작
    //소스코드에 메타코드(추가정보) 를 주는것. => 클래스가 실행될 때 어노테이션에 따라 다르게 실행됨.
    //커스텀해서 사용가능.
}
