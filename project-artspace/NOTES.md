✦ Project — Art Space App
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Objective
  Build a digital art gallery that shows artwork one at a
  time, with Previous/Next buttons to cycle through them.

Structure
  1. Artwork wall        — Image composable
  2. Artwork descriptor  — Title, artist, year
  3. Display controller  — Previous / Next buttons

Data
  7 artwork images (art1.jpeg … art7.jpeg) with title,
  artist, and year for each.

State
  currentArtworkIndex: Int (0..6)
  Buttons increment/decrement it, wrapping at the ends.

Commit plan
  ✅ Create project + add 7 artwork images
  ⬜ Define Artwork data class and sample list
  ⬜ Build ArtworkDisplay composable (Image + Text)
  ⬜ Add Next/Previous buttons (static)
  ⬜ Add currentArtworkIndex state and wire buttons
  ⬜ Style layout (padding, Surface, alignment)
  ⬜ Add contentDescription for accessibility
  ⬜ Finalize notes and screenshots
