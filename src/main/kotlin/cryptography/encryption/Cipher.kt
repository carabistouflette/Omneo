package main.kotlin.cryptography.encryption

interface Cipher {

    /**
     * Encrypts the given data using the cipher.
     *
     * @param data the data to encrypt
     * @return the encrypted data
     */
    fun encrypt(data: ByteArray?): ByteArray?

    /**
     * Decrypts the given encrypted data using the cipher.
     *
     * @param encryptedData the encrypted data to decrypt
     * @return the decrypted data
     */
    fun decrypt(encryptedData: ByteArray?): ByteArray?
}