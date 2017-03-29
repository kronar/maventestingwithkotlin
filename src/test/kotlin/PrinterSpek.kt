import Printer.sayHello
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * Created by nikita on 01.02.17.
 */
class PrinterSpek : Spek({
    val word = "World"
    given("A printer") {
        on("Word $word") {
            val expected = "Hello, $word"
            it("should return '$expected'") {
                assertEquals(expected, sayHello(word))
            }
        }
    }
})
