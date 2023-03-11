package az.developia.bookshopping.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class User {
	@Size(min = 1, message = "İstifadəçi adı minimum 1 simvol ola bilər")
	@Size(max = 30, message = "İstifadəçi adı maksimum 30 simvol ola bilər")
	@NotEmpty(message = "Boş qoymaq olmaz")
	private String username;

	@Size(min = 1, message = "Şifrə  minimum 1 simvol ola bilər")
	@Size(max = 30, message = "Şifrə maksimum 30 simvol ola bilər")
	@NotEmpty(message = "Boş qoymaq olmaz")
	private String password;

}
