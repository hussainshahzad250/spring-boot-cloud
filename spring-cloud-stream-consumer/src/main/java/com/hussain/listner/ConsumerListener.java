package com.hussain.listner;

import com.hussain.response.Book;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @StreamListener("input")
    public void consumeMessage(Book book) {
        System.out.println("Done" + book);
    }
}
