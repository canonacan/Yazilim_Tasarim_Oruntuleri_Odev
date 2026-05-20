# Yazılım Tasarım Örüntüleri Ödevi

Bu proje, Yazılım Tasarım Örüntüleri dersi kapsamında geliştirilmiş örnek bir savaş sistemi simülasyonudur.

Projede farklı tasarım örüntüleri kullanılarak:
- sürdürülebilir,
- genişletilebilir,
- modüler,
- SOLID prensiplerine uygun

bir mimari oluşturulmuştur.

---

# Projenin Ne Yaptığı

Bu proje basit bir savaş sistemi simülasyonu geliştirmektedir.

Sistem içerisinde:
- Karakter oluşturma
- Farklı saldırı davranışları
- Savaş log sistemi
- Genişletilebilir mimari
- Pattern tabanlı yapı

bulunmaktadır.

Oyuncu ve düşman karakterleri farklı saldırı stratejileri kullanabilmektedir.

Sistem SOLID prensiplerine uygun şekilde modüler hale getirilmiştir.

---

# Kullanılan Tasarım Örüntüleri

## 1. Factory Method Pattern

Karakter oluşturma işlemleri merkezi bir fabrika sınıfı üzerinden yapılmaktadır.

### Kullanılan Sınıf
- `KarakterFabrikasi.java`

### Avantajları
- Nesne oluşturma kontrol altına alındı
- Kod tekrarları azaltıldı
- Yeni karakter türleri kolay eklenebilir hale geldi

---

## 2. Adapter Pattern

Eski saldırı sistemi yeni arayüze adapte edilmiştir.

### Avantajları
- Eski kod korunmuştur
- Yeni sistem ile uyum sağlanmıştır
- Geçiş süreci kolaylaştırılmıştır

---

## 3. Facade Pattern

Sistemin karmaşık yapısı tek merkezden yönetilebilir hale getirilmiştir.

### Avantajları
- Kullanım kolaylaştı
- Alt sistemler sadeleştirildi
- Bağımlılıklar azaltıldı

---

## 4. Strategy Pattern

Farklı saldırı davranışları dinamik şekilde değiştirilebilir hale getirilmiştir.

### Kullanılan Sınıflar
- `SaldiriStratejisi.java`
- `KilicSaldirisi.java`
- `OkSaldirisi.java`
- `BuyuSaldirisi.java`

### Avantajları
- Open Closed Principle uygulandı
- Yeni saldırılar kolay eklenebilir hale geldi
- if-else karmaşası azaltıldı

---

## 5. Observer Pattern

Savaş sırasında gerçekleşen olaylar gözlemcilere bildirilmektedir.

### Kullanılan Sınıflar
- `Gozlemci.java`
- `SavasLoglayici.java`

### Avantajları
- Log sistemi merkezi hale geldi
- Gevşek bağlı mimari sağlandı
- Yeni gözlemciler kolay eklenebilir hale geldi

---

# Mimari Diyagram

```text
                 +------------------+
                 |   OyunNesnesi    |
                 +------------------+
                           |
        ---------------------------------------
        |                                     |
 uses Strategy                     notifies Observer
        |                                     |
        v                                     v

+-------------------+            +-------------------+
| SaldiriStratejisi |            |     Gozlemci      |
+-------------------+            +-------------------+
        ^                                     ^
        |                                     |
 -------------------                -------------------
 |        |       |                |                 |
 v        v       v                v                 v

Kilic   Ok     Buyu         SavasLoglayici
```

---

# Proje Yapısı

```text
src/
 └── oyun/
      ├── Main.java
      ├── OyunNesnesi.java
      ├── KarakterFabrikasi.java
      ├── SaldiriStratejisi.java
      ├── KilicSaldirisi.java
      ├── OkSaldirisi.java
      ├── BuyuSaldirisi.java
      ├── Gozlemci.java
      └── SavasLoglayici.java
```

---

# Nasıl Çalıştırılır

## Gereksinimler

- Java 11+
- VS Code veya IntelliJ IDEA
- Git

---

## Projeyi Çalıştırma

Terminal üzerinden:

```bash
javac src/oyun/*.java
java -cp src oyun.Main
```

---

# Örnek Çıktı

```text
Tür: oyuncu
Can: 100
Hasar: 20
oyuncu kilic ile saldirdi!
LOG: oyuncu saldiri yapti

Tür: goblin
Can: 50
Hasar: 10
goblin ok ile saldirdi!
LOG: goblin saldiri yapti
```

---

# Git Branch Yapısı

- `main` → final stabil sürüm
- `phase-1` → Creational Pattern geliştirmeleri
- `phase-2` → Structural Pattern geliştirmeleri
- `phase-3` → Behavioral Pattern geliştirmeleri

---

# CI Süreci

Projede GitHub Actions kullanılmıştır.

Her push işleminde:
- Java kurulumu yapılır
- Kod derlenir
- Derleme kontrol edilir

Başarısız build durumunda GitHub Actions hata verir.

---

# AI Kullanımı

AI yalnızca:
- Pattern seçimi
- Mimari öneriler
- Dokümantasyon desteği

amaçlı kullanılmıştır.

---

# Geliştirici

Muhammed Can Önaçan