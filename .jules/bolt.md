# Bolt's Journal

## 2026-03-02 - UI Thread Optimization in RecyclerView and Firebase callbacks
**Learning:** In Android RecyclerView lists populated from Firebase `DataSnapshot`, two anti-patterns degrade performance:
1. Calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses strings into color ints during list scrolling on the UI thread, causing unnecessary string parsing and potential frame drops.
2. Calling `notifyDataSetChanged()` inside Firebase `dataSnapshot.getChildren()` iteration loops triggers full RecyclerView layout passes and view invalidations for every item added (O(N) layout passes) instead of a single batched pass after loading all items.

**Action:** Always pre-cache parsed color ints as `static final int` fields in RecyclerView adapters and batch `notifyDataSetChanged()` outside data population loops.
