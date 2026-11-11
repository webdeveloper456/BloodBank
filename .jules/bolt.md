# Bolt's Journal

Critical performance learnings and architectural discoveries.

## 2024-05-18 - Gradle and Android Environment Setup
**Learning:** Gradle 4.6 in this repository requires Java 8 (OpenJDK 8) and Android SDK at `/opt/android-sdk`. Running on Java 21 causes build failures due to incompatible Gradle daemon versions.
**Action:** Always run tests and lint with `JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 ANDROID_HOME=/opt/android-sdk ./gradlew test` and `./gradlew lint`.

## 2024-05-18 - RecyclerView Color Parsing and NotifyDataSetChanged
**Learning:** Avoid calling `Color.parseColor()` inside `onBindViewHolder()` as it parses strings on every scroll/bind frame. Also avoid calling `notifyDataSetChanged()` inside Firebase DataSnapshot iteration loops; batch it outside the loop.
**Action:** Cache parsed colors as static final constants and batch adapter notifications.
