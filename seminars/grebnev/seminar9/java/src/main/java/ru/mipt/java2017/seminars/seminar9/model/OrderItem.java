package ru.mipt.java2017.seminars.seminar9.model;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    public OrderItem()
    {
    }

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder order;

    @ManyToOne
    @JoinColumn(name = "good_id")
    private Good good;

    private int quantity;

    public OrderItem(CustomerOrder order, Good good, int quantity) {
        this.order = order;
        this.good = good;
        this.quantity = quantity;
    }

    public CustomerOrder getOrder() {
        return order;
    }

    public void setOrder(CustomerOrder order) {
        this.order = order;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
