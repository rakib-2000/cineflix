package com.rakx07.cineflix.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer movieId;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's title!")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's director name!")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's studio name!")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's release year!")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's poster!")
    private String poster;
}
