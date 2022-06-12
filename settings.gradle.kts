pluginManagement {
    repositories {
        gradlePluginPortal()
        //maven("https://papermc.io/repo/repository/maven-public/")
        //mavenLocal()
        maven("https://jitpack.io")
    }
}

rootProject.name = "kpaper"

include("kpaper-api", "kpaper-server")
