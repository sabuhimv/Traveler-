package org.example.traveler.dtos.guideDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuidePersonalDto {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String photoUrl;
    private String instagram;
    private String facebook;
    private String twitter;
    private String linkedin;
}
