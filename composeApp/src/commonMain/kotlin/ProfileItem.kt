import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BirthdayItem(
    modifier: Modifier = Modifier,
    name: String,
    imageUrl: String,
    onClick: () -> Unit
) {
    Column(modifier = modifier.padding(top = 12.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() },
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfilePicture(imageUrl = imageUrl)
            Text(
                text = name,
                fontSize = 16.sp,
                color = Color(0xff093B62),
                fontWeight = FontWeight.Normal,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
        Spacer(modifier = Modifier
            .padding(top = 12.dp)
            .background(Color(0xff696969))
            .fillMaxWidth()
            .height(0.5.dp))
    }
}

@Composable
fun BirthdayVerticalItem(
    modifier: Modifier = Modifier,
    name: String,
    imageUrl: String,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .width(85.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfilePicture(imageUrl = imageUrl, modifier = Modifier.size(82.dp))
        Text(
            text = name,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color(0xff093B62),
            fontWeight = FontWeight.Normal,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
    }
}