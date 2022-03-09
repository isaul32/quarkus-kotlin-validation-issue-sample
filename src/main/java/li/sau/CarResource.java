package li.sau;

import javax.validation.Valid;
import javax.validation.groups.ConvertGroup;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/car")
public class CarResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String addCar(
            @Valid @ConvertGroup(to = CarValidationGroups.Post.class) Car car
    ) {
        return "OK";
    }
}
