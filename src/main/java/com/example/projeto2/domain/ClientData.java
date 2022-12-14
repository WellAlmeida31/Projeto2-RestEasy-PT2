package com.example.projeto2.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ClientData {
    private Long id;
    private String name;
    private String age;
}
