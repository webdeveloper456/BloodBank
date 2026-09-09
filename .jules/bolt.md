## 2026-09-09 - Batch notifyDataSetChanged Calls for RecyclerView Data Snapshots
**Learning:** Calling `adapter.notifyDataSetChanged()` inside a loop while iterating over Firebase `DataSnapshot` children triggers full RecyclerView re-layouts and re-binds for every individual item added, causing O(N) UI layout recalculations.
**Action:** Always batch list insertions from snapshot loops and call `adapter.notifyDataSetChanged()` once after the loop completes.
