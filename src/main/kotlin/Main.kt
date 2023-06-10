fun main(args: Array<String>) {
    val people = listOf(
        PersonImpl.Employee(
            "Петр",
            "Петров",
            26
        ),
        PersonImpl.Client(
            "Анна",
            "Кузнецова",
            Gender.FEMALE
        )
    )
    println(people[0])
    println(people[0].copySealed(name = "Иван", surName = null))

}
