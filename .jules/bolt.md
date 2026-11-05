# Bolt's Performance Journal

## 2026-03-31 - Batching notifyDataSetChanged in Firebase Snapshots
**Learning:** In Android applications consuming Firebase Realtime Database DataSnapshots, invoking `adapter.notifyDataSetChanged()` inside `for (DataSnapshot item : dataSnapshot.getChildren())` forces $O(N)$ complete dataset invalidations and full view hierarchy re-measurements/re-layouts on the UI thread while loading.
**Action:** Always batch updates by appending items to the local collection within the loop, and dispatching a single `notifyDataSetChanged()` (or `notifyItemRangeInserted`) after iteration completes.
