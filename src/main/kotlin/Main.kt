class Length(miles: Double){
    var originalMile = miles
    init{
        if(miles < 0){
            originalMile = 0.0
        }
    }
    val kilometers: Double get() = originalMile * 1.609344
    val feet: Double get() = originalMile * 5280
    val yards: Double get() = originalMile * 1760

    fun printDetails(){
        val formated = "%.3f miles => %.3f kilometers, %.3f feet, %.3f yards".format(originalMile, kilometers, feet, yards)
        println(formated)
    }
}

class Temperature(Fahrenheit: Double){
    var originalFahrenheit = Fahrenheit
    val celsius: Double get() = ((originalFahrenheit - 32) *5) / 9
    val kelvin: Double get() = (((originalFahrenheit - 32) * 5) / 9) + 273.15

    fun printDetails(){
        val formated = " %.3f Fahrenheit => %.3f Celsius , %.3f Kelvin".format(originalFahrenheit, celsius, kelvin)
        println(formated)
    }
}

class Volume(gallons: Double){
    var originalVolume = gallons
    init{
        if(gallons < 0){
            originalVolume = 0.0
        }
    }
    val liter: Double get() = (originalVolume) * 3.785411784
    val ounces: Double get() = (originalVolume) * 128
    val quart: Double get() = (originalVolume) * 4

    fun printDetails(){
        val formated = "%.3f Gallons => %.3f liters, %.3f ounces, %.3f quarts".format(originalVolume, liter, ounces, quart)
        println(formated)
    }
}

class Weight(pounds: Double){
    var originalWeight = pounds
    init{
        if(pounds < 0){
            originalWeight = 0.0
        }
    }
    val kilogram: Double get() = originalWeight * 0.45359237
    val ounce: Double get() = originalWeight * 16
    val gram: Double get() = originalWeight * 453.59237

    fun printDetails(){
        val formated = "%.3f pounds => %.3f kilograms, %.3f ounces, %.3f grams".format(originalWeight, kilogram, ounce, gram)
        println(formated)
    }
}

fun grabValue(conversion: String, base: String): Double{
    print("Enter a $conversion in $base: ")
    var baseNumber = readLine()!!.toDouble()
    return baseNumber
}

fun main(args: Array<String>) {
    var input: String? = ""
    println("Welcome to the Kotlin conversion program")
    do{
        println("=========================")
        println("Select from the following options:")
        println("\t'L' to convert length")
        println("\t'T' to convert temperature")
        println("\t'V' to convert volume")
        println("\t'W' to convert weight")
        println("\t'Q' to quit")
        print("Enter option: ")
        input = readLine()

        var numberBase: Double = 0.0
        if (input == "L"){
            numberBase = grabValue("Length", "miles")
            var conversionType = Length(numberBase)
            conversionType.printDetails()
        }else if (input == "T"){
            numberBase = grabValue("Temperature", "fahrenheit")
            var conversionType = Temperature(numberBase)
            conversionType.printDetails()
        }else if (input == "V"){
            numberBase = grabValue("Volume", "gallons")
            var conversionType = Volume(numberBase)
            conversionType.printDetails()
        }else if (input == "W"){
            numberBase = grabValue("Weight","Pounds")
            var conversionType = Weight(numberBase)
            conversionType.printDetails()
        }

    }while(input != "Q")
}