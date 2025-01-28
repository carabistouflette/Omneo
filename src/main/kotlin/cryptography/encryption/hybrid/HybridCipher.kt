package main.kotlin.cryptography.encryption.hybrid

import main.kotlin.cryptography.encryption.Cipher


interface HybridCipher<T1 : Cipher, T2 : Cipher> : Cipher {

    /**
     * Set the first cipher
     *
     * @param cipher1 the first cipher
     */
    fun setFirstCipher(cipher1: T1)

    /**
     * Set the second cipher
     *
     * @param cipher2 the second cipher
     */
    fun setSecondCipher(cipher2: T2)
}