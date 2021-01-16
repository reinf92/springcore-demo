package me.reinf.demo.chapter7;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Member.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Member member = (Member)o;
        if (member.getId() == null) {
            errors.rejectValue("id", "NotEmpty", "필수요소");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty", "필수요소");
    }
}
