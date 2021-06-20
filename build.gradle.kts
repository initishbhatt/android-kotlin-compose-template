buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Libs.androidGradlePlugin)
        classpath(Libs.Kotlin.gradlePlugin)
    }
}

plugins {
    id("com.diffplug.spotless") version ("5.10.2")
}
allprojects {

    apply {
        plugin("com.diffplug.spotless")
    }
    repositories {
        google()
        mavenCentral()
    }
    spotless {
        kotlin {
            target("**/*.kt")
            targetExclude("$buildDir/**/*.kt")
            targetExclude("bin/**/*.kt")
            ktlint(Libs.ktLintVersion)
        }
    }
}