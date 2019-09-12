package br.com.projetodevdojo.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetodevdojo.model.Student;
import br.com.projetodevdojo.util.DateUtil;

import static java.util.Arrays.asList;

import java.time.LocalDateTime;

@RestController
@RequestMapping("student")
public class StudentEndPoint {
	@Autowired
	private DateUtil dateUtil;
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<Student> listAll() {
		System.out.println(dateUtil.formatLocalDateTimeToDatabasesStyle(LocalDateTime.now()));
		return asList(new Student("othan"), new Student("pietro"));
	}

}
