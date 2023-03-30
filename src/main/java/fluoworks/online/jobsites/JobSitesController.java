package fluoworks.online.jobsites;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/getJobSites")
public class JobSitesController {

    JobSItes jobSItes = new JobSItes( 1, "FFB", "Banana 10", "Bananatown", "Securitas");


    @GetMapping
    public JobSItes getJobSItes() {
        return jobSItes;
    }
}
