## 2026-03-31 - RecyclerView Bind and Firebase Callback Batching
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses color hex strings during list scrolling, adding CPU overhead. Additionally, calling `notifyDataSetChanged()` inside Firebase `DataSnapshot` loops causes N full adapter re-layouts and re-draws for N items.
**Action:** Cache parsed colors as static final constants in RecyclerView adapters, and batch `notifyDataSetChanged()` calls after iteration loops complete.
