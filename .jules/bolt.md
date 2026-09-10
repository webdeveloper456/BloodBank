## 2026-03-02 - Gradle 4.6 Compatibility with Java Versions
**Learning:** Gradle 4.6 used in this project fails with Java 21 (`Could not determine java version from '21.0.10'`). Java 8 is required for running Gradle builds and test suites.
**Action:** Always run Gradle commands using `JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 ./gradlew ...`.
