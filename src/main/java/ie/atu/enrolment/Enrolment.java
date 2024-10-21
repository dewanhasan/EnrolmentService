package ie.atu.enrolment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Enrolment {

    @Id
    private String enrollmentId;

    private String studentName;

    private String courseCode;

    private String enrollmentDate;

    private String studentId;
}
