# api-spring-java8
1.https://start.spring.io/

    dependencies {
    	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    	implementation 'org.springframework.boot:spring-boot-starter-web'
    	developmentOnly 'org.springframework.boot:spring-boot-devtools'
    	runtimeOnly 'com.h2database:h2'
    	testImplementation('org.springframework.boot:spring-boot-starter-test') {
    		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
    	}
    }
    
    With H2 Database, Spring Data JPA and Spring Boot DevTools
    
2. 
