package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity // Đánh dấu đây là table trong db
@Data // lombok giúp generate các hàm constructor, get, set v.v.
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id //Đánh dấu là primary key
    @GeneratedValue // Giúp tự động tăng
    private Long id;

    @Column(name = "city")
    private String city;
    @Column(name = "provin")
    private String province;
    public Address(String city,String province){
        this.city=city;
        this.province=province;
    }
    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (Person) (1 địa điểm có nhiều người ở)
    // MapopedBy trỏ tới tên biến Address ở trong Person.
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<Person> persons;
}