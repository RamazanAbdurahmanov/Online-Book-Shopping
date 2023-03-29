package az.developia.bookshopping.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message="Boş qoymaq olmaz")
	@Size(min=2, message="Minimum 2 simvol yazila biler")
	@Size(max=30, message="maksimum 30 simvol yazila biler")
	
	private String name;
	@NotEmpty(message="Boş qoymaq olmaz")
	@Size(min=2, message="Minimum 2 simvol yazila biler")
	@Size(max=30, message="maksimum 200 simvol yazila biler")
	private String address;
	
	@Pattern(regexp ="((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}",message="Telefonu  düzgün formatda yazın.Məsələn :000-000-00-00" )
	@Column(columnDefinition="VARCHAR(20)")
	@Size(max=20, message="maksimum 20 simvol yazila biler")
	private String phone;
	
	@Email(regexp="[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$",message="Emaili düzgün formada yazın!")
	@Column(columnDefinition="VARCHAR(100)")
	@Size(max=100, message="maksimum 100 simvol yazila biler")
	private String email;
	
	
	@Column(columnDefinition="VARCHAR(100)")
	@Size(max=100, message="maksimum 100 simvol yazila biler")
	private String note;
	

}
