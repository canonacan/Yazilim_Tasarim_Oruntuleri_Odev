# Faz 1 - Creational Pattern

# Kullanılan Tasarım Örüntüsü

## Factory Method

---

# Nerede Kullanıldı

Factory Method örüntüsü, karakter oluşturma işlemlerini merkezi hale getirmek için kullanıldı.

Bu amaçla:

```java
KarakterFabrikasi
```

sınıfı oluşturuldu.

Karakter nesneleri artık Main sınıfı içinde doğrudan oluşturulmamaktadır.

Önceden:

```java
new OyunNesnesi(...)
```

şeklinde nesne oluşturuluyordu.

Yeni yapıda:

```java
KarakterFabrikasi.olusturKarakter(...)
```

kullanılmaktadır.

---

# Neden Kullanıldı

Projede nesne oluşturma işlemleri Main sınıfı içinde dağınık haldeydi.

Bu durum:

- Main sınıfının fazla sorumluluk üstlenmesine
- kod tekrarına
- bakım maliyetinin artmasına
- sistemin genişletilebilirliğinin azalmasına

neden olmaktaydı.

Factory Method kullanılarak nesne oluşturma sorumluluğu ayrı bir sınıfa taşındı.

---

# Kazanımlar

Factory Method kullanılması ile:

- nesne oluşturma merkezi hale geldi
- Main sınıfının sorumluluğu azaldı
- kod okunabilirliği arttı
- yeni karakter eklemek kolaylaştı
- hata yönetimi geliştirildi

---

# Önceki Yapı

```text
Main
 └── new OyunNesnesi(...)
```

---

# Sonraki Yapı

```text
Main
 └── KarakterFabrikasi
       └── OyunNesnesi
```


---

# UML Diyagramları

# Önceki Yapı

```text
+--------+
| Main   |
+--------+
     |
     v
+----------------+
| OyunNesnesi    |
+----------------+
| tur            |
| can            |
| hasar          |
+----------------+
| bilgiGoster()  |
| saldir()       |
+----------------+
```

---

# Sonraki Yapı

```text
+--------+
| Main   |
+--------+
     |
     v
+----------------------+
| KarakterFabrikasi    |
+----------------------+
| olusturKarakter()    |
+----------------------+
           |
           v
+----------------+
| OyunNesnesi    |
+----------------+
| tur            |
| can            |
| hasar          |
+----------------+
| bilgiGoster()  |
| saldir()       |
+----------------+
```

---

# UML Değerlendirmesi

Önceki yapıda nesne oluşturma işlemleri doğrudan Main sınıfı içerisinde yapılmaktaydı.

Bu durum:
- Main sınıfının fazla sorumluluk üstlenmesine
- nesne oluşturma kodlarının dağınık hale gelmesine
- sistemin genişletilebilirliğinin azalmasına

neden olmaktaydı.

Factory Method uygulanması ile nesne oluşturma işlemleri KarakterFabrikasi sınıfına taşınmıştır.

Böylece:
- Main sınıfının sorumluluğu azaltılmış
- nesne oluşturma merkezi hale getirilmiş
- yeni karakter ekleme işlemleri daha düzenli hale getirilmiştir.