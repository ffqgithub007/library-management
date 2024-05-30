package com.net.library.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookCard {
    private  long id;
    private String cardId;
    private String name;
    private  String lendFlag;
}
