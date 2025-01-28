package main.kotlin.cryptography.encryption.hybrid

import main.kotlin.cryptography.encryption.AbstractCipher
import main.kotlin.cryptography.encryption.Cipher

abstract class AbstractHybridCipher : AbstractCipher(), HybridCipher<Cipher, Cipher> {
    private var cipher1: Cipher? = null
    private var cipher2: Cipher? = null

    override fun setFirstCipher(cipher1: Cipher) {
        this.cipher1 = cipher1
    }

    override fun setSecondCipher(cipher2: Cipher) {
        this.cipher2 = cipher2
    }
}