package com.jiseon.task.Controller;

import javax.swing.Spring;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jiseon.task.dto.PostRequestBodyDto;



@RestController
@RequestMapping("/api/v1")

public class MainController {
   @GetMapping("/task/{taskNmuber}")
   public String getPathVariable(
    @PathVariable("taskNumber") String taskNumber
   ){
    return "parameter value : " + taskNumber;
   }

   @PostMapping("task")
   public String postMethod(
    @RequestBody PostRequestBodyDto requestBody
   ){
    return "일정이름 :"+ requestBody.getName()+ "카테고리 :"+requestBody.getCategory() +
    "설명 :" + requestBody.getText()+"날짜 :" + requestBody.getDate()+"시간 : "+ requestBody.getTime();
   }
   @PatchMapping("/task/{taskNmuber}")
   public String validation(
    @RequestBody PostRequestBodyDto requestBody
    ) { return "일정이름 : "+requestBody.getName() + "카테고리 :"+requestBody.getCategory() +
        "설명 : "+requestBody.getText()+ "날짜 : "+ requestBody.getDate()+ "시간 : " + requestBody.getTime();
   }
   @DeleteMapping("/task/{taskNmuber}")
   public String deleteMethod(){
    return "This method is Delete method";
   }
}