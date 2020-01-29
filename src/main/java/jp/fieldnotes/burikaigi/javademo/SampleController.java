package jp.fieldnotes.burikaigi.javademo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/buri")
    public String sample() {
        return "sample";
    }
}