package hello.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

@ContextConfiguration
public class AutoWiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }


    static class TestBean{

        //@Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("noBean = "+ noBean1);
        }

        //@Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean = "+ noBean2);
        }

        //@Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean = "+ noBean3);
        }

    }
}
