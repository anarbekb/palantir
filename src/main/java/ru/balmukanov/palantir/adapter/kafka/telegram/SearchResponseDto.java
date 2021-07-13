package ru.balmukanov.palantir.adapter.kafka.telegram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResponseDto {
    protected String query;
    protected Map<String, String> finds;
}
