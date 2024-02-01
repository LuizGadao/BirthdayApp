import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BirthdayListScreen(
    modifier: Modifier = Modifier,
    names: Map<String, Array<String>>,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {

        val gadaProfilePicture = "https://avatars.githubusercontent.com/u/3384999"

        item {
            HeaderSectionGray(
                text = "Aniversariantes do dia"
            )
        }

        item {
            val values = listOf(
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva Sauro",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
                "Luiz Carlos dos Anjos Silva",
                "Ana Carla da Silva",
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                items(values) {
                    BirthdayVerticalItem(name = it,
                        imageUrl = gadaProfilePicture,
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(vertical = 16.dp))
                }
            }
        }

        item {
            HeaderSectionGray(
                text = "Aniversariantes do mês"
            )
        }

        names.forEach { (day, names) ->
            stickyHeader {
                HeaderSectionBlue(text = day)
            }
            items(names) {
                BirthdayItem(name = it,
                    imageUrl = gadaProfilePicture,
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 16.dp))
            }
        }
    }
}