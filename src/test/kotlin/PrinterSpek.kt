import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

/**
 * Created by nikita on 01.02.17.
 */
class PrinterSpek : Spek({
    val v = "World"
    given("A printer "){
        on("Word "+v){
            val s = "'Hello, World'"
            it("Should return $s"){
                //TODO assert
            }
        }

    }

})