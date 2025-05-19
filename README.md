This is a Kotlin Multiplatform project targeting Android, Web, Desktop.  https://kmp.jetbrains.com/

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.



### 当前项目结构
1. 多平台支持：
   * 支持Android和DeskTop平台
   * 使用Compose Multiplatform进行UI开发
   * 已实现平台特定代码分离（通过expect/actual机制）
2. UI组件
   * 使用Voyarger导航框架
   * 自定义主题
3. 网络层：
   * 使用Ktor进行网络请求
   * 配置了JSON序列化

### 将要进行的优化
