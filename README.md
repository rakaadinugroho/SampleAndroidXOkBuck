# AndroidX Kotlin Build with OkBuck

Setup project first

```groovy
./gradlew buckWrapper
```

Build project

```groovy
./buckw build app:bin_debug
```



## Project Configuration

version of component on this project

```
kotlin_version = '1.3.21'
build_gradle = 3.3.2
ok_buck_version = 0.47.0
build tools version = '29.0.2'
```

buck configuration

```groovy
okbuck {
    buildToolVersion = '29.0.2'
    lint {
        disabled = true
    }
    externalDependencies {
        downloadInBuck = false
    }
    jetifier {
        aarOnly = true
    }
}
```

