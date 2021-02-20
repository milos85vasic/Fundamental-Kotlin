package net.milosvasic.fundamental.kotlin.object_oriented.generics

fun main() {

    abstract class Car(var model: String) {

        abstract var name: String
    }

    class Bmw(model: String) : Car(model) {

        override var name: String = "Bmw"
    }

    class Mercedes(model: String) : Car(model) {

        override var name: String = "Mercedes"
    }

    // 'in' word means that CarWash instance will be specialized for certain car type
    // also that means that type may be consumed, but never produced!
    class CarWash<in C : Car> {

        fun washCar(car: C) {
            println("Washing ${car.name} ${car.model}")
        }
    }

    // 'out' word means that CarFactory instance will be specialized for certain car type
    // also that means that type may be produced, but never consumed!
    abstract class CarFactory<out C : Car> {

        abstract fun forgeCar(model: String): C
    }

    class BmwFactory : CarFactory<Bmw>() {

        override fun forgeCar(model: String): Bmw {
            return Bmw(model)
        }
    }

    class MercedesFactory : CarFactory<Mercedes>() {

        override fun forgeCar(model: String): Mercedes {
            return Mercedes(model)
        }
    }

    val bmwFactory = BmwFactory()
    val mercedesFactory = MercedesFactory()

    val bmw = bmwFactory.forgeCar("M4")
    val mercedes = mercedesFactory.forgeCar("AMG GT")

    val bmwCarWasher: CarWash<Bmw> = CarWash()
    val mercedesCarWasher: CarWash<Mercedes> = CarWash()
    val generalCarWasher: CarWash<Car> = CarWash()

    bmwCarWasher.washCar(bmw)
    // bmwCarWasher.washCar(mercedes) // Can't was it here! :)
    mercedesCarWasher.washCar(mercedes)
    generalCarWasher.washCar(bmw)
    generalCarWasher.washCar(mercedes)
}
