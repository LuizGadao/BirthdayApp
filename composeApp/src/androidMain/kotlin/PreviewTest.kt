import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun TestPreview() {
    Box(modifier = Modifier
        .size(200.dp)
        .clip(CircleShape)
        .background(Color.Red))
}

@Preview
@Composable
fun HeaderSectionPreview() {
    HeaderSectionBlue(
        text = "Dia 31"
    )
}

@Preview
@Composable
fun HeaderSectionGrayPreview() {
    HeaderSectionGray(
        text = "Dia 31"
    )
}