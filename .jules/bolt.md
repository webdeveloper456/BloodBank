## 2026-03-29 - Batch notifyDataSetChanged in Firebase DataSnapshot listeners
**Learning:** In Firebase listeners, calling `notifyDataSetChanged()` inside `DataSnapshot` children iteration loops triggers $N$ consecutive main-thread layout recalculations and redraws for $N$ items.
**Action:** Always batch adapter updates by calling `notifyDataSetChanged()` once outside the loop after all snapshot items are added to the list.
