package main.kotlin.cryptography.encryption.symmetric

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

class Aes : AbstractSymmetricCipher() {

    private val secretKeySpec = SecretKeySpec(key, "AES")

    override fun performEncryption(data: ByteArray): ByteArray? {
        val cipher = Cipher.getInstance("AES")
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec)
        return cipher.doFinal(data)
    }

    override fun performDecryption(encryptedData: ByteArray): ByteArray? {
        val cipher = Cipher.getInstance("AES")
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec)
        return cipher.doFinal(encryptedData)
    }
}