package com.example.ipl.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Match
{
    private long id;
    private String city;
    private LocalDate date;
    private String player_of_match;
    private String venue;
    private String neutral_venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;
    private String eliminator;
    private String method;
    private String umpire1;
    private String umpire2;
}
