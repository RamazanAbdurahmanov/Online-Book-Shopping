package az.developia.bookshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message="Boş qoymaq olmaz")
	@Size(min=2, message="Minimum 2 simvol yazila biler")
	@Size(max=30, message="maksimum 30 simvol yazila biler")
	private String name;
	private String description;
	private Double price;
	private String author;
	private Integer pageCount;
	private String image;
	private String username;

}
