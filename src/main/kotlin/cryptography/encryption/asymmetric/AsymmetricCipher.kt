package main.kotlin.cryptography.encryption.asymmetric

import main.kotlin.cryptography.encryption.Cipher


interface AsymmetricCipher : Cipher {

    /**
     * Set the public key
     *
     * @param publicKey the public key
     */
    fun setPublicKey(publicKey: ByteArray?)

    /**
     * Set the private key
     *
     * @param privateKey the private key
     */
    fun setPrivateKey(privateKey: ByteArray?)
}