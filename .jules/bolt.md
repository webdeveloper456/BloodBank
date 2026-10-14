## 2026-03-30 - Batching RecyclerView Adapter Updates & Caching Parsed Colors
**Learning:** In Android RecyclerView adapters and Firebase listeners, calling `Color.parseColor()` inside `onBindViewHolder()` parses hex strings on every list item scroll/bind. Additionally, calling `notifyDataSetChanged()` inside a loop over `DataSnapshot.getChildren()` triggers N full layout and re-bind passes instead of 1.
**Action:** Cache parsed colors as `static final` constants in adapter classes and invoke `notifyDataSetChanged()` outside data population loops.
