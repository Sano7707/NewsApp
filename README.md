# NewsApp

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![MVVM](https://img.shields.io/badge/Architecture-MVVM-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

**NewsApp** is a modern, clean, and fully functional **Android news reader** application built with **Kotlin**. It fetches real-time headlines and articles from around the world using the powerful **NewsAPI.org** service.

Perfect for learning or extending modern Android development practices with clean architecture.

---

## ✨ Features

- **Live News Feed** – Get the latest headlines updated in real-time
- **Multiple Categories** – General, Business, Technology, Entertainment, Sports, Health, Science
- **Smart Search** – Search articles by keywords, topics, or sources
- **Rich Article Detail** – Full description, author, published date, source, image, and direct link to original article
- **Beautiful UI/UX** – Material 3 design with smooth animations, cards, and responsive layout
- **Dark/Light Mode** – Automatically follows system theme
- **Offline Support** – Articles are cached locally (Room database)
- **Fast & Lightweight** – Built with best performance practices
- **Error Handling** – Handles no internet, API errors, and empty states gracefully
- **Pull-to-Refresh** – Modern swipe-to-refresh on news list

---

## 🛠 Tech Stack

- **Language**: Kotlin 100%
- **Architecture**: MVVM + Repository Pattern + Use Cases
- **UI**: Jetpack Compose (Modern declarative UI) / XML with RecyclerView + Material 3
- **Networking**: Retrofit 2 + OkHttp 3
- **Dependency Injection**: Hilt
- **Asynchronous Programming**: Kotlin Coroutines + Flow
- **Image Loading**: Coil (with crossfade & caching)
- **Local Database**: Room (for offline caching)
- **JSON Parsing**: Gson
- **API Service**: NewsAPI.org
- **Navigation**: Jetpack Navigation Component
- **Other**: ViewModel, LiveData/Flow, DataStore, Shimmer loading effects


## 🚀 How to Run the Project

### Prerequisites
- Android Studio Ladybug (2024.2.1) or newer
- Android SDK (minSdk = 24, targetSdk = 35 recommended)
- Free **NewsAPI.org** key → [Get it here](https://newsapi.org/register)

### Step-by-Step Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sano7707/NewsApp.git
   cd NewsApp

2. **Open in Android Studio**
 File → Open → Select the cloned folder

## 3. Add Your API Key

1. Create a file named `local.properties` in the project root.
2. Add the following line:

NEWS_API_KEY=your_actual_api_key_here

---

## 4. Sync & Run

1. Click **Sync Project with Gradle Files**.
2. Select a device or emulator (**API 24+**).
3. Click the **Run** button ▶.

The app will automatically read the API key using BuildConfig.

---

## 🏗 Architecture

The app follows **Clean Architecture** principles:

- Presentation Layer → UI (Compose/XML) + ViewModel  
- Domain Layer → Business logic & Use Cases  
- Data Layer → Repository (Remote + Local)

Flow:  
UI → ViewModel → UseCase → Repository → (API / Room) → back to UI via Flow/StateFlow.

---

## 📌 API Information

- Base URL: https://newsapi.org/v2/
- Endpoint used: /top-headlines
- Country: us (can be changed)
- Categories supported: All 7 categories

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

1. Fork the project  
2. Create your feature branch  
   git checkout -b feature/amazing-feature  
3. Commit your changes  
   git commit -m "Add amazing feature"  
4. Push to the branch  
   git push origin feature/amazing-feature  
5. Open a Pull Request  

---

## 📄 License

This project is licensed under the MIT License — see the LICENSE file for details.

---

Made with ❤️ by **Sano7707**  
If you found this project helpful, please give it a ⭐ on GitHub!
