package com.net.library.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookBorrow {
    private Long id;
    private String ISBN;
    private String userId;
    private String userName;
    private String bookName;
    private String sex;
    private String phone;
    private String day;//借书天数

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date borrowDate;//借书时间

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date returnDate;//还书时间

    private String borrowIfFlag;//借书标识
    private String returnIfFlag;//还书标识
    private String status;//状态
    private String delFlag;
}
