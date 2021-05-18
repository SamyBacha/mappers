package amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class App extends SpringBootServletInitializer {

//  private static final boolean NON_DURABLE = false;
//  private static final String QUEUE_IN_BACK = "in_back";
//  private static final String QUEUE_OUT_BACK = "out_back";
//  private static final String QUEUE_IN_FRONT = "in_front";
//  private static final String QUEUE_OUT_FRONT = "out_front";

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

//  @Bean
//  public Queue queueInBack() {
//    return new Queue(QUEUE_IN_BACK, NON_DURABLE);
//  }
//  @Bean
//  public Queue queueInFront() {
//    return new Queue(QUEUE_IN_FRONT, NON_DURABLE);
//  }
//  @Bean
//  public Queue queueOutBack() {
//    return new Queue(QUEUE_OUT_BACK, NON_DURABLE);
//  }
//  @Bean
//  public Queue queueOutFront() {
//    return new Queue(QUEUE_OUT_FRONT, NON_DURABLE);
//  }
//
//  @RabbitListener(queues = QUEUE_IN_BACK)
//  public void listen(String in) {
//    System.out.println("Message read from myQueue : " + in);
//  }
//
//
//  @Bean
//  public ApplicationRunner runner(RabbitTemplate template) {
//    return args -> template.convertAndSend(QUEUE_OUT_BACK, "Hello, world!");
//  }

}