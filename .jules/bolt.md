# Bolt's Journal - BloodBank Android App

## 2026-03-31 - Parsing colors inside RecyclerView onBindViewHolder
**Learning:** `Color.parseColor(String)` involves substring parsing and map lookups that execute repeatedly during fast scrolling in RecyclerView if called in `onBindViewHolder()`. Because `onBindViewHolder()` is executed on the UI main thread during scrolling, invoking `Color.parseColor` on every item bind introduces needless CPU overhead and GC pressure. Pre-parsing colors once into `static final int` constants eliminates repeated parsing entirely and helps prevent frame drops (jank).
**Action:** When implementing alternating row backgrounds or static color assignments in Android RecyclerView adapters, always define pre-parsed `static final int` color constants rather than parsing hex strings inside `onBindViewHolder()`.
