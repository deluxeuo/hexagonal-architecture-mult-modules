package br.com.realstate.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RealStateDto {

    private Long id;

    private String title;

    private String description;

    private Double price;
}