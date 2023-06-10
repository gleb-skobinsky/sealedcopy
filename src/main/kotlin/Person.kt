sealed class PersonImpl {
    abstract val name: String?
    abstract val surName: String?

    abstract fun copySealed(name: String? = this.name, surName: String? = this.surName): PersonImpl

    data class Employee(
        override val name: String?,
        override val surName: String?,
        val age: Int,
    ) : PersonImpl() {
        override fun copySealed(name: String?, surName: String?): PersonImpl {
            return copy(name = name, surName = surName)
        }
    }

    data class Client(
        override val name: String?,
        override val surName: String?,
        val gender: Gender,
    ) : PersonImpl() {
        override fun copySealed(name: String?, surName: String?): PersonImpl {
            return copy(name = name, surName = surName)
        }
    }
}


enum class Gender {
    MALE,
    FEMALE
}