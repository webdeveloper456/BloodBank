## 2026-09-05 - RecyclerView and Firebase Loop Optimizations
**Learning:** In Android RecyclerView adapters, calling `Color.parseColor()` inside `onBindViewHolder()` runs on every scroll frame and causes unnecessary string parsing overhead. Similarly, calling `Adapter.notifyDataSetChanged()` inside a Firebase `DataSnapshot` loop causes $O(N)$ re-layouts instead of a single $O(1)$ batch re-layout pass.
**Action:** Pre-parse static colors into `private static final int` constants, and trigger `notifyDataSetChanged()` once after list iteration completes.
