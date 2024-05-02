package jpabook.jpashop.Repository.order.simplequery;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderSimpleQueryDto {
        private Long orderId;
        private String name;
        private LocalDateTime orderDate;
        private OrderStatus orderStatus;
        private Address address;

//        public OrderSimpleQueryDto(Long orderId, String name, LocalDateTime orderDate, OrderStatus status, Address address){
//            this.orderId = orderId;
//            this.name = name; //Lazy 초기화
//            this.orderDate = orderDate;
//            this.orderStatus = status;
//            this.address = address; //Lazy 초기화
//        }
    }

