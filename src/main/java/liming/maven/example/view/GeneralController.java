package liming.maven.example.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deppon.test04.dao.StudentMapper;
import com.deppon.test04.entity.StudentEntity;

@Controller  
public class GeneralController {
	  @Autowired  
	  private StudentMapper studentMapper;  
	  
	  @RequestMapping(value={"index.do","hhh.do"})  
	    public void index_jsp(Model model){  
	        StudentEntity  entity = studentMapper.getStudent("123456");
	        model.addAttribute("liming2", entity.getStudentName());  
	        model.addAttribute("liming", entity.getStudentName());  
	        System.out.println("index.jsp"); 
	        
	      
	    }  
	  
	  
	  @RequestMapping(value="/inde.do")  
	    public void index_jsp2(Model model){  
	        StudentEntity  entity = studentMapper.getStudent("123456");
	        model.addAttribute("liming2", entity.getStudentName());  
	        model.addAttribute("liming", entity.getStudentName());  
	        System.out.println("index.jsp");  
	    }  
	  
	  
	  
	  @RequestMapping(value="{aaa}/index.do")  
	    public void index_jsp4(@PathVariable String aaa){  
	        StudentEntity  entity = studentMapper.getStudent("123456");
	        System.out.println("index.jsp");  
	    }  
	  
	  @RequestMapping(value="/{day}")  
	    public void index_jsp3(@PathVariable  String day){  
		    System.out.println(day);
	        StudentEntity  entity = studentMapper.getStudent("123456");
	        System.out.println("index.jsp");  
	    }  
}
