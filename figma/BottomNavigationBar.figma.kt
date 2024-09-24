@FigmaConnect("https://www.figma.com/design/UWGyhZEOlo3YfsEuHlFGJa/Jetpack-Compose---Code-Connect-Demo-%5BTesting%5D?node-id=13-143&m=dev")
public class NavBar {

    // Use @FigmaChildren for nested Figma instances
    @FigmaChildren("navicon")
    val navicon: @Composable () -> Unit = {}

    @Composable
    fun BottomNavigationBar() {
        NavigationBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp) // Consistent padding for alignment with layout
                .background(Black)
                .border(3.dp, LightOrange) // Square corners with orange border
                .padding(8.dp),
            containerColor = Black, // Set container color same as the background grid color
        ) {
            Row(
                modifier = Modifier
                    .background(Black) // Ensure background is consistent with the grid
                    .padding(8.dp) // Padding for spacing between icons and edges
            )
        }

        // Nesting the navicon component here using @FigmaChildren
        navicon()





