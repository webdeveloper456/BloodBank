# Bolt's Journal

## 2026-03-30 - RecyclerView onBindViewHolder Color.parseColor Overhead
**Learning:** `Color.parseColor(String)` involves string inspection, substring extraction, and hex parsing via `Long.parseLong()`. Calling this repeatedly in RecyclerView's `onBindViewHolder` allocates intermediate strings and triggers hex parsing on every item bind while scrolling on the UI thread (~24x slower than primitive integer color constants).
**Action:** Always precalculate or define integer color constants (e.g. `0xFFC13F31`) statically instead of parsing hex color strings inside `onBindViewHolder()` or render/scroll loops.
