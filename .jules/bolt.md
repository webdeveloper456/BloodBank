# Bolt's Journal - Critical Learnings

## 2026-03-02 - Batch RecyclerView Adapter Notifications in Firebase Callbacks
**Learning:** In Android apps consuming Firebase Realtime Database `DataSnapshot` children loops, calling `RecyclerView.Adapter.notifyDataSetChanged()` inside the loop triggers $N$ full layout passes and view bindings.
**Action:** Always batch list modifications and call `notifyDataSetChanged()` once after the loop finishes iterating through `dataSnapshot.getChildren()`.
