## 2026-03-02 - Batching notifyDataSetChanged and Caching Parsed Colors in RecyclerView Adapters

**Learning:** Calling `adapter.notifyDataSetChanged()` inside a loop (such as iterating over Firebase `DataSnapshot` children) triggers $N$ full re-layouts of the `RecyclerView`. Moving `notifyDataSetChanged()` after the loop reduces layout passes to 1. Additionally, calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses strings on every row bind during scrolling.
**Action:** Always batch `notifyDataSetChanged()` calls after updating backing lists, and store pre-parsed colors as `static final` constants in `RecyclerView.Adapter` classes.
