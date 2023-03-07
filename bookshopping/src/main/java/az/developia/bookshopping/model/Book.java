package az.developia.bookshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
	@Column(columnDefinition = "VARCHAR(200)")
	@Size(max=300,message="Maksiumum 200 simvol yaza bilersiz")
	private String description;
	@Min(value=0,message="Minimum 0 qiymet vermek olar")
	@Max(value=1000,message="Maksimum 1000 qiymet vermek olar")
    @NotNull(message="boş qoymaq olmaz!")
	private Double price;
	private String author;
	private Integer pageCount;
	private String image;
	private String username;

}
  