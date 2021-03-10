package com.bip.dockerws.myrestapi.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("Book")
public class Book implements Serializable {

    private String id;
    private String name;
    private String author;
}
