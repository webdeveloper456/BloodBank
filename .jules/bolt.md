## 2026-03-02 - RecyclerView Adapter Color Parsing Overhead
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` triggers string parsing and allocations on the UI thread during every scroll frame and view bind event.
**Action:** Cache static hex color values as `private static final int` constants at the class level in RecyclerView adapters.
