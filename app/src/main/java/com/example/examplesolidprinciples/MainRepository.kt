package com.example.examplesolidprinciples

class MainRepository(private val auth: Authenticator, private val logger: FileLogger)
{
    suspend fun loginUser(email: String, password: String)
    {
        try {
            auth.signInAndSignUp(email,password)
        }
        catch (e: Exception){
            logger.logError(e.message.toString())
        }
    }
}