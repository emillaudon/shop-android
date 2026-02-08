# Shop Android

An Android client for the Shop application, built to work together with the Shop Backend API.
https://github.com/emillaudon/shop-backend

This project is part of a learning and portfolio project focused on native Android development
and building a real-world mobile client.

⚠️ This project is still under active development and not ready to be run.

---

## Tech Stack

- Kotlin
- Jetpack Compose (UI)
- Android SDK
- Retrofit (API communication)

---

## Features (Planned / In Progress)

- User authentication
- Product listing
- Product details
- Shopping cart
- Order creation
- Order history

Some features are still under development.

---

## Project Structure

The project is structured by functionality / feature areas:

```text
app/src/main/java/com/example/shopmobile/
├── core/
│   └── network/        # Network configuration and providers
├── feature/
│   └── products/       # Product feature module
│       ├── data/       # Repositories, DTOs, mappers, API services
│       ├── domain/     # Domain models and interfaces
│       └── ui/         # Screens, ViewModels, and UI components
├── navigation/         # Navigation and routes
├── ui/
│   └── theme/          # Compose theme and styling
└── MainActivity.kt     # Application entry point

```
Each feature contains its own UI and logic.

The structure may evolve during development.

---

## Running the Project

1. Open the project in Android Studio
2. Sync Gradle
3. Configure backend base URL if needed
4. Run on emulator or physical device

Make sure the backend is accessible from your device.

---

## Backend

The backend for this project is implemented in Spring Boot:  
https://github.com/emillaudon/shop-backend

---

## Purpose

This project demonstrates:

- Native Android development with Kotlin & Jetpack Compose
- Integration with a REST API
- Feature-based project structure
- Working with a full-stack application
- Mobile client development

It is intended as a learning and portfolio project.

---

## Status

Work in progress.  
Features and architecture are continuously improved.