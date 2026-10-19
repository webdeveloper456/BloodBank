## 2025-02-18 - Batching RecyclerView Adapter Notifications & Caching Color Parsers
**Learning:** In Android RecyclerView adapters, calling `Color.parseColor()` in `onBindViewHolder()` and invoking `adapter.notifyDataSetChanged()` inside Firebase DataSnapshot iteration loops cause redundant UI redraws and string parsing overhead.
**Action:** Always cache parsed color constants as `static final int` fields in RecyclerView adapters and call `notifyDataSetChanged()` once after list iteration completes in Firebase callbacks.
