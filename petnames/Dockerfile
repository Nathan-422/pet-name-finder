FROM openjdk:17
COPY . /usr/programming/pet-name-finder/petnames
WORKDIR /usr/programming/pet-name-finder/petnames
RUN mvn spring-boot:run
EXPOSE 8080
ENTRYPOINT ["mvn", "spring-boot:run"]

