# Bolt's Journal

## 2025-05-18 - Caching Parsed Colors in RecyclerView Adapters
**Learning:** `Color.parseColor(hexString)` involves string parsing and sub-string allocations. In RecyclerView adapters (`SearchDonorAdapter`, `BloodRequestAdapter`), invoking `Color.parseColor()` on every `onBindViewHolder()` execution causes repetitive overhead on the Android UI thread during scrolling.
**Action:** Always parse colors once into `static final int` constants or extract them to `res/values/colors.xml` instead of repeatedly parsing hex string representations inside item view binding loops.
