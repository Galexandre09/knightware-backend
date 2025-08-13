package br.com.knightware.knightware_backend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_SERVICE_ORDERS")
public class ServiceOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICE_ORDER", nullable = false)
    private Long serviceOrderId;
    @Column(name = "DT_ARRIVAL_DATE", nullable = false)
    private LocalDateTime arrivalDate;
    @Column(name = "DT_DISPATCH_DATE", nullable = true)
    private LocalDateTime dispatchDate;
    @Column(name = "ID_CLIENT", nullable = false)
    @JoinColumn(name = "ID_CLIENT")
    private Long clientId;
    @Column(name = "TX_OBSERVATION", nullable = true)
    private String observation;
    @Column(name = "ID_STATUS", nullable = false)
    private Long status;
    @Column(name = "DC_TOTAL_VALUE", nullable = true)
    private Double totalValue;
}
