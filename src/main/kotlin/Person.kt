sealed class PersonImpl {
    abstract val name: String?
    abstract val surName: String?

    abstract fun copyS(name: String? = this.name, surName: String? = this.surName): PersonImpl

    data class Employee(
        override val name: String?,
        override val surName: String?,
        val age: Int,
    ) : PersonImpl() {
        override fun copyS(name: String?, surName: String?): PersonImpl = copy(name = name, surName = surName)
    }

    data class Client(
        override val name: String?,
        override val surName: String?,
        val gender: Gender,
    ) : PersonImpl() {
        override fun copyS(name: String?, surName: String?): PersonImpl = copy(name = name, surName = surName)
    }
}


enum class Gender {
    MALE,
    FEMALE
}