## 2025-05-18 - Batching RecyclerView adapter notifications
**Learning:** Calling `notifyDataSetChanged()` inside a loop when parsing Firebase DataSnapshot children causes redundant layout calculations, item binds, and UI re-renders for every single item (O(N) layout passes). Batching the updates by calling `notifyDataSetChanged()` once after populating the list reduces UI thread work from O(N) to O(1).
**Action:** Always move `notifyDataSetChanged()` (or `notifyItemRangeInserted`) outside data parsing loops when loading list data asynchronously.
