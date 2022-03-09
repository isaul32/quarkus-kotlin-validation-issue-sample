package li.sau

import javax.validation.Valid
import javax.validation.groups.ConvertGroup
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/book")
class BookResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun addBook(@Valid @ConvertGroup(to = BookValidationGroups.Post::class) book: Book): String {
        return "OK"
    }
}