package hst.demo.spring5.hello;

import org.springframework.stereotype.Service;

/**
 * Created by Peter.Huang on 2020/9/26 9:09
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
