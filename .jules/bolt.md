## 2026-03-02 - Batched Adapter Notifications in Firebase Listeners
**Learning:** In Android RecyclerView adapters bound to Firebase Database listeners, calling `notifyDataSetChanged()` inside `DataSnapshot` iteration loops triggers $N$ redundant UI re-renders and view re-allocations for $N$ items. Moving `notifyDataSetChanged()` outside the loop reduces layout updates to $O(1)$.
**Action:** Always batch list populating operations before calling `notifyDataSetChanged()` or use `DiffUtil` for list updates.
