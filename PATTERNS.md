# Faz 1 - Creational Pattern

## Kullanılan Tasarım Örüntüsü

Factory Method

---

## Nerede Kullanıldı

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

## Neden Kullanıldı

Projede nesne oluşturma işlemleri Main sınıfı içinde dağınık haldeydi.

Bu durum:

- Main sınıfının fazla sorumluluk üstlenmesine
- kod tekrarına
- bakım maliyetinin artmasına
- sistemin genişletilebilirliğinin azalmasına

neden olmaktaydı.

Factory Method kullanılarak nesne oluşturma sorumluluğu ayrı bir sınıfa taşındı.

---

## Kazanımlar

Factory Method kullanılması ile:

- nesne oluşturma merkezi hale geldi
- Main sınıfının sorumluluğu azaldı
- kod okunabilirliği arttı
- yeni karakter eklemek kolaylaştı
- hata yönetimi geliştirildi

---

## Önceki Yapı

```text
Main
 └── new OyunNesnesi(...)
```

---

## Sonraki Yapı

```text
Main
 └── KarakterFabrikasi
       └── OyunNesnesi
```

---

# UML Diyagramları

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

---

# Faz 2 - Structural Patterns

## Kullanılan Tasarım Örüntüleri

- Adapter Pattern
- Facade Pattern

---

# Faz 2 - Adapter Pattern

## Nerede Kullanıldı

Adapter Pattern, farklı saldırı sistemlerini ortak bir yapı altında çalıştırmak için kullanıldı.

Bu amaçla:

```java
SavasSistemi
```

arayüzü oluşturuldu.

Ayrıca:

```java
MeleeAdapter
```

sınıfı yazılarak mevcut saldırı sistemi adapte edildi.

---

## Kullanılan Yapı

```java
public interface SavasSistemi {

    void saldir();
}
```

```java
public class MeleeAdapter implements SavasSistemi {

    private OyunNesnesi karakter;

    public MeleeAdapter(OyunNesnesi karakter) {
        this.karakter = karakter;
    }

    @Override
    public void saldir() {
        karakter.saldir();
    }
}
```

---

## Neden Kullanıldı

Projede saldırı sistemi doğrudan OyunNesnesi sınıfına bağlıydı.

Bu yapı:

- farklı saldırı türleri eklemeyi zorlaştırıyordu
- sistemi genişletmeyi zorlaştırıyordu
- bağımlılığı artırıyordu

İleride:

- menzilli saldırılar
- büyü sistemleri
- farklı savaş mekanikleri

eklenmek istendiğinde mevcut yapı yetersiz kalacaktı.

Adapter Pattern kullanılarak saldırı sistemi soyutlandı.

---

## Kazanımlar

Adapter Pattern kullanılması ile:

- saldırı sistemi ortak arayüz altında toplandı
- yeni savaş sistemleri kolay eklenebilir hale geldi
- mevcut kod kırılmadan genişleme sağlandı
- bağımlılık azaltıldı
- kod daha esnek hale geldi

---

## Önceki Yapı

```text
Main
 └── OyunNesnesi.saldir()
```

---

## Sonraki Yapı

```text
Main
 └── SavasSistemi
        └── MeleeAdapter
                └── OyunNesnesi
```

---

# Faz 2 - Facade Pattern

## Nerede Kullanıldı

Facade Pattern, oyun işlemlerini merkezi bir yapıdan yönetmek için kullanıldı.

Bu amaçla:

```java
OyunFacade
```

sınıfı oluşturuldu.

Main sınıfı artık doğrudan:

- karakter oluşturma
- saldırı sistemi oluşturma
- saldırıyı çalıştırma

işlemleriyle ilgilenmemektedir.

---

## Kullanılan Yapı

```java
public class OyunFacade {

    public void karakteriCalistir(String tur, int can, int hasar) {

        OyunNesnesi karakter =
                new OyunNesnesi(tur, can, hasar);

        SavasSistemi savas =
                new MeleeAdapter(karakter);

        karakter.bilgiGoster();
        savas.saldir();

        System.out.println();
    }
}
```

---

## Neden Kullanıldı

Main sınıfı sistemin tüm detaylarını bilmekteydi.

Bu durum:

- karmaşıklığı artırıyordu
- bakım maliyetini yükseltiyordu
- kod okunabilirliğini azaltıyordu

Facade Pattern kullanılarak tüm işlemler tek bir merkezde toplandı.

---

## Kazanımlar

Facade Pattern kullanılması ile:

- Main sınıfı sadeleşti
- sistemin karmaşıklığı azaltıldı
- kod okunabilirliği arttı
- bakım kolaylaştı
- sistem daha düzenli hale geldi

---

## Önceki Yapı

```text
Main
 ├── OyunNesnesi
 ├── MeleeAdapter
 └── SavasSistemi
```

---

## Sonraki Yapı

```text
Main
 └── OyunFacade
        ├── OyunNesnesi
        ├── SavasSistemi
        └── MeleeAdapter
```

---

# Faz 2 UML Diyagramları

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
+----------------+
| OyunFacade     |
+----------------+
| karakteriCalistir() |
+----------------+
     |
     +----------------------+
     |                      |
     v                      v
+----------------+    +----------------+
| SavasSistemi   |    | OyunNesnesi    |
+----------------+    +----------------+
| saldir()       |    | tur            |
+----------------+    | can            |
                      | hasar          |
                      +----------------+
                              ^
                              |
                     +----------------+
                     | MeleeAdapter   |
                     +----------------+
                     | saldir()       |
                     +----------------+
```

---

# Faz 2 UML Değerlendirmesi

Önceki yapıda Main sınıfı sistemin tüm detaylarını yönetmekteydi.

Bu durum:

- bağımlılığı artırmakta
- sistemi karmaşıklaştırmakta
- yeni özellik eklemeyi zorlaştırmakta

idi.

Adapter Pattern ile saldırı sistemi soyutlanmıştır.

Facade Pattern ile ise sistemin karmaşık yapısı tek merkezden yönetilir hale getirilmiştir.

Böylece:

- sistem daha modüler hale gelmiş
- yeni özellik eklemek kolaylaşmış
- mevcut kod kırılmadan geliştirme yapılabilmiş
- bağımlılıklar azaltılmıştır.
