package main.kotlin.cryptography.core.cipher

import main.kotlin.cryptography.cipher.symmetric.modes.CipherMode
import main.kotlin.cryptography.core.cipher.parameters.CipherParameters
import main.kotlin.cryptography.core.types.Key

interface Cipher<KeyType : Key, Parameters : CipherParameters> {
    fun init(mode: CipherMode, key: KeyType, params: Parameters)
    fun process(data: ByteArray): ByteArray
}