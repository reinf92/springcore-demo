package me.reinf.demo.chapter7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class ValidatorRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(validator.getClass().toString());
//        Member member = new Member();
//        member.setEmail("이메일형식이 아님");
//        //MemberValidator validator = new MemberValidator();
//        Errors errors = new BeanPropertyBindingResult(member, "member");
//
//        if (validator.supports(Member.class)){
//
//            validator.validate(member, errors);
//            System.out.println(errors.hasErrors());
//
//            errors.getAllErrors().forEach(e ->{
//                System.out.println("------ Error code ------");
//                Arrays.stream(e.getCodes()).forEach(System.out::println);
//                System.out.println(e.getDefaultMessage());
//            });
//        }
    }
}
