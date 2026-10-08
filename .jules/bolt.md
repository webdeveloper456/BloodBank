# Bolt's Journal - Critical Learnings

## 2026-03-31 - Batching Firebase RecyclerView Adapter Notifications and Static Color Parsing
**Learning:** In Android Firebase database listeners, calling `RecyclerView.Adapter.notifyDataSetChanged()` inside a loop over `DataSnapshot.getChildren()` triggers $N$ full layout passes and item rebinds on the UI thread for $N$ records. Moving `notifyDataSetChanged()` outside the loop batches notifications into 1 single layout pass. Additionally, invoking `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses color strings on the hot scrolling path.
**Action:** Always batch adapter update notifications outside item iteration loops after fetching list snapshots. Pre-parse hex colors into `static final int` fields in `RecyclerView.Adapter` classes.
