# Bolt's Journal - Critical Learnings

## 2025-02-18 - Batching RecyclerView Adapter Updates from Firebase DataSnapshots
**Learning:** Calling `notifyDataSetChanged()` inside loops iterating over Firebase `DataSnapshot.getChildren()` forces the RecyclerView to recalculate layout and re-bind views N times for N items, causing severe frame drops during data load. Additionally, calling `Color.parseColor()` inside `onBindViewHolder` adds repeated string parsing overhead during scrolling.
**Action:** Always call `notifyDataSetChanged()` outside data population loops once all items have been added to the underlying list. Cache parsed color integers as `private static final int` constants in adapter classes to keep `onBindViewHolder` fast and lightweight.
