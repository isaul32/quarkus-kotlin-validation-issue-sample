package li.sau

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Null

class Book {

    @Null(groups = [BookValidationGroups.Post::class])
    @NotNull(groups = [BookValidationGroups.Put::class])
    var id: Long? = null

    @NotBlank
    var title: String? = null

}
