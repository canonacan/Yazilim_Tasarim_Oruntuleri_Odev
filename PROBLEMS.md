# Faz 0 - Tasarım Problemlerinin Analizi

# Kendi Tespit Ettiğim Problemler

## 1. If-Else Zinciri Kullanımı

Karakter davranışları if-else blokları ile kontrol edilmektedir.

Örnek:

```java
if(tur.equals("goblin"))
```

Yeni karakterler eklendikçe if-else yapısı büyüyecek ve kodun okunabilirliği azalacaktır.

Bu durum bakım maliyetini artırmaktadır.

---

## 2. Open/Closed Principle (OCP) İhlali

Sisteme yeni karakter eklemek için mevcut kod değiştirilmektedir.

Yeni bir karakter eklendiğinde mevcut saldırı metoduna yeni kontrol eklemek gerekmektedir.

Bu durum Open/Closed Principle (OCP) ilkesine aykırıdır.

Çünkü yazılım genişletmeye açık ancak mevcut kodu değiştirmeye kapalı olmalıdır.

---

## 3. Single Responsibility Principle (SRP) İhlali

OyunNesnesi sınıfı birden fazla sorumluluğa sahiptir.

Sınıf:
- karakter bilgilerini tutuyor
- saldırı davranışını yönetiyor
- karakter bilgilerini ekrana yazdırıyor
- karakter türü kontrolü yapıyor

Bu durum Single Responsibility Principle (SRP) ilkesine aykırıdır.

Bir sınıfın yalnızca tek bir sorumluluğu olmalıdır.

---

## 4. Tür Kontrolü Kullanımı

Karakter davranışları string tabanlı kontrol edilmektedir.

Örnek:

```java
if(tur.equals("ork"))
```

Bu yapı polymorphism yerine manuel kontrol kullandığı için esnek değildir.

Ayrıca yazım hatalarına açık bir yapı oluşturmaktadır.

---

## 5. Nesne Oluşturma Problemi

Main sınıfı içinde nesneler doğrudan oluşturulmaktadır.

Örnek:

```java
new OyunNesnesi(...)
```

Bu durum nesne oluşturma sorumluluğunun dağınık hale gelmesine neden olmaktadır.

Sistem büyüdükçe nesne yönetimi zorlaşacaktır.

---

## 6. Sıkı Bağlılık Problemi

Main sınıfı doğrudan OyunNesnesi sınıfına bağlıdır.

Bu durum sınıflar arasında sıkı bağlılık oluşturmaktadır.

Bir sınıfta yapılan değişiklik diğer sınıfları da etkileyebilir.

---

# AI Analizi

AI aracına sorulan soru:

"Bu kodda hangi tasarım sorunlarını görüyorsun? Hangi tasarım örüntüleri bu sorunları çözebilir? Her sorun için kısa bir açıklama yaz."

AI tarafından tespit edilen problemler:

## 1. If-Else Karmaşası

Karakter davranışları if-else ile kontrol edilmektedir.

Bu durum sistem büyüdükçe kod karmaşasına neden olabilir.

AI önerisi:
- Strategy Pattern
- State Pattern

---

## 2. OCP İhlali

Yeni karakter eklemek için mevcut kod değiştirilmektedir.

AI önerisi:
- Strategy Pattern
- Factory Method

---

## 3. Nesne Oluşturma Problemi

Nesneler Main sınıfı içinde doğrudan oluşturulmaktadır.

AI önerisi:
- Factory Method

---

## 4. Tek Sınıfta Fazla Sorumluluk

OyunNesnesi sınıfı birden fazla görev üstlenmektedir.

AI önerisi:
- Strategy Pattern
- State Pattern

---

## 5. Sıkı Bağlılık Problemi

Sınıflar birbirine doğrudan bağlıdır.

AI önerisi:
- Factory Method
- Dependency Injection

---

## 6. Tür Kontrolü Problemi

Karakter davranışları string tabanlı kontrol edilmektedir.

AI önerisi:
- Polymorphism
- Strategy Pattern

---

## 7. Encapsulation Eksikliği

Sınıf değişkenleri doğrudan erişime açıktır.

Örnek:

```java
String tur;
int can;
int hasar;
```

Bu durum veri güvenliğini azaltmaktadır.

AI önerisi:
- private erişim belirleyicileri kullanılması
- getter/setter yapısı oluşturulması

---

# Karşılaştırma

Kendi analizim ile AI analizi büyük oranda benzerdir.

Her iki analizde de:
- if-else kullanımının problem oluşturduğu
- sistemin genişletilebilir olmadığı
- OCP ve SRP ihlallerinin bulunduğu
- sıkı bağlılık problemlerinin olduğu

tespit edilmiştir.

Ancak kendi analizimde:
- SOLID prensipleri
- polymorphism eksikliği
- string tabanlı kontrol problemleri
- bakım maliyetleri

daha detaylı ele alınmıştır.

AI tarafından önerilen:
- Strategy Pattern
- Factory Method
- State Pattern
- Dependency Injection

örüntülerinin bu sistem için uygun olduğu düşünülmektedir.

---

# Sonuç

Yapılan analiz sonucunda mevcut sistemin büyümeye açık olmadığı görülmüştür.

Özellikle:
- if-else kullanımının artması
- yeni karakter eklerken mevcut kodun değiştirilmesi
- sınıfların fazla sorumluluk üstlenmesi
- sıkı bağlılık oluşması

gibi problemler tespit edilmiştir.

Bu problemleri çözmek için:
- Strategy Pattern
- Factory Method
- Polymorphism
- Dependency Injection

yaklaşımlarının uygun olduğu değerlendirilmiştir.

Bu tasarım örüntülerinin ve nesne yönelimli yaklaşımların kullanılması ile sistemin:
- daha okunabilir
- daha sürdürülebilir
- daha genişletilebilir

hale geleceği düşünülmektedir.