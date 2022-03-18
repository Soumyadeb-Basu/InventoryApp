package com.webapp.InventoryProject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.webapp.InventoryProject.entities.Order;
import com.webapp.InventoryProject.repos.OrderRepo;
import com.webapp.InventoryProject.services.OrderService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class OrderServiceMockitoTest {
	@InjectMocks
	OrderService orderServiceMock;

	@Mock
	OrderRepo orderRepositoryMock;

	@Test
	public void getAllOrderDetailsMockitoTest() {
		List<Order> list = new ArrayList<Order>();

		Order order1 = new Order(1,"25/12/1999",2,3);
		Order order2 = new Order(2,"12/07/2021",3,2);

		list.add(order1);
		list.add(order2);

		when(orderRepositoryMock.findAll()).thenReturn(list);

		List<Order> orderList = orderServiceMock.getOrders();

		assertThat(orderList.size()).isEqualTo(2);

		assertThat(orderList.get(0).getC_id()).isEqualTo(order1.getC_id());

		assertThat(orderList.get(0).getP_id()).isEqualTo(order1.getP_id());
	}
}