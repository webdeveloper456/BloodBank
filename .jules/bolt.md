## 2026-09-08 - Batching RecyclerView notifications and caching parsed resources
**Learning:** Calling `notifyDataSetChanged()` inside Firebase DataSnapshot iteration loops caused $O(N)$ re-layouts and view updates on every single item addition. Additionally, calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly performed string parsing and created GC pressure during list scrolling.
**Action:** Always call `notifyDataSetChanged()` once after iterating through snapshot children, and store pre-parsed colors/resources as `static final` constants in Adapter classes.
