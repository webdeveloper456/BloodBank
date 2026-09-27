# Bolt Performance Journal

## 2026-03-02 - Batched Adapter Notifications for Firebase DataSnapshots
**Learning:** Calling `notifyDataSetChanged()` inside a loop over Firebase `DataSnapshot` children triggers N separate UI re-layouts for N items on the main thread, leading to UI jank.
**Action:** Always batch list insertions and call `notifyDataSetChanged()` once after the loop finishes.
