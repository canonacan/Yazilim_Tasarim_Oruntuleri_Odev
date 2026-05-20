# Phase 3 - Behavioral Patterns

## AI Pair Programming Session

Bu fazda ChatGPT ile birlikte behavioral pattern seçimleri tartışıldı ve sistemin genişletilebilir hale getirilmesi amaçlandı.

Yaklaşık 30 dakika boyunca aşağıdaki konular üzerinde pair programming yapıldı:

- Strategy Pattern kullanımı
- Observer Pattern kullanımı
- OCP (Open/Closed Principle) uygulanması
- GitHub Actions CI pipeline kurulumu
- Commit düzeni ve branch yapısı

---

## Sorulan Sorular

### Strategy Pattern

Soru:
"Yeni saldırı türleri eklemek için en uygun behavioral pattern hangisidir?"

AI cevabı:
Strategy Pattern önerildi çünkü saldırı davranışları birbirinden bağımsız şekilde değiştirilebilir hale geliyor.

Uygulanan çözüm:
Her saldırı türü için ayrı sınıf oluşturuldu:
- KilicSaldirisi
- OkSaldirisi
- BuyuSaldirisi

Böylece mevcut kod değiştirilmeden yeni saldırılar eklenebilir hale geldi.

---

### Observer Pattern

Soru:
"Savaş sırasında log sistemi nasıl gevşek bağlı hale getirilebilir?"

AI cevabı:
Observer Pattern önerildi. Böylece savaş olayları gözlemcilere bildirilebilir hale geldi.

Uygulanan çözüm:
- Gozlemci interface'i oluşturuldu
- SavasLoglayici sınıfı eklendi
- OyunNesnesi içerisine gözlemci sistemi eklendi

Karakter saldırı yaptığında log sistemi otomatik olarak bilgilendirilmektedir.

---

## OCP (Open Closed Principle)

Sistem mevcut kod değiştirilmeden genişletilebilir hale getirildi.

Örneğin:
Yeni bir saldırı türü eklemek için sadece yeni bir Strategy sınıfı oluşturmak yeterlidir.

Mevcut sınıflar değiştirilmemektedir.

---

## AI'ın Yanılttığı Noktalar

AI başlangıçta saldırı sistemini if-else blokları ile geliştirmeyi önerdi.

Bu yaklaşım OCP prensibine uygun olmadığı için reddedildi ve Strategy Pattern tercih edildi.

---

## AI Olmadan Tahmini Süre

AI olmadan bu fazın daha uzun süreceği düşünülmektedir.

Özellikle:
- uygun behavioral pattern seçimi
- OCP uygulaması
- GitHub Actions kurulumu

kısımlarında AI rehberliği geliştirme sürecini hızlandırmıştır.

Ancak tüm kodlar manuel olarak yazılmış ve anlaşılmadan hiçbir kod doğrudan kullanılmamıştır.