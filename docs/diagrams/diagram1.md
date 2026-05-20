# Faz 1 - UML Diyagramları

## Önceki Yapı

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

## Sonraki Yapı

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