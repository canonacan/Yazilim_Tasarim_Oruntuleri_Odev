# Faz 2 AI Kullanım Kaydı

## Sorulan Soru

"Adapter pattern burada uygun mu, yoksa Facade mı? Farkını açıkla."

---

## AI Yanıt Özeti

AI, Adapter Pattern'in farklı sistemleri ortak bir arayüz altında çalıştırmak için uygun olduğunu belirtti.

Facade Pattern'in ise karmaşık işlemleri tek merkezden yönetmek amacıyla kullanıldığını açıkladı.

Adapter Pattern:
- uyumsuz yapıları birleştirir
- mevcut sistemi değiştirmeden yeni sistem eklenmesini sağlar

Facade Pattern:
- karmaşık sistemi sadeleştirir
- alt sistemleri tek noktadan yönetir

---

## Uygulanan Çözüm

Projede iki örüntü birlikte kullanıldı.

Adapter Pattern:
- saldırı sistemini soyutlamak için kullanıldı
- SavasSistemi arayüzü oluşturuldu
- MeleeAdapter sınıfı yazıldı

Facade Pattern:
- oyun işlemlerini merkezi hale getirmek için kullanıldı
- OyunFacade sınıfı oluşturuldu

---

## AI Önerisinden Farklı Yapılan Noktalar

AI yalnızca genel örüntü açıklamaları verdi.

Projede ise:
- mevcut oyun yapısına uygun özel sınıflar geliştirildi
- saldırı sistemi oyuna özel şekilde tasarlandı
- facade yapısı doğrudan oyun akışına göre düzenlendi

Kodlar doğrudan AI'dan kopyalanmadı.
Önce mantık analiz edildi, ardından projeye uygun şekilde yeniden geliştirildi.

---

## AI'ın Eksik veya Yanlış Önerileri

AI, başlangıçta yalnızca tek örüntü kullanımını yeterli görmüştü.

Ancak projede:
- hem Adapter
- hem Facade

birlikte kullanılarak daha modüler ve genişletilebilir bir yapı oluşturuldu.

Ayrıca AI, mevcut oyun sistemindeki bağımlılık seviyesini tam analiz edemediği için facade kullanımının sağlayacağı sadeleşmeyi yeterince detaylandırmadı.