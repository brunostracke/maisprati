package teste.endpoint;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Arrays.asList;
import teste.endpoint.util.DateUtil;
import teste.model.Student;


@RestController
@RequestMapping("student")
public class StudentEndpoint {
	@Autowired
	private DateUtil dateUtil;
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Student> listAll() {
		System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return asList(new Student ("Deku"), new Student ("Todoroki"));
	}
}
