# Bolt's Journal - Critical Performance Learnings

## 2026-03-31 - Avoid inner-loop adapter notifications and onBindViewHolder string color parsing
**Learning:** Calling `RecyclerView.Adapter.notifyDataSetChanged()` inside a loop when iteration over `DataSnapshot.getChildren()` triggers redundant UI re-binds and layout passes N times for N elements. In addition, parsing color hex strings (`Color.parseColor()`) inside `onBindViewHolder()` repeatedly parses color strings every time a list item scrolls into view.
**Action:** Always batch collection updates before calling `notifyDataSetChanged()` once outside the loop. Cache converted color integers as `static final` constants in RecyclerView Adapters.
