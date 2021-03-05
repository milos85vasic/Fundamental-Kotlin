package net.milosvasic.fundamental.kotlin.annotations

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.LOCAL_VARIABLE
)
annotation class Descriptor(val description: String)

fun main() {

    class Product(val id: Long)

    class Processor {

        fun process(products: List<Product>) {

            products.forEach {

                println("Processing product, ID: ${it.id}")
                val ann = it::class.annotations
                println(ann)
            }
        }
    }

    var id = 0L

    @Descriptor(description = "The Car")
    val car = Product(++id)

    val products = listOf(car)
    val processor = Processor()

    processor.process(products)
}