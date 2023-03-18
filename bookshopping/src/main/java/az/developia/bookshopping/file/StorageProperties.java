package az.developia.bookshopping.file;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("storage")
@Setter
@Getter
public class StorageProperties {
	private String location = "upload-dir-book-shopping-spring-ajax";

}
