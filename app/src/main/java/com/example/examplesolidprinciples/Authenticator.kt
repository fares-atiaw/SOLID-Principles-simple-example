package com.example.examplesolidprinciples

/** This will be the default dependency **/

interface Authenticator {

    fun signInAndSignUp(email: String, password: String) : Boolean
}

/** These will be the changeable dependencies  **/

class FirebaseAuthentication : Authenticator{

    override fun signInAndSignUp(email: String, password: String) : Boolean
    {
        // Firebase authentication process
        return true
    }

}

class APIAuthentication : Authenticator{

    override fun signInAndSignUp(email: String, password: String) : Boolean
    {
        // API authentication process
        return true
    }

}