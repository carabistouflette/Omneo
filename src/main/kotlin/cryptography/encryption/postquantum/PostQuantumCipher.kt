package main.kotlin.cryptography.encryption.postquantum

import main.kotlin.cryptography.encryption.Cipher

interface PostQuantumCipher : Cipher {

    /**
     * Encapsulates the plain message into a cipher message
     *
     * @param plainText the plain message
     * @return the cipher message
     */
    fun encapsulate(plainText: ByteArray): ByteArray

    /**
     * Decapsulates the cipher text into a plain message
     *
     * @param cipherText the cipher message
     * @return the plain message
     */
    fun decapsulate(cipherText: ByteArray): ByteArray
}