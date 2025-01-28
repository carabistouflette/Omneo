package main.kotlin.cryptography.encryption.symmetric


class Aes : AbstractSymmetricCipher() {

    override fun performEncryption(data: ByteArray?): ByteArray? {
        // Implémentation de l'encryption AES
        return data // Placeholder
    }

    override fun performDecryption(encryptedData: ByteArray?): ByteArray? {
        // Implémentation de la décryption AES
        return encryptedData // Placeholder
    }
}