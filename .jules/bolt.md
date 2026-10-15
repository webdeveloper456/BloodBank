# Bolt Journal - Performance Learnings

## 2026-03-02 - RecyclerView Adapter & Firebase Listener Optimizations
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses hex strings on every scroll/bind event, creating unnecessary CPU work and memory overhead on the UI thread. Additionally, invoking `adapter.notifyDataSetChanged()` inside Firebase `DataSnapshot` iteration loops triggers $N$ layout passes for $N$ items.
**Action:** Always cache parsed colors as `static final int` fields in RecyclerView adapters. Batch `adapter.notifyDataSetChanged()` calls after `DataSnapshot` loops complete.
