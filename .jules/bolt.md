# Bolt's Journal - Critical Learnings

## 2025-05-18 - Avoid Color.parseColor inside RecyclerView onBindViewHolder
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` forces color string parsing on every item bind during scrolling. In RecyclerViews, binding happens frequently on the main UI thread.
**Action:** Cache parsed color integers as `private static final int` constants in the adapter class.
