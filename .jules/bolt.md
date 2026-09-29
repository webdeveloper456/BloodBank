## 2026-03-29 - Batch RecyclerView adapter notifications and cache Color.parseColor in view binding

**Learning:** Calling `notifyDataSetChanged()` inside a loop when adding items from a Firebase `DataSnapshot` causes $O(N)$ full re-layout passes on the main UI thread. Additionally, calling `Color.parseColor()` inside `onBindViewHolder` performs regex/string parsing on every item view binding during scrolling.
**Action:** Always batch adapter updates by invoking `notifyDataSetChanged()` once after list population is complete, and cache static color integers as `private static final int` constants in `RecyclerView.Adapter` classes.
