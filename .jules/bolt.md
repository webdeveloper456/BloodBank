## 2026-03-02 - RecyclerView and Firebase Data Listener Optimizations
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses strings on scroll, causing unnecessary CPU overhead. Likewise, calling `notifyDataSetChanged()` inside a Firebase `DataSnapshot` loop causes repeated UI re-layouts per item.
**Action:** Always cache parsed color values as `static final int` constants in RecyclerView adapters, and batch adapter `notifyDataSetChanged()` calls after looping through Firebase dataset children.
