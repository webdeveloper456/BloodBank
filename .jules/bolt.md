## 2026-03-02 - Batch notifyDataSetChanged and Cache Color Constants in Adapters

**Learning:** Calling `notifyDataSetChanged()` inside loops during Firebase `DataSnapshot` parsing causes $O(N)$ layout/render passes per item load. In addition, calling `Color.parseColor()` inside `onBindViewHolder()` performs unnecessary string parsing on every view bind during scrolling.
**Action:** Always batch `notifyDataSetChanged()` calls after data iteration loops complete, and cache static color integers as `private static final int` constants in `RecyclerView.Adapter` classes.
