@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=61-241&m=dev")
public class Currenciesdoc {

    // Use @FigmaChildren for nested Figma instances
    @FigmaChildren("currency")
    val currency: @Composable () -> Unit = {}

    @FigmaProperty(FigmaType.Instance, "icon")
    val icon: @Composable () -> Unit = {}

    @Composable
    fun CurrenciesSection() {
        var isVisible by remember { mutableStateOf(false) }
        var iconState by remember { mutableStateOf(Icons.Rounded.KeyboardArrowUp) }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 32.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(Black)
                    .animateContentSize()
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .animateContentSize()
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(LightOrange)
                            .clickable {
                                isVisible = !isVisible
                                iconState = if (isVisible) {
                                    Icons.Rounded.KeyboardArrowUp
                                } else {
                                    Icons.Rounded.KeyboardArrowDown
                                }
                            }
                    ) {
                        Icon(
                            modifier = Modifier.size(25.dp),
                            imageVector = icon,
                            contentDescription = "Currencies",
                            tint = Color.Black
                        )
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Currencies",
                        fontSize = 20.sp,
                        color = LightOrange,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(LightOrange)
                )

                if (isVisible) {
                    BoxWithConstraints(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 16.dp)
                            .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                            .background(Black)
                    ) {
                        val width = maxWidth / 3

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    modifier = Modifier.width(width),
                                    text = "Currency",
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp,
                                    color = LightOrange
                                )

                                Text(
                                    modifier = Modifier.width(width),
                                    text = "Buy",
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp,
                                    color = LightOrange,
                                    textAlign = TextAlign.End
                                )

                                Text(
                                    modifier = Modifier.width(width),
                                    text = "Sell",
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp,
                                    color = LightOrange,
                                    textAlign = TextAlign.End
                                )
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            LazyColumn {
                                items(currencies.size) { index ->
                                    CurrencyItem(
                                        index = index,
                                        width = width
                                    )
                                }
                            }
                        }
                    }

                    // Nesting the currency component here using @FigmaChildren
                    currency()
                }
            }
        }
    }
}
