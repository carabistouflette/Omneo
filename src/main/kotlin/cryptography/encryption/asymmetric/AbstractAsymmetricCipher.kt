package main.kotlin.cryptography.encryption.asymmetric

import main.kotlin.cryptography.encryption.AbstractCipher

abstract class AbstractAsymmetricCipher : AbstractCipher(), AsymmetricCipher {

    protected var publicKey: ByteArray? = null
    protected var privateKey: ByteArray? = null

    override fun setPublicKey(publicKey: ByteArray?) {
        this.publicKey = publicKey
    }

    override fun setPrivateKey(privateKey: ByteArray?) {
        this.privateKey = privateKey
    }
}