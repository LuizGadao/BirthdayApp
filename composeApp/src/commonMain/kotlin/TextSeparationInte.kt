import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextSeparationItem(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    textSize: TextUnit
) {
    Row(modifier = modifier) {
        Text(
            text = text,
            fontSize = textSize,
            color = color,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Composable
fun HeaderSectionBlue(
    modifier: Modifier = Modifier,
    text: String,
) {
    TextSeparationItem(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xff093B62)),
        text = text,
        color = Color.White,
        textSize = 18.sp
    )
}

@Composable
fun HeaderSectionGray(
    modifier: Modifier = Modifier,
    text: String,
) {
    TextSeparationItem(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xffEAEAEA)),
        text = text,
        textSize = 18.sp,
        color = Color(0xff093B62)
    )
}
