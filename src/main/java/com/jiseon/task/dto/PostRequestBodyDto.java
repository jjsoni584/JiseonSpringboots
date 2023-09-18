package com.jiseon.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PostRequestBodyDto {
    private String name;
    private String category;
    private String text;
    private String date;
    private String time;

    
}
