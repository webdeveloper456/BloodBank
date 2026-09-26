## 2026-03-02 - Batched Adapter Updates and Cached Color Parsing in RecyclerViews
**Learning:** Calling `RecyclerView.Adapter.notifyDataSetChanged()` inside Firebase `DataSnapshot` iteration loops triggers $N$ full UI re-layouts/re-renders for $N$ items instead of 1. Additionally, calling `Color.parseColor("#HEX")` inside `onBindViewHolder` parses strings on every scroll bind call.
**Action:** Move `notifyDataSetChanged()` outside data population loops and cache static colors in `static final int` fields.
