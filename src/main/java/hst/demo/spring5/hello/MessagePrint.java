package hst.demo.spring5.hello;
import org.springframework.stereotype.Component;

/**
 * Created by Peter.Huang on 2020/9/26 9:11
 */
@Component
public class MessagePrint {
    final private MessageService messageService;

    public MessagePrint(MessageService messageService) {
        this.messageService = messageService;
    }
    public void printMessage(){
        System.out.println(messageService.getMessage());
    }
}
