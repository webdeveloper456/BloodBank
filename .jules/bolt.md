# Bolt Performance Journal

## 2024-05-18 - Caching RecyclerView Color Parsing & Batching Data Updates
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` forces repeated hex string parsing on every item bind during scrolling. Additionally, calling `adapter.notifyDataSetChanged()` inside a loop when iterating over Firebase `DataSnapshot` children triggers redundant layout/re-bind passes for each item.
**Action:** Always cache parsed color integers as `static final` constants in RecyclerView adapters, and batch `notifyDataSetChanged()` calls after population loops complete.
