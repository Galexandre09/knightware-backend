package br.com.knightware.knightware_backend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_SERVICES_PER_ORDER")
public class ServicesPerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICE_PER_ORDER", nullable = false)
    private Long serviceOrderId;
    @Column(name = "CD_SERVICE", nullable = false)
    @JoinColumn(name = "CD_CODE")
    private Long serviceCode;
    @Column(name = "ID_ORDER", nullable = false)
    @JoinColumn(name = "ID_ORDER")
    private Long orderId;
    @Column(name = "NUM_SERVICE_QUANTITY", nullable = false)
    private Long serviceQuantity;
}
