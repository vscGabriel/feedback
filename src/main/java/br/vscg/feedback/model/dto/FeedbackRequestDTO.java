package br.vscg.feedback.model.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FeedbackRequestDTO {

     private String description;

     @NotNull
     @Min(0)
     @Max(10)
     private Integer note;

}
