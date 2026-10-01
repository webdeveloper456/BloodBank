## 2025-02-23 - Cache parsed color values in RecyclerView Adapters
**Learning:** Avoid calling `Color.parseColor("#HEX")` inside `onBindViewHolder()` in RecyclerView adapters. Because `onBindViewHolder()` runs repeatedly during scrolling on the UI thread, parsing hex string colors on every call introduces unnecessary string allocation and parsing overhead.
**Action:** Cache hex color values as `private static final int` constants in adapter classes to optimize list scrolling performance.
