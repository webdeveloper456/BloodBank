## 2024-03-29 - RecyclerView Notification & Color Parsing Bottlenecks
**Learning:** Calling `notifyDataSetChanged()` inside loops during Firebase `DataSnapshot` iteration triggers $N$ full RecyclerView layout passes. Additionally, calling `Color.parseColor()` inside `onBindViewHolder` causes unnecessary String parsing on every row render/scroll pass.
**Action:** Always batch dataset notifications outside data fetching loops and cache parsed colors into `static final` constants in Adapters.
