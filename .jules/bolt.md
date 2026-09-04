## 2025-09-04 - [Cache Color Parsing in RecyclerView Adapters]
**Learning:** `Color.parseColor(String)` performs string parsing and regex/format validation every time it is called. When placed inside `onBindViewHolder` of a `RecyclerView.Adapter`, this causes unnecessary memory allocations and string parsing overhead on every item scroll frame.
**Action:** Always cache parsed color integers as `static final int` constants or pre-parsed values when setting view background/text colors in adapter view binding.
