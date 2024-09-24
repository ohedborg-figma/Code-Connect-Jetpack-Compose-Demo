import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaChildren
import com.figma.code.connect.FigmaConnect

@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=2161-343&m=dev")

    // Use @FigmaChildren to accept a composable for each card
    @FigmaChildren("card")
    val card: @Composable () -> Unit = {}

    @Composable
    fun CardsSection() {
        LazyRow {
            items(cards.size) { index ->
                CardItem(index)
            }
            card
        }
    }