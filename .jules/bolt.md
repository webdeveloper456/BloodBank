# Bolt's Journal - Critical Learnings

## 2026-03-22 - Batch RecyclerView updates and static Color parsing
**Learning:** Calling `notifyDataSetChanged()` inside Firebase `DataSnapshot` loops triggers O(N) full adapter re-layouts. In addition, invoking `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses color hex strings on every list item scroll.
**Action:** Batch `notifyDataSetChanged()` calls after `DataSnapshot` iteration loops and cache parsed colors as `private static final int` constants in RecyclerView adapters.
