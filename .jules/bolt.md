## 2026-03-29 - RecyclerView onBindViewHolder Allocation & Stream Synchronization Performance

**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder` parses hex strings on every item scroll frame, introducing parsing overhead and memory allocations on the UI thread. Additionally, using `StringBuffer` instead of `StringBuilder` in single-threaded URL response reading adds unnecessary thread lock synchronization.

**Action:** Extract repeated color parsing in adapter view holders into `private static final int` constants, and use `StringBuilder` for local string aggregation in network readers.
