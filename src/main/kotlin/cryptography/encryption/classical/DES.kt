package main.kotlin.cryptography.encryption.classical

import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import main.kotlin.cryptography.encryption.Encrypter

class DES : Encrypter {
    private var cipher: Cipher
    private var secretKey: SecretKey

    init {
        val keyGenerator = KeyGenerator.getInstance("DES")
        keyGenerator.init(56)
        secretKey = keyGenerator.generateKey()

        cipher = Cipher.getInstance("DES")
        cipher.init(Cipher.ENCRYPT_MODE, secretKey)
    }

    override fun encrypt(data: ByteArray): ByteArray {
        return cipher.doFinal(data)
    }

    override fun decrypt(data: ByteArray): ByteArray {
        cipher.init(Cipher.DECRYPT_MODE, secretKey)
        return cipher.doFinal(data)
    }
}