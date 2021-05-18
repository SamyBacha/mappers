import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {


  @GetMapping
  public ResponseEntity<String> get(String msg) {
    System.out.println("Message : " + msg);
    return new ResponseEntity<>("okok", HttpStatus.OK);
  }

  @MessageMapping("/chat")
  @SendTo("/topic/messages")
  public Message send(Message message) throws Exception {
    message.setTime(LocalDateTime.now());
    return message;
  }
}
