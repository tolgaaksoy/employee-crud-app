# Employee CRUD Application

Uygulama özellikleri:
* Employee kayıtları üzerinde CRUD işlemleri yapılabilir.
* Employee kayıtları id ile veya liste olarak getirilebilir.

Paketler
* Bootstrap : Uygulama çalışmaya başladığında veritabanına örnek veri ekleyen paket.
* Configuration : Swagger burada tanımlandı.
* Controller : Spring Mvc Controller Sınıflarının bulunduğu paket.
* Dto : Data Transler objelerinin bulunduğu paket.
* Mapper: Data Transler objeleri ile models objelerinin dönüşümünü sağlauan paket.
* Models : Database entity objelerinin bulunduğu paket.
* Repositories : JpaRepository'nin implementasyonlarının gerçekleştiği paket.
* Request : Uygulamaya gelen isteklerin yapılarının bulunduğu paket.
* Response : Uygulamaya çıkan yanıtların yapılarının bulunduğu paket.
* Services : Servis Katmanı İşlemlerin gerçekleştirildiği paket.

### Kullanılan Teknolojiler ve Araçlar
#### Backend
* Java 8
* Spring Boot  (Spring Web MVC, Spring Data JPA)
* H2 Database
* Maven 
* Swagger


## :package: Maven ile Kurulum


Proje Dosyasında:

* `mvn clean install`

mylib/target dizinine employeecrudapp-0.0.1-SNAPSHOT.jar dosyası oluşturuldu.

## :clipboard: Çalıştırma

mylib/target dizininde:
```console
java -jar target/employeecrudapp-0.0.1-SNAPSHOT.jar
```
komutunu yazalım. Uygulama localhost:8080 adresinde ayağa çalışmaya başladı.

## Rest Servislerinin Dokümantasyonu

Dokümantasyona uygulamayı başlattıktan sonra

http://localhost:8080/swagger-ui.html#/employee-controller

adresinden erişebilirsiniz.

Swagger dokümantasyonun ekran görüntüsü:

![Swagger](https://user-images.githubusercontent.com/24254922/101834665-b4647300-3b4b-11eb-9f3b-32506144d583.png)

## H2 Veritabanı
http://localhost:8080/h2-console adresinden veritabanına erişilebilir. 

Ekran görüntüsündeki veriler örnek olması açısından uygulama çalışmaya başladığında eklenmektedir.

* JDBC URL: jdbc:h2:mem:testdb
* Username: sa
* Password: 

Veritabanı ekran görüntüsü:

![veritabani](https://user-images.githubusercontent.com/24254922/101835118-5edc9600-3b4c-11eb-9cf1-1a709ca75833.png)
