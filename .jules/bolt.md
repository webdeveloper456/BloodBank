# Bolt's Journal - Performance Learnings

## 2026-03-31 - Cache Color Ints in Android RecyclerView Adapters
**Learning:** Calling `Color.parseColor("#RRGGBB")` inside RecyclerView's `onBindViewHolder` causes repeated string parsing, pattern matching, and allocation on every single item bind during scrolling. Replacing string color parsing with pre-calculated integer color constants (e.g., `0xFFC13F31`) eliminates string parsing overhead per item frame during list scrolling.
**Action:** Pre-parse or define static final int constants for colors used repeatedly in adapter item views rather than invoking `Color.parseColor(...)` inside `onBindViewHolder`.
