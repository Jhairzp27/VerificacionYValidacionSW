package epn.verif;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartWalletTest {

    private SmartWallet wallet;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        wallet = new SmartWallet(1000, "Standard");
    }

    @Test
    void testDepositoValido() {
        assertTrue(wallet.deposit(50));
        assertEquals(1050, wallet.getBalance());
    }

    @Test
    void testRetiroValido() {
        assertTrue(wallet.withdraw(500));
        assertEquals(500, wallet.getBalance());
    }

    @Test
    void testLimiteExactoDepositoCashback() {
        wallet.deposit(100); // No debería tener cashback aún
        assertEquals(1100, wallet.getBalance());
        wallet.deposit(100.01); // Debería tener cashback
        assertTrue(wallet.getBalance() > 1200);
    }

    @Test
    void testLimiteSaldoMaximoStandard() {
        SmartWallet standardWallet = new SmartWallet(4900, "Standard");
        assertFalse(standardWallet.deposit(200)); // Superaría los $5000
    }

    @Test
    void testErrorMontoNegativoDeposito() {
        assertFalse(wallet.deposit(-10));
    }

    @Test
    void testErrorSaldoInsuficienteRetiro() {
        assertFalse(wallet.withdraw(2000));
    }

    @Test
    void testEstadoInactivoAlQuedarEnCero() {
        wallet.withdraw(1000);
        assertEquals(0, wallet.getBalance());
        assertEquals("Inactiva", wallet.getStatus());
    }

    @Test
    void testCashbackDelUnoPorCiento() {
        wallet.deposit(200); // 200 + 2 de cashback
        assertEquals(1202, wallet.getBalance());
    }
}