# Bolt's Journal - Critical Learnings

## 2023-10-23 - Cache static parsed colors in RecyclerView adapters
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` parses hex color strings and performs regex/string operations on every row bind during scrolling.
**Action:** Cache parsed integer colors as `private static final int` constants in adapter classes to eliminate runtime string parsing and allocations on the UI thread during list scrolling.
