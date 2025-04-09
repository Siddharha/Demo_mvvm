Structure - 
📦 com.yourapp
│
├── core/                    # Shared core modules/utilities
│   ├── ui/                  # UI components (buttons, theme, etc.)
│   ├── network/             # Retrofit, OkHttp, API setup
│   ├── database/            # Room setup
│   ├── domain/              # Shared domain models
│   └── utils/               # Extensions, constants, etc.
│
├── features/
│   ├── login/
│   │   ├── data/            # DTOs, repository impls
│   │   ├── domain/          # UseCases, domain models, interfaces
│   │   ├── presentation/
│   │   │   ├── ui/          # Composables
│   │   │   ├── viewmodel/   # ViewModel
│   │   │   └── navigation/  # Navigation for this feature
│   │   └── di/              # Dagger/Hilt modules
│   ├── dashboard/
│   └── ...
│
├── app/                     # Main application module
│   ├── di/                  # App-wide DI setup
│   ├── navigation/          # App-wide nav graph
│   ├── MainActivity.kt
│   └── YourApp.kt
│
└── build.gradle
