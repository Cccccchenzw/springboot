package czw.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String test(String string){
        return string + "czw!!!";
    }
}
