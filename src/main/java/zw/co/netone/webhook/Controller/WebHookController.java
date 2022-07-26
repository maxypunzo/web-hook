package zw.co.netone.webhook.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class WebHookController {

    @PostMapping
    public ResponseEntity<String> print(@RequestBody String requestBody) {
        System.out.println(">>>>>>WebHook >>>>" + requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
}
