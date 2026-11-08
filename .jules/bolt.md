## 2026-03-02 - Gradle 4.6 Compatibility with Java Versions
**Learning:** Gradle 4.6 used in this project is incompatible with newer Java versions such as Java 21 (`Could not determine java version from '21.0.10'`). Java 8 is required to run Gradle builds, tests, and lint.
**Action:** Always run Gradle commands using `JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 ANDROID_HOME=/opt/android-sdk ./gradlew ...`.

## 2026-03-02 - RecyclerView Adapter Color Parsing Overhead
**Learning:** Calling `Color.parseColor()` inside `onBindViewHolder()` repeatedly parses string color codes on the UI thread during rapid scrolling, causing UI thread CPU overhead and potential dropped frames.
**Action:** Cache parsed colors as static final integer constants in RecyclerView adapters.

## 2026-03-02 - Batching RecyclerView Adapter Notifications in Firebase Callbacks
**Learning:** Invoking `adapter.notifyDataSetChanged()` inside a loop over `dataSnapshot.getChildren()` triggers $O(N)$ full RecyclerView re-layouts and measure passes on the UI thread.
**Action:** Batch `adapter.notifyDataSetChanged()` after the loop finishes so that a single layout pass occurs.
