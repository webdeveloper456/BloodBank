## 2025-02-23 - RecyclerView notifyDataSetChanged and Color parsing optimization
**Learning:** Calling `notifyDataSetChanged()` inside Firebase `DataSnapshot` loops triggers $N$ full layout passes for $N$ items, leading to severe UI jank. Moving it outside the loop and caching `Color.parseColor()` results in adapter constants avoids repeated hex color string parsing during `onBindViewHolder` scroll passes.
**Action:** Always batch list updates after populating data and cache immutable resource/color values outside `onBindViewHolder`.
