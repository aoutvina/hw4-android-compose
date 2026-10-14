✦ Remaining Practice Tasks — Codelab 1

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━



Task A — Add state to EditNumberField

&#x20; • Inside EditNumberField, remember a String state (initially empty).

&#x20; • Pass it to TextField's value parameter.

&#x20; • Update it inside onValueChange.

&#x20; • Imports: getValue, mutableStateOf, remember, setValue



Task B — Hoist state to TipTimeLayout

&#x20; • Move the state variable up into TipTimeLayout.

&#x20; • Pass value + onValueChange down to EditNumberField.

&#x20; • Convert the user's input to a Double (with toDoubleOrNull fallback).

&#x20; • Use the state + calculateTip() to update the Tip Amount text.



Acceptance

&#x20; • Typing a bill amount updates the Tip Amount live at 15%.

