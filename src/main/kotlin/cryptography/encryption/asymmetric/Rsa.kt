package main.kotlin.cryptography.encryption.asymmetric

import main.kotlin.cryptography.encryption.AbstractCipher


class Rsa : AbstractAsymmetricCipher() {

    override fun performEncryption(data: ByteArray?): ByteArray? {
        // Implémentation de l'encryption RSA
        return data // Placeholder
    }

    override fun performDecryption(encryptedData: ByteArray?): ByteArray? {
        // Implémentation de la décryption RSA
        return encryptedData // Placeholder
    }
}