package main.kotlin.cryptography.encryption.classical.specific

import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import main.kotlin.cryptography.encryption.Encrypter
import main.kotlin.cryptography.encryption.classical.ClassicalEncrypter

class Blowfish : ClassicalEncrypter() {
    override val algorithm = "Blowfish"
}