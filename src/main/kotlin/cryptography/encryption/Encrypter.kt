package main.kotlin.cryptography.encryption

interface Encrypter {
    fun encrypt(data: ByteArray): ByteArray
    fun decrypt(data: ByteArray): ByteArray
}