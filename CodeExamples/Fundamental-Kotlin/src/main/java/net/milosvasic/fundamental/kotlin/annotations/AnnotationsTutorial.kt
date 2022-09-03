package net.milosvasic.fundamental.kotlin.annotations

@Target(AnnotationTarget.CLASS)
annotation class Descriptor(val description: String)

fun main() {

    abstract class Product

    @Descriptor("vehicle")
    class Car : Product()

    @Descriptor("office device")
    class Computer : Product()

    @Descriptor("home appliance")
    class Tv : Product()

    // No annotation for this one:
    class VacuumCleaner : Product()

    class Processor {

        fun process(products: List<Product>) {

            products.forEach {

                var described = false
                val annotations = it::class.annotations
                annotations.forEach { ann ->
                    if (ann is Descriptor) {

                        described = true
                        println("Processing: ${it::class.simpleName}, ${ann.description}")
                    }
                }
                if (!described) {

                    println("Processing: ${it::class.simpleName}")
                }
            }
        }
    }

    val products = listOf(

        Tv(),
        Car(),
        Computer(),
        VacuumCleaner()
    )

    val processor = Processor()
    processor.process(products)
}