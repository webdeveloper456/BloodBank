## 2025-05-18 - Batch notifyDataSetChanged and static color parsing in RecyclerView
**Learning:** Calling `notifyDataSetChanged()` inside Firebase `DataSnapshot` loops causes O(N) full-list layout passes instead of 1, and parsing string colors via `Color.parseColor()` inside `onBindViewHolder` causes string parsing overhead on every item scroll pass.
**Action:** Always move `notifyDataSetChanged()` outside data insertion loops and cache static color integer constants in `RecyclerView.Adapter` classes.
