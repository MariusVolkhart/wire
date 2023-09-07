plugins {
  kotlin("multiplatform")
  id("com.squareup.wire")
}

repositories {
  mavenCentral()
}

kotlin {
  js(IR) {
    binaries.executable()
    browser {
      commonWebpackConfig {
        cssSupport {
          enabled.set(true)
        }
      }
    }
    nodejs {
    }
  }
}

wire {
  protoLibrary = true

  kotlin {
    buildersOnly = true
  }
}


buildscript {
  repositories {
    mavenCentral()
  }
  dependencies {
    classpath("com.squareup.wire:wire-gradle-plugin")
  }
}
