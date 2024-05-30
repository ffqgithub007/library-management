package com.net.library.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookShelf {
    private long id;
    private String ISBN;
    private String shelf;
    private String bookPosition;
}
