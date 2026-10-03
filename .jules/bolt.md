## 2025-05-18 - Batching RecyclerView Updates & Pre-parsing Colors

**Learning:** Calling `notifyDataSetChanged()` inside Firebase `DataSnapshot` iteration loops triggers N complete re-layouts and redraws of the `RecyclerView` when fetching N items. Calling `Color.parseColor()` inside `onBindViewHolder` causes string parsing overhead on every scrolled item.
**Action:** Always call `notifyDataSetChanged()` once after list iteration completes, and define `static final int` color constants in `RecyclerView.Adapter` classes.
