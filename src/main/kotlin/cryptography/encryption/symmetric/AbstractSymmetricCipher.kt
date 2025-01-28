package main.kotlin.cryptography.encryption.symmetric

import main.kotlin.cryptography.encryption.AbstractCipher

abstract class AbstractSymmetricCipher : AbstractCipher(), SymmetricCipher {
    protected var key: ByteArray? = null

    override fun setKey(key: ByteArray?) {
        this.key = key
    }
}