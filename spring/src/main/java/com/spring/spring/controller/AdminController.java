import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.model.Admin;
import com.spring.spring.model.User;


@RestController
@RequestMapping("/api/v1")
public class AdminController {
	
	@GetMapping("/admin")
    public String getAdmin() {
        return "New Admin";
    }
	
	@PostMapping("/admin/data")
    public String postAdminData(@RequestBody String admin) {
        return admin;
    }
	
}
