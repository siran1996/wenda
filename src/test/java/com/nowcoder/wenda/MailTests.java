package com.nowcoder.wenda;

import com.nowcoder.wenda.async.EventModel;
import com.nowcoder.wenda.async.EventProducer;
import com.nowcoder.wenda.async.EventType;
import com.nowcoder.wenda.util.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTests {

    @Autowired
    EventProducer eventProducer;

    @Test
    public void sendSimpleMail() {
        eventProducer.fireEvent(new EventModel(EventType.LOGIN)
                .setExt("username", "12").setExt("email", "527916897@qq.com")
                .setActorId(12));

    }
}