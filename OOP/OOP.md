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