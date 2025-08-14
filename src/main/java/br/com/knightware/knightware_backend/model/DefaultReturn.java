package br.com.knightware.knightware_backend.model;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DefaultReturn<T> {
    private T data;
    private List<String> mensagem;
}
