package Task03_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> {
    private Map<String, List<T>> mailBox = new MailBox();

    public Map<String, List<T>> getMailBox(){
        return mailBox;
    }

    @Override
    public void accept(Message<T> message) { //метод обработки сообщений
        String consumerTo = message.getTo();
        List<T> mess = mailBox.get(consumerTo);
        if(mess == null){
            mess = new ArrayList<T>();
        }
        mess.add(message.getContent());
        mailBox.put(consumerTo, mess);
    }
}