## 2026-03-02 - Cache Parsed Colors in RecyclerView Adapters
**Learning:** `Color.parseColor()` involves string parsing and regex matching. Calling it directly inside `onBindViewHolder()` causes unnecessary string parsing and memory allocations on every frame/item scroll in RecyclerView.
**Action:** Always cache parsed color values as `private static final int` constants at the class level in RecyclerView Adapters.
