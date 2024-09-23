import androidx.compose.runtime.Composable
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import kotlin.String

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingexample.ui.theme.Black
import com.example.bankingexample.ui.theme.LightOrange

@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=2-228&t=gd4eOUEctqNJqBQy-4")
public class CardDoc {
    @FigmaProperty(FigmaType.Text, "balance")
    public val balance: String = "${'$'}13.37"

    @FigmaProperty(FigmaType.Text, "cardNumber")
    public val cardNumber: String = "1234 5678 9012 3456"

    @FigmaProperty(FigmaType.Text, "cardType")
    public val cardType: String = "VISA"

    @Composable
    public fun ComponentExample() {
        CardItem(index: Int) {
            val card = cards[index]

            // Box for each card with a glowing border and rounded corners
            Box(
                modifier = Modifier
                    .padding(start = 16.dp, end = if (index == cards.size - 1) 16.dp else 0.dp)
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
                        text = card.cardType,
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
                        text = card.cardNumber,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = LightOrange,
                            fontFamily = departureMonoFontFamily,
                            shadow = Shadow(
                                color = LightOrange,
                                blurRadius = 15f // Subtle glow effect
                            )
                        )
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Card balance
                    Text(
                        text = card.balance,
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White, // White balance for contrast
                            fontFamily = departureMonoFontFamily,
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
}
