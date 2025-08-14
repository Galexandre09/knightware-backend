package br.com.knightware.knightware_backend.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    @JsonProperty("clientId")
    private Long clientId;
    @JsonProperty("clientName")
    private String name;
    @JsonProperty("phoneNumber")
    private String phone;
    @JsonProperty("clienaddress")
    private String address;
    @JsonProperty("clientEmail")
    private String email;
}
