package a99fallen.projects.events.web.command;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Data @Builder @AllArgsConstructor  @RequiredArgsConstructor
public class EditTaskCommand {
//    @NotNull
    @Size(min = 3, max = 64)
    private String name;
//    @NotNull
    @Size(min = 3, max = 160)
    private String description;
}
