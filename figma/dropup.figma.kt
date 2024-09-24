@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=2175-401&m=dev")
public class Currenciesdoc {

    // Correctly mapping the Icon to Figma's instance
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

                                }

                }
            }
        }
