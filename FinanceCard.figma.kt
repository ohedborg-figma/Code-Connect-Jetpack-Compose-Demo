import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Cases
import androidx.compose.material.icons.rounded.Wallet
import kotlin.String

@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=5-94&t=V01x1D5VBXtUAEwt-4")
public class FinanceCardDoc {

    @FigmaProperty(FigmaType.Text, "name")
    public val name: String = "My Business"

    // Correctly mapping the Icon to Figma's instance
    @FigmaProperty(FigmaType.Instance, "icon")
    val icon: @Composable () -> Unit = {}

    @Composable
    fun FinanceItem(index: Int) {
        val finance = financeList[index]
        var lastPaddingEnd = 0.dp
        if (index == financeList.size - 1) {
            lastPaddingEnd = 16.dp
        }

        Box(modifier = Modifier.padding(start = 16.dp, end = lastPaddingEnd)) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp)) // Rounded corners for the card
                    .background(Color.Black) // Card background color
                    .border(2.dp, LightOrange, RoundedCornerShape(16.dp)) // Add glowing border to card
                    .size(131.dp)
                    .clickable {}
                    .padding(13.dp), // Padding inside the card
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Icon Box with glowing orange background and icon
                Box(
                    modifier = Modifier
                        .clip(CircleShape) // Circular background for the icon
                        .background(LightOrange) // Orange background for the icon
                        .padding(10.dp)
                        .border(
                            2.dp,
                            LightOrange.copy(alpha = 0.7f), // Light orange glowing border
                            CircleShape
                        ) // Border with glowing effect
                ) {
                    Icon(
                        imageVector = finance.icon, // Icon from financeList
                        contentDescription = finance.name,
                        tint = Color.White, // Set the icon color to white for contrast
                        modifier = Modifier.size(28.dp) // Size of the icon
                    )
                }
                // Finance name with glowing effect
                Text(
                    text = finance.name,
                    fontSize = 14.sp, // Slightly increased font size for readability
                    color = LightOrange, // Text color consistent with theme
                    fontWeight = FontWeight.Bold,
                    fontFamily = departureMonoFontFamily, // Use the sci-fi font
                    style = TextStyle(
                        shadow = Shadow(
                            color = LightOrange,
                            blurRadius = 10f // Glowing effect for text
                        )
                    )
                )
            }
        }
    }
}
