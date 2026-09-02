## 2025-02-07 - [RecyclerView Color Parsing Optimization]
**Learning:** Calling `Color.parseColor()` inside `RecyclerView.Adapter.onBindViewHolder()` parses hexadecimal color strings on every item bind and scroll frame, causing unnecessary overhead on the main UI thread.
**Action:** Extract parsed color values as `private static final int` constants in the Adapter class so parsing happens once when the class is loaded.
