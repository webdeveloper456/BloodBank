## 2026-03-01 - Avoid Repeated Color Parsing and Unnecessary String Concatenations in RecyclerView onBindViewHolder

**Learning:** In Android RecyclerView adapters, `onBindViewHolder` is invoked frequently during list scrolling. Calling `Color.parseColor("#HEX")` inside `onBindViewHolder` repeatedly parses hex strings into integers on every single item view bind, causing unnecessary memory allocation and CPU cycles. Additionally, multi-part String concatenations in `onBindViewHolder` cause frequent temporary `String` allocations, triggering Garbage Collection (GC) pauses during fast scrolling.

**Action:**
1. Cache parsed color values as `static final int` constants or fields in adapter classes.
2. Use `StringBuilder` or pre-formatted string templates for string concatenation inside `onBindViewHolder`.
