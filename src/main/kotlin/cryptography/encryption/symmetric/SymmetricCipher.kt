package main.kotlin.cryptography.encryption.symmetric

import main.kotlin.cryptography.encryption.Cipher


interface SymmetricCipher : Cipher {
    fun setKey(key: ByteArray?)
}