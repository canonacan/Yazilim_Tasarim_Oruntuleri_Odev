# Faz 2 - UML Diyagramları

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
| OyunFacade           |
+----------------------+
| karakteriCalistir()  |
+----------------------+
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