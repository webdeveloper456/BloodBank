## 2026-03-02 - Batch RecyclerView updates from Firebase DataSnapshot iterations
**Learning:** Calling `RecyclerView.Adapter.notifyDataSetChanged()` inside a loop iterating over Firebase `DataSnapshot.getChildren()` triggers $N$ full layout passes and re-renders for $N$ items. Moving `notifyDataSetChanged()` outside the loop batches the update into a single layout pass.
**Action:** Always batch adapter notify updates outside of item deserialization/population loops when fetching dataset snapshot collections.
