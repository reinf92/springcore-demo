package me.reinf.demo.chapter8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class DataBindRunner implements ApplicationRunner {

//    @Autowired
//    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        //WebConversionService
//        System.out.println(conversionService.getClass().toString());
//        //WebConversionService가 등록한 Converter와 Formmatter
//        System.out.println(conversionService);
    }
}
