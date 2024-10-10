FROM gradle:7.5.1-jdk17

WORKDIR /app

COPY . .

CMD ./gradlew run


