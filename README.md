# 🔢 Counter Application

## 📌 Overview
This is a simple Counter application built using the MVVM (Model-View-ViewModel) architectural pattern. The app allows users to increment and decrement a counter value and reset it to zero. It is implemented using Kotlin and Jetpack Compose for UI development in Android Studio.

## ✨ Features
- ➕ Increment counter
- ➖ Decrement counter
- 🔄 Reset counter
- 📌 Follows MVVM architecture

## 🛠 Technologies Used
- 🚀 **Kotlin** - Programming language
- 🏗 **Android Studio** - Development environment
- 🎨 **Jetpack Compose** - UI framework
- 🔄 **LiveData / StateFlow** - Data management
- 📂 **ViewModel** - Business logic handling

## 🏗 Architecture
The app follows the MVVM architecture:
- 🗂 **Model:** Represents the data and business logic (not much needed in this simple app).
- 🎨 **View:** UI components built using Jetpack Compose.
- 🧠 **ViewModel:** Handles the logic for updating the counter and communicates with the UI via LiveData or StateFlow.

## 📁 Project Structure
```
app/
│-- 📄 MainActivity.kt   # View (UI Layer)
│-- 📂 CounterViewModel.kt  # ViewModel (Logic Layer)
│-- 🎨 CounterScreen.kt  # Composable UI Screen
```

## 🔧 Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/CounterApp.git
   ```
2. Open the project in Android Studio.
3. Build and run the application on an emulator or a physical device.

## 📌 Usage
- ➕ Press the **+** button to increase the counter.
- ➖ Press the **-** button to decrease the counter.
- 🔄 Press the **Reset** button to reset the counter to zero.

## 🤝 Contributing
Feel free to fork the repository and contribute improvements. Pull requests are welcome!


