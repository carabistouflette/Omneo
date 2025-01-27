package main.kotlin.cryptography.encryption.classical.specific

import main.kotlin.cryptography.encryption.classical.ClassicalEncrypter

class DES : ClassicalEncrypter() {
    override val algorithm = "DES"
    override val keySize = 52
}