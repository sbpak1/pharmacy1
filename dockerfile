# 1. 베이스 이미지 (JDK 17)
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. JAR 파일 복사
COPY build/libs/*.jar app.jar

# 4. 포트 오픈
EXPOSE 8080

# 5. 실행 명령
ENTRYPOINT ["java", "-jar", "app.jar"]
