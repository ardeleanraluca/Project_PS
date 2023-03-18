package com.demo.project.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StandardUserModel extends UserAccountModel {
    @NotEmpty
    private String dateOfBirth;

    @NotEmpty
    private String city;

    @NotEmpty
    private String county;
}
