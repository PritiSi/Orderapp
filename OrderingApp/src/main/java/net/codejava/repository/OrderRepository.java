package net.codejava.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.codejava.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    public Order findByOrderId(int orderId);
}
