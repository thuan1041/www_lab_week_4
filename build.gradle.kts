plugins {
    id("java")
}

group = "vn.edu.iuh.fit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.springframework:spring-context:6.0.6")

}

tasks.test {
    useJUnitPlatform()
}