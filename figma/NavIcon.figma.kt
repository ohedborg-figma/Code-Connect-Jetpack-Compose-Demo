import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import com.example.bankingexample.ui.theme.LightOrange

@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=58-135&t=QklKVwfbK6jUwXlv-4")
public class NaviconDoc {

    // Correctly mapping the Icon to Figma's instance
    @FigmaProperty(FigmaType.Instance, "icon")
    val icon: @Composable () -> Unit = {}

    @FigmaProperty(FigmaType.Text, "title")
    public val title: String = "Home"

    @Composable
    fun Navicon() {
        {
            items.forEachIndexed { index, item ->
                val isSelected = index == 0 // Example selection for "Home"

                NavigationBarItem(
                    selected = isSelected,
                    onClick = { /* Handle item click */ },
                    icon = {
                        Icon(
                            imageVector = icon,  // Replace with actual icon (from Figma mapping)
                            contentDescription = title,
                            tint = LightOrange,
                            modifier = Modifier.padding(4.dp)
                                .then(
                                    if (isSelected) Modifier
                                        .graphicsLayer { shadowElevation = 16f }
                                        .shadow(
                                            elevation = 14.dp,
                                            shape = CircleShape,
                                            ambientColor = LightOrange,
                                            spotColor = LightOrange
                                        )
                                    else Modifier
                                )
                        )
                    },
                    label = {
                        Text(
                            text = title,
                            color = LightOrange,
                            fontSize = 12.sp
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = LightOrange,
                        unselectedIconColor = LightOrange,
                        selectedTextColor = LightOrange,
                        unselectedTextColor = LightOrange,
                        indicatorColor = Color.Transparent
                    ),
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}
