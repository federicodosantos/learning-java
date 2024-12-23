# Generic
Generic adalah kemampuan menambahkan parameter type saat membuat class atau method

## Manfaat Generic
Pengecekan ketika proses kompilasi.
Tidak perlu manual menggunakan pegecekan tipe data dan konversi tipe data.

## Generic Class
Generic class adalah class atau interface yang memiliki parameter type.
Nama generic parameter type yang biasa digunakan adalah
- E - Element(Collection atau struktur data)
- K - Key  
- N - Number
- T - Type
- V - Value

## Invariant
Secara default, saat kita membuat generic type, sifat parameter tersebut adalah invariant.
Invariant artinya tidak boleh subtitusi dengan subtype (Child) atau supertype (Parent).

## Covariant
Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent).
Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends ParentClass).
Covariant adalah read-only, jadi kita tidak bisa mengubah data genericnya.
Jadi convariant setDatanya itu tidak berbahaya tapi getDatanya yang berbahaya.

## Contravariant
Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child).
Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super Subclass).
Contravariant adalah bisa write dan read, namun perlu berhati-hati ketika melakukan read, terutama jika sampai parentnya punya banyak child.
Jadi contravariant getDatanya itu tidak berbahaya tapi setDatanya yang berbahaya.

## Bounded Type Parameter
Bounded type parameter digunakan jika kita ingin membatasi data yang boleh digunakan di generic parameter type.
Kita bisa menambahkan constraint di generic paramter type dengan menyebutkan tipe yang diperbolehkan.

## Wildcard
Wildcard digunakan jika kita tidak peduli dengan generic paramter type pada object.
Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?. 
