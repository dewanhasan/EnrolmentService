package ie.atu.enrolment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrolmentController {

    @PostMapping("/product")
    public String enrolmenDetails(@RequestBody Enrolment enrolment) {
        String enrolmentMessage= String.format("Enrolment for student: %s, studentId: 5s has been successful ", enrolment.getStudentName(), enrolment.getStudentId());
        return enrolmentMessage;
    }
}
