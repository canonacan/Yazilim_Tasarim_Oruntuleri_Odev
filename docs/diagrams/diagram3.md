# Faz 3 - UML Diyagramları

## Önceki Yapı

```text
+----------------+
| OyunNesnesi    |
+----------------+
| tur            |
| can            |
| hasar          |
+----------------+
| saldir()       |
+----------------+
```

---

## Sonraki Yapı

```text
+----------------+
| OyunNesnesi    |
+----------------+
| tur            |
| can            |
| hasar          |
| strateji       |
| gozlemciler    |
+----------------+
| saldir()       |
| setStrateji()  |
| gozlemciEkle() |
+----------------+
        |
        +-----------------------------+
        |                             |
        v                             v

+----------------------+     +------------------+
| SaldiriStratejisi    |     | Gozlemci         |
+----------------------+     +------------------+
| saldir()             |     | guncelle()       |
+----------------------+     +------------------+
        ^                             ^
        |                             |

 -----------------------       -------------------
 |          |          |       |                 |
 v          v          v       v                 v

+-------------+ +-------------+ +-------------+ +------------------+
| Kilic       | | Ok          | | Buyu        | | SavasLoglayici  |
| Saldirisi   | | Saldirisi   | | Saldirisi   | +------------------+
+-------------+ +-------------+ +-------------+
```

---

# Faz 3 UML Değerlendirmesi

Önceki yapıda saldırı davranışları doğrudan sınıf içerisinde tanımlanmaktaydı.

Bu durum:

- yeni saldırı türü eklemeyi zorlaştırmakta
- if-else bağımlılığını artırmakta
- Open Closed Principle ilkesini ihlal etmekte

idi.

Strategy Pattern uygulanarak saldırı davranışları ayrı strateji sınıflarına ayrılmıştır.

Observer Pattern ile sistemde gerçekleşen olayların merkezi olarak izlenmesi sağlanmıştır.

Böylece:

- yeni saldırı türleri mevcut kod değiştirilmeden eklenebilir hale gelmiş
- sistem Open Closed Principle prensibine uygun hale getirilmiş
- log sistemi merkezi hale getirilmiş
- sistem daha genişletilebilir ve modüler hale getirilmiştir.