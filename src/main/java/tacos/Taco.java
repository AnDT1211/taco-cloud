package tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Taco {
	@NotNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;
	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private List<String> ingredients;
}
