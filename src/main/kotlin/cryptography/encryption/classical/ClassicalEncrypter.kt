package main.kotlin.cryptography.encryption.classical

import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import main.kotlin.cryptography.encryption.Encrypter

abstract class ClassicalEncrypter : Encrypter {

    /* redefinable properties */
    protected abstract val algorithm: String
    protected open val keySize = 128

    private val cipher = Cipher.getInstance(algorithm)
    private val secretKey: SecretKey

    init {
        val keyGen = KeyGenerator.getInstance(algorithm)
        keyGen.init(keySize)
        secretKey = keyGen.generateKey()
    }

    override fun encrypt(data: ByteArray): ByteArray {
        cipher.init(Cipher.ENCRYPT_MODE, secretKey)
        return cipher.doFinal(data)
    }

    override fun decrypt(data: ByteArray): ByteArray {
        cipher.init(Cipher.DECRYPT_MODE, secretKey)
        return cipher.doFinal(data)
    }
}