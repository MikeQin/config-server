package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {
	
	@Value("${CF_INSTANCE_GUID:CF_INSTANCE_GUID_NA default}")
	private String cfInstanceGuid;

	@Value("${app.name:NA default}")
	private String name;

	@GetMapping("/")
	public ResponseEntity<String> getInfo() {
		String info = "app.name: " + name + ", guid: " + cfInstanceGuid;
		return ResponseEntity.ok(info);
	}
	
	@Value("${message:NA default}")
	private String message;	
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
}
