## 2025-02-23 - Batching RecyclerView Adapter Notifications
**Learning:** Calling `notifyDataSetChanged()` inside a Firebase DataSnapshot `getChildren()` loop triggers O(N^2) RecyclerView re-layout and re-binding operations on the main thread for N items. Calling `notifyDataSetChanged()` once after the loop reduces list population overhead to an O(N) batch update.
**Action:** When populating RecyclerView adapter lists from Firebase listeners or iteration loops, always append all items to the data source list first and invoke `notifyDataSetChanged()` once after loop completion.
