dependencies {
    implementation(project(":domain"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("net.javacrumbs.shedlock:shedlock-spring:5.8.0")
    implementation("net.javacrumbs.shedlock:shedlock-provider-jdbc-template:5.8.0")
    runtimeOnly("com.h2database:h2")
}