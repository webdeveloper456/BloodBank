# Bolt's Journal

## 2025-05-18 - Batching RecyclerView notifications and static color caching
**Learning:** In Android RecyclerView adapters, calling `Color.parseColor()` inside `onBindViewHolder()` executes string parsing and locale operations on every scroll frame. Also, calling `notifyDataSetChanged()` inside Firebase data iteration loops triggers $N$ full layout passes instead of 1.
**Action:** Always cache static color integers as `private static final int` constants in adapters, and ensure `notifyDataSetChanged()` is called once after populating list datasets.
