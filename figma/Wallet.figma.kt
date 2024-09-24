import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import kotlin.String



@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=13-184&t=dkurWiqhwinevVX8-4")

public class WalletDoc {
    @FigmaProperty(FigmaType.Text, "balance")
    public val balance: String = "${'$'}13.37"

    @Composable
    public fun WalletSection() {
        fun WalletSection() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Black),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Column {
                // Apply Departure Mono font to the Wallet label
                Text(
                    text = "Wallet",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = LightOrange, // Set text color to light orange
                    fontFamily = departureMonoFontFamily, // Use the Departure Mono font
                )
                Spacer(modifier = Modifier.height(8.dp))
                // Apply Departure Mono font to the balance
                Text(
                    text = card.cardNumber,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.ExtraBold, // Make the amount stand out
                    color = Color.White, // Set the amount text color to white
                    fontFamily = departureMonoFontFamily, // Use the Departure Mono font
                )
            }

            // Search Icon Box
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .background(LightOrange) // Set background to light orange for contrast
                    .clickable {}
                    .padding(6.dp) // Add padding inside the search icon box
                    .width(40.dp)
                    .height(40.dp),
            ) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "Search",
                    tint = Black, // Set the icon tint to black for contrast
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                )
            }
        }
    }
}
