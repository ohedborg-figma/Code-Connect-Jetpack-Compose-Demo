import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import com.example.bankingexample.ui.theme.Black
import com.example.bankingexample.ui.theme.LightOrange

@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=2-228&t=IUfdtgRaXGWfNX2q-4")
class CardDoc {

    // Define properties for the card
    @FigmaProperty(FigmaType.Text, "balance")
    var balance: String = "${'$'}13.37"

    @FigmaProperty(FigmaType.Text, "cardNumber")
    var cardNumber: String = "1234 5678 9012 3456"

    @FigmaProperty(FigmaType.Text, "cardType")
    var cardType: String = "VISA"

    @Composable
    fun CardItem(index: Int) {
        val card = cards[index]

        Box(
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(15.dp)) // Rounded corners
                .background(Black)
                .border(
                    width = 3.dp,
                    color = LightOrange, // Light orange border
                    shape = RoundedCornerShape(15.dp) // Match the border shape to the clipping shape
                )
                .width(250.dp)
                .height(160.dp)
                .padding(12.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(8.dp)
            ) {
                // Card type
                Text(
                    text = cardType,
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = LightOrange,
                        shadow = Shadow(
                            color = LightOrange,
                            blurRadius = 15f // Subtle glow effect
                        )
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Card number
                Text(
                    text = cardNumber,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = LightOrange,
                        shadow = Shadow(
                            color = LightOrange,
                            blurRadius = 15f // Subtle glow effect
                        )
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Card balance
                Text(
                    text = balance,
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White, // White balance for contrast
                        shadow = Shadow(
                            color = LightOrange,
                            blurRadius = 15f // Subtle glow effect
                        )
                    )
                )
            }
        }
    }
}
