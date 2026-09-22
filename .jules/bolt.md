## 2026-03-02 - Cache Color Parsing in RecyclerView Adapters
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` parses hex color strings repeatedly on the main thread during scrolling in `RecyclerView.Adapter`s.
**Action:** Cache parsed integer colors as `static final` constants when using static hex strings for row backgrounds.
