✦ Project — Art Space App
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Objective
  Digital art gallery that displays artwork one at a time,
  with Previous/Next buttons to cycle through a curated
  collection.

Final Architecture
  1. Artwork wall        — Image composable inside a framed Surface
  2. Artwork descriptor  — Title, artist, and year inside an info card Surface
  3. Display controller  — Previous (OutlinedButton) + Next (Button)

Data Model
  data class Artwork(id, imageResId, title, artist, year)
  7 artworks with sequential 1-based IDs

State
  currentArtworkIndex: Int (0..6)
  Next: index + 1, wraps to 0 at end
  Previous: index - 1, wraps to last at start

Polish
  • Framed artwork via Surface with rounded corners + shadow
  • Info card Surface with Material color scheme
  • Vertical scroll + width constraint for tablet landscape

Commit plan
  ✅ Create project + add 7 artwork images
  ✅ Define Artwork data class and sample list
  ✅ Build ArtworkDisplay composable
  ✅ Add static Previous/Next buttons
  ✅ Add currentArtworkIndex state and wire buttons
  ✅ Add 1-based ids to Artwork (codelab strict mode)
  ✅ Fix tablet landscape layout (scroll + width constraint)
  ✅ Polish UI with Surface frames and info card
