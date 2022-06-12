pluginManagement {
    repositories {
        gradlePluginPortal()
        //maven("https://papermc.io/repo/repository/maven-public/")
        mavenLocal()
    }
}

rootProject.name = "kpaper"

include("kpaper-api", "kpaper-server")
