package com.yagorocha.project.config;


import com.yagorocha.project.entities.Order;
import com.yagorocha.project.entities.User;
import com.yagorocha.project.entities.enums.OrderStatus;
import com.yagorocha.project.repositories.OrderRepository;
import com.yagorocha.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria brown", "maria@gmail.com", "988", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977", "123456");

        Order O1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order O2 = new Order(null, Instant.parse("2019-07-21t03:42:10Z"), OrderStatus.WAITING_PAYMENT,  u2);
        Order O3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,  u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(O1, O2,  O3));
    }
}
