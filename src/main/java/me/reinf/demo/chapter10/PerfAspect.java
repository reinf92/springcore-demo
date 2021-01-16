package me.reinf.demo.chapter10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
* 부가 기능을 정의한 클래스를 빈으로 등록
* 등록된 빈을 Aspect로 등록
* */
@Component
@Aspect
public class PerfAspect {

    /*
    * 핵심 기능의 성능을 테스트하기 위한 부가기능
    * 포인트 컷 설정(특정 패키지 하위의 EventService 클래스의 모든 메서드)
    * 어드바이스 적용 around
    * */
    @Around("execution(* me.reinf..*.EventService.*(..))")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = pjp.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        return proceed;
    }

    /*
    * 핵심 기능 수행이전에 호출되는 기능
    * 포인트 컷 설정(특정 패키지 하위의 EventService 클래스의 모든 메서드)
    * 어드바이스 적용 before
    * */
    @Before("execution(* me.reinf..*.EventService.*(..))")
    public void logBefore(){
        System.out.println("logBefore");
    }
}
