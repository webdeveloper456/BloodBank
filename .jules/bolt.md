## 2026-09-17 - RecyclerView Batching and Static Color Optimization
**Learning:** In Android RecyclerView adapters, calling `notifyDataSetChanged()` inside a Firebase `DataSnapshot` loop forces $N$ full layout passes instead of $1$. Additionally, using `Color.parseColor()` inside `onBindViewHolder()` triggers string parsing overhead on every scrolled item.
**Action:** Always batch dataset updates by calling `notifyDataSetChanged()` outside data insertion loops, and cache `Color.parseColor()` values in `static final int` constants at adapter initialization.
