✦ Practice Task — Add EditNumberField with a TextField

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━



Codelab section: Take input from the user



What to do

&#x20; • In MainActivity.kt, add a composable named EditNumberField

&#x20;   that takes a Modifier parameter.

&#x20; • Inside it, add a TextField with:

&#x20;       value = ""

&#x20;       onValueChange = {}

&#x20;       modifier = modifier

&#x20; • Import androidx.compose.material3.TextField

&#x20; • Call EditNumberField() from TipTimeLayout() right after

&#x20;   the first Text composable.

&#x20; • Pass modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth()

&#x20; • Import androidx.compose.foundation.layout.fillMaxWidth



Acceptance

&#x20; • Running the app shows: Calculate Tip, an empty text box,

&#x20;   and Tip Amount: $0.00

