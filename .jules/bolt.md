# Bolt's Performance Journal

## 2026-11-01 - Color.parseColor() in RecyclerView onBindViewHolder
**Learning:** In Android RecyclerView adapters, invoking `Color.parseColor()` inside `onBindViewHolder()` runs color parsing logic (string checks, map lookups, substring allocation, and hex parsing) on the main thread every time a row is bound or scrolled into view.
**Action:** Always pre-compute and cache parsed color integers as `static final` constants (`0xAARRGGBB`) or pre-calculate them at class-load time to keep `onBindViewHolder()` allocations at 0 and execution time at O(1).
