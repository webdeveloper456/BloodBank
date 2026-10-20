## 2026-03-02 - Avoid Color.parseColor in RecyclerView onBindViewHolder
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` invokes string parsing operations on every item bind during scrolling, causing unnecessary CPU work and overhead on the main thread.
**Action:** Always cache parsed color values as `static final int` fields in adapter classes when the color hex strings are fixed.
