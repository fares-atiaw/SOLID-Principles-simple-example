package com.example.examplesolidprinciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Using the MainRepository with the chosen arguments **/
        // val repo = MainRepository( FirebaseAuthentication() , CustomErrorFileLogger() )
         val repo = MainRepository( APIAuthentication() , CustomErrorFileLogger() )

    }
}

/*

# SOLID Principles are 5 principles/techniques for clean code
S => Single Responsibility principle (SRP)
Every class/module/function in a program should have one responsibility/purpose. “Every class should have only one reason to change”.

O => Open--Closed principle (OCP)
It refers to “open for extension, closed for modification”. Modifying in a class/module/function, affects in other classes. So, make it open for inheritance/parameters, to let the user class make its own change/modify/override within its own scale without modifying the source code.

L => Liskov Substitution Principle (LSP)
Objects of a superclass shall be replaceable with objects of its subclasses without breaking the style. That requires the objects of the subclasses to behave in the same way as the objects of the superclass, otherwise that will make a confusion.
You can achieve that by making the subclass follow the rules of its superclass (like function name ,,, [ super.fun() ] plus additional code with the same function name).

I => Interface segregation principle (ISP)
No code should be forced. Like depending on a method that will not be used. So, it splits interfaces that are very large into smaller and more specific ones so that clients will only have to know about the methods that are of interest to them.

D => Dependency Inversion Principle (DIP)	مبدأ انعكاس التبعية
It refers to the Polymorphism concept. Modules should depend on abstractions, and abstractions should not depend upon details, details should depend upon abstractions. Let Interface/Abstract-class acts as the base file of functions/attributes for the project dependencies.
So, every dependency in the design should target an interface or an abstract class. No dependency should target a concrete class. Consequently, the client class gets its dependency no matter how, as that dependency returns its needs as long it will be called with the right subclass.


 */