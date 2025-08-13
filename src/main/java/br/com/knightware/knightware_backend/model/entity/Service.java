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
@Table(name = "TB_SERVICES")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICE", nullable = false)
    private Long serviceId;
    @Column(name = "NM_NAME", nullable = false)
    private String serviceName;
    @Column(name = "CD_CODE", nullable = false)
    private Long serviceCode;
    @Column(name = "TX_DESCRIPTON", nullable = false)
    private String description;
    @Column(name = "DC_BASE_VALUE", nullable = true)
    private Double baseValue;
}
