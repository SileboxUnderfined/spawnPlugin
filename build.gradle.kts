plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://libraries.minecraft.net")
}

dependencies {
    implementation("io.papermc.paper:paper-api:1.20-R0.1-SNAPSHOT")
    implementation("io.papermc.paper:paper-mojangapi:1.20-R0.1-SNAPSHOT")
    implementation("com.mojang:brigadier:1.0.18")

}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}
