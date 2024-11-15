import fr.francoisdabonot.composelookandfeel.fibi
import fr.francoisdabonot.composelookandfeel.firstElement
import fr.francoisdabonot.composelookandfeel.secondElement
import kotlin.test.Test
import kotlin.test.assertEquals

class FibiTest {
    @Test
    fun `test 3rd element`() {
        assertEquals(firstElement + secondElement, fibi.take(3).last())
    }
}
