package com.example.MatchMaking.Models.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private Long id;
    private Float skill;
    long currentTimeMillis;


}
