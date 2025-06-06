package sorfware.example.sorfware.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sorfware.example.sorfware.model.entity.Message;
import sorfware.example.sorfware.repository.MessageRepository;

import java.util.List;

@Service
public interface MessageService {

    public Message save(Message message);

    public List<Message> getAllMessages();

    List<Message> findMessageByKeyword(String keyword);

    /**
     * Usecase 3.1: Lịch sử trò chuyện
     * U3.2: Hiển thị tin nhắn cũ
     * service lấy ra danh sách tin nhắn bằng id người gửi và id người nhận*/
    List<Message> getMessageHistory(String chatId);


}
