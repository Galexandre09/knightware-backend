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
@Table(name = "TB_ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDER", nullable = false)
    private Long OrderId;
    @Column(name = "TX_DESCRIPTION", nullable = true)
    private String description;
    @Column(name = "ID_CLIENT", nullable = false)
    @JoinColumn(name = "ID_CLIENT")
    private Long clientId;
    @Column(name = "NM_EQUIPAMENT", nullable = false)
    private String equipamentName;
    @Column(name = "DT_CONCLUSION_DATE", nullable = true)
    private LocalDateTime conclusionDate;
    @Column(name = "NR_SERIAL_NUMBER", nullable = true)
    private String serialNumber;
    @Column(name = "TX_ACCESSORIES", nullable = true)
    private String Accessories;
    @Column(name = "TX_PROBLEM_DESCRIPTION", nullable = false)
    private String problemDescription;
    @Column(name = "TX_DIAGNOSIS", nullable = true)
    private Long diagnosis;
    @Column(name = "ID_SERVICE_ORDER", nullable = false)
    private Long serviceOrderId;
}
