package balancing.domain;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/query")
    public ResponseEntity<String> start(){
        try {
            Thread.sleep(100);
            return new ResponseEntity<>("", HttpStatus.OK);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new ResponseEntity<String>("", HttpStatus.valueOf(500));
        }
    }

    @GetMapping(value = "/stop")
    public void stop(){
        System.exit(0);
    }
}
