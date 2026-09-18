## 2026-03-02 - Batching RecyclerView notifications & Caching Color Parsing

**Learning:** Calling `notifyDataSetChanged()` inside loops during Firebase `DataSnapshot` iteration forces redundant layout passes and re-binds for every individual item. In addition, parsing color hex strings using `Color.parseColor()` inside `onBindViewHolder` causes overhead on every item scroll.

**Action:** Always batch list data updates before triggering a single `notifyDataSetChanged()` outside loop execution. Extract color parsing into `static final` constants to avoid repeated parsing during RecyclerView scrolling.
