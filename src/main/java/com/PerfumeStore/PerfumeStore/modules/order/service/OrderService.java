package com.PerfumeStore.PerfumeStore.modules.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PerfumeStore.PerfumeStore.modules.order.domain.Order;
import com.PerfumeStore.PerfumeStore.modules.order.dto.OrderDto;
import com.PerfumeStore.PerfumeStore.modules.order.mapper.OrderMapper;
import com.PerfumeStore.PerfumeStore.modules.order.repository.OrderRepository;
import com.PerfumeStore.PerfumeStore.shared.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    public List<OrderDto> getAll() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.toDto(orders);
    }

    public OrderDto getById(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Order.class.getSimpleName(), id));
        return orderMapper.toDto(order);
    }

    public Order getReferenceById(Long id) {
        return orderRepository.getReferenceById(id);
    }

    public OrderDto save(OrderDto dto) {
        Order orders = orderMapper.toEntity(dto);
        Order savedOrders = orderRepository.save(orders);
        return orderMapper.toDto(savedOrders);
    }

    public void update(Long id, OrderDto dto) {
        Order orders = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Order.class.getSimpleName(), id));
        Order entity = orderMapper.updateEntityFromDto(dto, orders);
        orderRepository.save(entity);
    }

    public void delete(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(Order.class.getSimpleName(), id));
        orderRepository.delete(order);
    }
}
