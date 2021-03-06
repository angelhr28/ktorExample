import java.net.URI

buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.4.10")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven {
            url = uri("https://jitpack.io")
        }
        maven {
            url = uri("https://maven.google.com")
        }
    }
}

group = "com.example.myktormultipart"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
