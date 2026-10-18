## 2026-03-30 - Batch RecyclerView Adapter Updates in Firebase Listeners & Cache Color Parsing

**Learning:** Calling `notifyDataSetChanged()` inside a loop over `DataSnapshot.getChildren()` causes N full RecyclerView re-layouts and re-measurements instead of 1. Additionally, calling `Color.parseColor()` repeatedly inside `onBindViewHolder()` adds string parsing overhead during fast scrolling.
**Action:** Always batch list modifications and call `notifyDataSetChanged()` once after the loop completes in Firebase data callbacks. Cache parsed color integers as `static final` constants in RecyclerView adapters.
