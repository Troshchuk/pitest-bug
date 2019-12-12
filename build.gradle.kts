plugins {
    java
    id("info.solidsoft.pitest") version "1.4.5"
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux:2.1.4.RELEASE")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.4.RELEASE")
}
