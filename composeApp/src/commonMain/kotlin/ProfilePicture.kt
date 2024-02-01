import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource

@Composable
fun ProfilePicture(
    modifier: Modifier = Modifier,
    imageUrl: String
) {
    KamelImage(
        asyncPainterResource(
            data = imageUrl
        ), contentDescription = null,
        modifier = modifier
            .size(52.dp)
            .clip(CircleShape)
            .border(width = 3.dp, shape = CircleShape, color = Color(0xff093B62))
    )
}