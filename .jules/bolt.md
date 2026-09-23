## 2026-03-02 - Batching RecyclerView Adapter updates & Color parsing caching

**Learning:** Calling `notifyDataSetChanged()` inside a Firebase `DataSnapshot` loop causes N full RecyclerView layout and bind passes instead of 1. Additionally, calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses color hex strings using regex/string operations on every scroll frame.
**Action:** Always batch list insertions from Firebase/async callbacks and call `adapter.notifyDataSetChanged()` once after the loop. Cache parsed colors into static constants in Adapters to avoid main-thread allocation and string parsing during fast scrolling.
