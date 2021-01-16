package me.reinf.demo.chapter9;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;
import java.util.GregorianCalendar;

@Configuration
public class ExpressionParserRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        /*
//        * 문자열 파싱
//        * 문자열 파싱의 경우 문자열 표기를 위해 따옴표(`)를 표기
//        * */
//        String message = parseExpression("'Hello World'", String.class);
//        System.out.println(message);
//
//        /*
//         * 타겟의 메소드도 호출하여 파싱이 가능하다.
//         * */
//        String message2 = parseExpression("'Hello World'.concat('!!!')", String.class);
//        System.out.println(message2);
//
//        /*
//        * 연산
//        * */
//        Integer result = parseExpression("10 + 20", Integer.class);
//        System.out.println(result);
//
//
//        /*
//         * EvaluationContext 구현체를 이용하여 평가될 객체를 지정하여 파싱한다.
//         * EvaluationContext에 User 인스턴스를 고정하였다.
//         * */
//        User user = new User("reinf", "kimtaeho", new GregorianCalendar(1992,6,28).getTime());
//        EvaluationContext context = new StandardEvaluationContext(user);
//
//        /*
//        * User 인스턴스의 필드인 id를 파싱
//        * */
//        String id = (String) parseExpression("id", context);
//        System.out.println(id);
//
//        /*
//        * 타켓 클래스의 메서드를 호출하여 리턴된 값을 파싱하는 것도 가능
//        * */
//        String toString = (String) parseExpression("toString()", context);
//        System.out.println(toString);
//
//        /*
//        * EvaluationContext를 통해 타겟 클래스를 지정하지 않더라도 사용가능하다.
//        * */
//        Date birthday = (Date) parseExpression("birthday", user);
//        System.out.println(birthday);
//
//        String asd = (String) parseExpression("toString()", user);
//        System.out.println(asd);
    }

    private <T> T parseExpression(String expression, Class<T> clazz){
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression(expression);
        return exp.getValue(clazz);
    }

    private Object parseExpression(String expression, EvaluationContext context){
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression(expression);
        return exp.getValue(context);
    }

    private Object parseExpression(String expression, Object obj){
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression(expression);
        return exp.getValue(obj);
    }
}
