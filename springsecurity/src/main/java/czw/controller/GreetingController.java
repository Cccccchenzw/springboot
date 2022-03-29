package czw.controller;

import czw.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
//    @Autowired
//    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/greet")
//    群聊
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws  Exception{
        return message;
    }
}

//    点对点-undo
//    @MessageMapping("/greet")
//    public void greeting(Message message) throws  Exception{
//        simpMessagingTemplate.convertAndSend("/topic/greetings",message);
//    }
//}