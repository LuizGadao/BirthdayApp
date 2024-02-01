import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val greeting = remember { Greeting().greet() }
        /*Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    //Image(painterResource("compose-multiplatform.xml"), null)
                    KamelImage(
                        asyncPainterResource(
                            data = "https://avatars.githubusercontent.com/u/3384999"
                        ), contentDescription = null
                    )
                    Text("Compose: $greeting")
                }
            }
        }*/
        val name = "Luiz Carlos Gonçalves dos Anjos da Silva Salro - The King of the bugs"
        val names = Array(7) {
            name
        }

        val daysAndBirthdays = mapOf(
            "Dia 3" to names,
            "Dia 7" to names,
            "Dia 21" to names,
            "Dia 17" to names,
        )

        BirthdayListScreen(
            names = daysAndBirthdays,
            modifier = Modifier.fillMaxSize()
        )
    }
}