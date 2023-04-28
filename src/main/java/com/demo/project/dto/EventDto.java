package com.demo.project.dto;

import com.demo.project.entity.EventEntity;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class EventDto {

    private Long id;

    @NotEmpty
    private String name;

    private String description;
    @NotEmpty
    private String category;
    @NotEmpty
    private String date;
    private String hour;

    private Long organizerId;
    private Long locationId;

    private List<TicketDto> tickets;

    public EventDto(EventEntity eventEntity) {
        this.id = eventEntity.getId();
        this.name = eventEntity.getName();
        this.description = eventEntity.getDescription();
        this.category = eventEntity.getCategory();
        this.date = eventEntity.getDate();
        this.hour = eventEntity.getHour();
        this.organizerId = eventEntity.getOrganizer().getId();
        this.locationId = eventEntity.getLocation().getId();
        this.tickets = eventEntity.getTickets().stream().map(TicketDto::new).collect(Collectors.toList());

    }

}
