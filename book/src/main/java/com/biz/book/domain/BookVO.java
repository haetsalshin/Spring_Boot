package com.biz.book.domain;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="tbl_book")
/**/
public class BookVO {

    /*@Id : primary key명시
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;


    @Column(columnDefinition = "VARCHAR(125)")
    private String title;

    @Column(length = 30)
    private String author;

    @Column(length = 125)
    private String comp;


    private int price;

}