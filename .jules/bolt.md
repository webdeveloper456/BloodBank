# Bolt's Journal - Performance Learnings

## Environment Notes
- Gradle 4.6 requires Java 8 (`JAVA_HOME=$HOME/.jdk8`). Java 21 causes `Could not determine java version from '21.0.10'`.

## 2026-03-29 - [RecyclerView Adapters & Firebase Snapshots Performance]
**Learning:** Calling `Color.parseColor()` inside `RecyclerView.Adapter.onBindViewHolder()` parses hex color strings and allocates memory on every single item scroll/bind. Similarly, calling `adapter.notifyDataSetChanged()` inside a loop when adding items from a Firebase DataSnapshot causes N layout invalidations.
**Action:** Extract parsed colors as `private static final int` constants in adapter classes, and batch `notifyDataSetChanged()` calls outside data population loops.
