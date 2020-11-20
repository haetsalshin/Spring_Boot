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

/*원래 int형은 null값을 허용하지 않는데 @Column에 nullable=true로 하면
* 널 값을 허용하게 테이블을 만든다*/
    @Column(nullable = true)
    private int price;

}