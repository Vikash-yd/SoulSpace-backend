package com.SoulSpace.backend.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lounges{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    private String description;

    private String icon;

    private String bannerImage;

    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "community_lounge_id")
    @JsonBackReference
    private CommunityLounge communityLounge;
}