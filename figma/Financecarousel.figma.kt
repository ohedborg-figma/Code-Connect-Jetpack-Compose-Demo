import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaConnect

@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=2164-629&m=dev")
public class fincard {

    // Correctly mapping the Icon to Figma's instance
    @FigmaChildren("fincard")
    val fincard: @Composable () -> Unit = {}

    @Composable
    fun FinanceSection() {
        Column {
            Text(
                text = "Finance",
                fontSize = 20.sp,
                color = LightOrange, // Consistent theme color
                fontWeight = FontWeight.Bold,
                fontFamily = departureMonoFontFamily, // Use the custom font
                modifier = Modifier.padding(16.dp),
            )
            LazyRow {
                items(financeList.size) {
                    FinanceItem(it)

                }
            }
        }
        fincard()

    }
}