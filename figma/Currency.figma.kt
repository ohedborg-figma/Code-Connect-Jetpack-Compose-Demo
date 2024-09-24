import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import kotlin.String



@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=61-153&m=dev")
public class Currencydoc {
    @FigmaProperty(FigmaType.Text, "name")
    public val name: String = "USD"

    @FigmaProperty(FigmaType.Text, "buy")
    public val buy: String = "${'$ '}23.35"

    @FigmaProperty(FigmaType.Text, "sell")
    public val sell: String = "${'$ '}23.25"

    // Correctly mapping the Icon to Figma's instance
    @FigmaProperty(FigmaType.Instance, "icon")
    val icon: @Composable () -> Unit = {}

    @Composable
   public fun CurrencyItem(index: Int, width: Dp) {
        val currency = currencies[index]

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.width(width),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(LightOrange) // Orange background for icons
                        .padding(4.dp)
                ) {
                    Icon(
                        modifier = Modifier.size(18.dp),
                        imageVector = currency.icon,
                        contentDescription = currency.name,
                        tint = Color.Black // Use black tint for the icon
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(start = 10.dp),
                    text = currency.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = LightOrange, // Orange text for currency names
                    fontFamily = departureMonoFontFamily
                )
            }

            Text(
                modifier = Modifier
                    .width(width)
                    .padding(start = 10.dp),
                text = buy,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = LightOrange, // Orange text for buy prices
                textAlign = TextAlign.End,
                fontFamily = departureMonoFontFamily
            )

            Text(
                modifier = Modifier
                    .width(width)
                    .padding(start = 10.dp),
                text = sell,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = LightOrange, // Orange text for sell prices
                textAlign = TextAlign.End,
                fontFamily = departureMonoFontFamily
            )
        }
    }

