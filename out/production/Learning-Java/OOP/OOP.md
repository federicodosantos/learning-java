# Object Oriented Programming
Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep objek.

## Object
Object adalah data yang berisi propertis dan method. 
Semua data bukan primitif di Java adalah object, dari mulai Integer, Boolean, Character, String dan yang lainnya.

## Class
Class adalah blueprint atau prototype untuk membuat Object.
Class berisikan deklarasi semua properties dan method yang dimiliki oleh Object.
Setiap Object selalu dibuat dari Class dan juga sebuah Class bisa membuat Object tanpa batas.

## Constructor
Constructor adalah method yang akan dipanggil saat pertama kali Object dibuat.

## Inheritance
Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.
Dalam artian, kita bisa membuat class Parent dan class Child.
Dalam class Child hanya bisa mempunyai satu class Parent saja. Sedangkan, class Parent bisa memiliki banyak class Child. 
Saat melakukan pewarisan, semua atribut dan method yang ada di class Parent secara otomatis dimiliki oleh class Child.

## Super Keyword
Super keyword digunakan untuk mengakses atribut dan method yang ada pada class Parent.
Selain untuk mengakses atribut dan method, super keyword bisa digunakan untuk mengakses parent class constructor. Tapi untuk mengakses class Parent constructor itu hanya bisa dilakukan di dalam class child constructornya. 

## Polymorphism
Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
Polymorphism erat kaitannya dengan inheritance

## Access Modifier
Access modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses dari mana saja

Public = Class yang sama, package yang sama, SubClass/Turunan, Global scope
Protected = Class yang sama, package yang sama, SubClass/Turunan
Default = Class yang sama, package yang sama
Private = Class yang sama

## Abstract Class
Abstract class adalah class yang tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan.
Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk kelas child.

### Abstract Method
Abstract method adalah sebuah method dalam abstract class, dimana kita tidak boleh membuat block method untuk method tersebut.
Artinya, abstract method wajib dioverride oleh class child.
Abstract method tidak boleh memiliki access modifier private.

## Encapsulation
Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar. 
Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid.
Untuk praktiknya kita bisa membuat field yang ada di class itu menggunakan access modifier private.
Jadi untuk mendapatkan atau memodifikasi field private tersebut, kita membuat method getter dan setter.
Getter adalah function yang dibuat untuk mengambil data field.
Setter adalah function yang dibuat untuk mengubah data field.

## Interface
Interface adalah sebuah class yang diugnakan sebagai kontrak untuk class childnya. Sama seperti abstract class,
tapi yang membedakan adalah di interface, semua method otomatis abstract, tidak memiliki block dan juga di interface
tidak boleh memiliki field, kita hanya boleh memiliki constant(field yang tidak bisa diubah)

### Interface Inheritance
Pada class child kita bisa mengimplement lebih dari 1 interface. Bahkan interface pun bisa implement interface lain, bisa lebih dari 1.
Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci extends, bukan implements.

### Default Method
Default method merupakan method pada interface yang memiliki implementasi konkrit pada blocknya. 
Hal ini memungkinkan untuk kelas yang mengimplementasikan interface, tidak wajib mengoverride method tersebut
karena sudah memiliki implementasi konkrit didalamnya.

## Final Class
Final class merupakan class yang dimana dia tidak dapat diwariskan. Hal ini dapat terjadi apabila kita menambahkan
keyword final sebelum class.

## Final Method
Final method merupakan method yang dimana dia tidak bisa dioverride lagi di class childnya.
Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class childnya.

## Inner Class
Inner class merupakan class yang berada dalam sebuah class. Inner class dibuat ketika kita butuh membuat beberapa class
yang saling berhubungan dimana sebuah class tidak bisa dibuat tanpa class lain. 
Cara membuat inner class, cukup membuat di dalam blok class outer classnya.

## Anonymous Class
Anonymous class atau class tanpa nama adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi objectnya secara langsung.
Annonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract sederhana.

## Static Keyword
Static keyword merupakan kata kunci yang digunakan untuk membuat field, method atau class sehingga dapat diakses langsung
tanpa melalui objectnya.

### Static dapat digunakan di
Field yang artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.
Method yang artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
Block yang artinya block tersebut akan dieksekusi ketika sebuah class diload.
Inner class yang artinya inner class tersebut bisa diakses secara langsung langusng tanpa harus membuat outer class nya terlebih dahulu.

## Record Class
Record class merupakan kelas yang digunakan untuk mempermudah pembuatan class yang hanya berisi getter, equals, hashCode dan toString method.
Pada saat membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString dan juga constructor.

## Exception
Di java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception.
Jika ingin membuat exception, maka kita harus membuat class yang extends class Throwable.

### Membuat Exception
Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai dengan 
kata kunci throws diikuti dengan class exceptionnya.

### Try Catch Finally
Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di java.
Block finally adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak.

## Error
Error adalah jenis exception yang tidak direkomendasikan ditry-catch. Biasanya error terjadi ketika ada masalah serius dan
sangat tidak direkomendasikan untuk ditry-catch. Artinya jenis exception ini dapat mematikan aplikasi.