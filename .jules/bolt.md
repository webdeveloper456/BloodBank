## 2026-03-02 - Cache parsed colors in RecyclerView adapters
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` triggers repetitive string parsing and allocations on every item bind during fast scrolling.
**Action:** Cache hex color values as `private static final int` constants in the `RecyclerView.Adapter` class definition.
