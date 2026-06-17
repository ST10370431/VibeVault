VibeVault2 is a native Android application designed for efficient personal expense logging, financial management, and secure local user session tracking. Built with a modern Android architecture framework, the application utilizes **Kotlin**, **Jetpack Room Database**, and asynchronous structural patterns to deliver a fast, stable, and offline-first mobile experience.

---

## 🚀 Key Features

* **Advanced Expense Tracking:** Seamlessly log, categorize, and track daily expenditures with precision.
* **Local User Authentication:** Secure user profiling and personalized local session environments using dedicated relation mapping.
* **Offline-First Persistence:** Complete data safety via a localized SQLite storage footprint managed through Jetpack Room, eliminating data loss during network dropouts.
* **Centralized Dependency Architecture:** Uses the modern Gradle Version Catalog (`libs.versions.toml`) to enforce consistent versioning across the development workflow.

---

## 🏗️ Architectural Overview

The project adheres to the official Android architectural recommendations, focusing on a clear separation of concerns:

### 📁 1. Entities (`com.example.vibevault.entities`)
Defines the relational schema mapping directly to localized database tables:
* **`UserEntity`:** Configures and saves user parameters and profile attributes.
* **`VibeEntities`:** Manages transactional logs, capturing unique system keys, description labels, and numerical cost amounts.

### 📁 2. Data Access Objects / DAO (`com.example.vibevault.dao`)
* **`VibeDao`:** Interfaces declaring compile-time verified SQLite operations. Provides abstract execution mapping for Create, Read, Update, and Delete (CRUD) tasks.

### 📁 3. Database Layer (`com.example.vibevault.data`)
* **`VibeDatabase`:** The underlying database implementation inheriting from `RoomDatabase`. It coordinates thread-safe operations by adopting a strict Singleton creation pattern, ensuring unified thread barriers.

---

## 🛠️ Technology Stack & Dependencies

* **Core Language:** Kotlin
* **Minimum System Support (minSdk):** API Level 26 (Android 8.0)
* **Target Environment (targetSdk):** API Level 34 (Android 14)
* **Object-Relational Mapping (ORM):** Jetpack Room Database Architecture
* **Compilation Pipeline Engine:** Gradle Automation Wrapper 8.7
* **Annotation Processing Engine:** Kotlin Annotation Processing Tool (KAPT)
