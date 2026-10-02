## 2026-03-30 - Batch RecyclerView Notifications & Cache Color Parsing
**Learning:** Calling `notifyDataSetChanged()` inside data iteration loops causes $N$ full view recalculations and layout passes in Android RecyclerViews instead of 1 pass. Additionally, calling `Color.parseColor()` inside `onBindViewHolder` executes hex parsing on every item view bind during scrolling.
**Action:** Always batch list updates by calling `notifyDataSetChanged()` once after loading data collections, and cache parsed integer color constants statically in Adapter classes.
