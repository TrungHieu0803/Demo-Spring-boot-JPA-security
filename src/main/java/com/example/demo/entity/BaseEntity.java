package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Admin
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass //các class kế thừa sẽ có các column thuộc tính ở dưới
public abstract class BaseEntity {
    @Id //primary key, NOT NULL luôn
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Tự tăng
    private Long id;

    @Column(name = "createdby") //các column trong tables, cần thêm anotation này
    private String createdBy;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "modifedby")
    private String modifiedBy;
    @Column(name = "modifieddate")
    private Date modifiedDate;

}
