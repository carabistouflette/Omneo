package main.kotlin.cryptography.encryption

abstract class AbstractCipher : Cipher {

    override fun encrypt(data: ByteArray?): ByteArray? {
        if (data == null) return null

        val processedData = preprocessData(data)
        return performEncryption(processedData)
    }

    override fun decrypt(encryptedData: ByteArray?): ByteArray? {
        if (encryptedData == null) return null

        val processedData = preprocessData(encryptedData)
        return performDecryption(processedData)
    }

    private fun preprocessData(data: ByteArray): ByteArray {
        // If preprocess is needed anytime
        return data
    }

    protected abstract fun performEncryption(data: ByteArray): ByteArray?
    protected abstract fun performDecryption(encryptedData: ByteArray): ByteArray?
}