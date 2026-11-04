# Bolt's Journal

## 2026-03-31 - Batching notifyDataSetChanged and Color.parseColor Caching
**Learning:** In Android Firebase listeners and RecyclerView adapters, calling `adapter.notifyDataSetChanged()` inside item loops (e.g. `dataSnapshot.getChildren()`) triggers O(N) full RecyclerView layout calculations and re-bind passes on the main thread, instead of O(1) when called after the loop finishes. Furthermore, invoking `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses hex color strings and causes unnecessary allocations during scrolling.
**Action:** Always batch adapter notifications after data iteration completes, and cache static color hex strings as `static final int` in RecyclerView adapters.
