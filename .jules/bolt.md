## 2026-03-02 - Batch RecyclerView Adapter Notifications in Firebase Data Snapshots
**Learning:** Calling `notifyDataSetChanged()` inside a loop when reading items from a Firebase `DataSnapshot` causes $N$ full RecyclerView adapter re-binds and layout passes. Moving `notifyDataSetChanged()` outside the loop batches the update into a single pass.
**Action:** Always batch list modifications and call `notifyDataSetChanged()` (or use specific diff updates) once after the loop finishes when processing data snapshots or batch responses.
