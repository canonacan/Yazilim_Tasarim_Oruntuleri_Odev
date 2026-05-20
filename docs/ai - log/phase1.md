# Faz 1 - AI Kullanım Kaydı

# AI'a Sorulan Soru

```text
Bu kodda nesne oluşturma sorumluluğunu merkezi hale getirmek için hangi Creational Pattern kullanılabilir?

Kodun genişletilebilir ve daha düzenli olması için nasıl bir yapı kurulabilir?
```

---

# AI Yanıtının Özeti

AI tarafından:

- Factory Method
- Builder Pattern
- Singleton

gibi Creational Pattern önerileri sunuldu.

Özellikle Factory Method kullanılarak:

- nesne oluşturma işlemlerinin merkezi hale getirilebileceği
- Main sınıfının sorumluluğunun azaltılabileceği
- yeni karakter eklemenin kolaylaşacağı

belirtildi.

AI ayrıca geçersiz karakter türleri için hata yönetimi eklenmesini önerdi.

---

# Uygulanan Çözüm

Projede Factory Method yaklaşımı uygulandı.

Bu amaçla:

```java
KarakterFabrikasi
```

sınıfı oluşturuldu.

Karakter oluşturma işlemleri:

```java
KarakterFabrikasi.olusturKarakter()
```

metodu üzerinden yapılmaya başlandı.

---

# AI'dan Farklı Olarak Yapılanlar

AI tarafından önerilen yapı doğrudan kopyalanmadı.

Kod yapısı elde yazılarak projeye uygun şekilde düzenlendi.

Ayrıca:

- mevcut proje yapısı korunmaya çalışıldı
- hata mesajları projeye uygun şekilde özelleştirildi

Bu nedenle AI yalnızca rehber olarak kullanıldı.