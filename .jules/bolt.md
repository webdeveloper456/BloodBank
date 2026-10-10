## 2026-03-02 - Batch RecyclerView Adapter Notifications

**Learning:** Calling `RecyclerView.Adapter.notifyDataSetChanged()` inside Firebase `DataSnapshot` loops triggers redundant UI re-layouts, re-binds, and main thread jank for every item inserted ($O(N)$ calls).
**Action:** Always batch list insertions into the local list variable inside loop iterations and invoke `notifyDataSetChanged()` exactly once after the loop completes ($O(1)$ call).
