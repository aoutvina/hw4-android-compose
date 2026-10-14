✦ Codelab 3 — Write Automated Tests
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Objective
  Learn to write and run automated tests for Android apps:
  local (unit) tests and instrumentation (UI) tests.

Final Features
  • Local unit test verifying calculateTip() with 20% on $10 = $2
  • Instrumentation test typing into the UI and asserting $2.00 tip
  • calculateTip() made internal + @VisibleForTesting

New Concepts Learned
  • Local tests (JVM, fast) vs instrumentation tests (device/emulator)
  • @Test, @Rule, assertEquals, assertExists
  • createComposeRule() for Compose UI tests
  • onNodeWithText, performTextInput
  • Test directory structure: test/ vs androidTest/

Reference
  https://developer.android.com/codelabs/basic-android-kotlin-compose-write-automated-tests

Progress
  ✅ Codelab started
  ✅ Local test for calculateTip 20 percent (PASSED)
  ✅ Instrumentation test for TipTimeLayout (PASSED)
