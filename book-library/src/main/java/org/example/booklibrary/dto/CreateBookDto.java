package org.example.booklibrary.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateBookDto {
    @NotEmpty(message = "Title cannot be empty")
    private String title;
    @NotEmpty(message = "Author cannot be empty")
    private String author;
    @Min(value = 1000, message = "Published year must be a valid year")
    private Integer publishedYear;
    private String genre;
}