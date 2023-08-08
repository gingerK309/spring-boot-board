package com.board.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Getter
@AllArgsConstructor
public class MessageDTO {
    private String message;
    private String redirect;
    private RequestMethod method;
}
