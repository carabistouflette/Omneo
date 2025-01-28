package main.kotlin.cryptography.encryption


abstract class AbstractCipher : Cipher {

    override fun encrypt(data: ByteArray?): ByteArray? {
        // Implémentation de base ou logique commune
        return performEncryption(data)
    }

    override fun decrypt(encryptedData: ByteArray?): ByteArray? {
        // Implémentation de base ou logique commune
        return performDecryption(encryptedData)
    }

    protected abstract fun performEncryption(data: ByteArray?): ByteArray?
    protected abstract fun performDecryption(encryptedData: ByteArray?): ByteArray?
}